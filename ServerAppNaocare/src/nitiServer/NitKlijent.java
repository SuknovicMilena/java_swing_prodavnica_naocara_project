/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nitiServer;

import domen.Korisnik;
import domen.Proizvod;
import domen.Proizvodjac;
import domen.Racun;
import domen.StavkaRacuna;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import request.RequestObject;
import response.ResponseObject;
import server.FServer;
import server.NitPokretanjeServera;
import util.ActionCode;
import util.EnumResponseStatus;

/**
 *
 * @author student
 */
public class NitKlijent extends Thread implements Serializable {

    Socket soket;
    Korisnik korisnik;
    NitPokretanjeServera pokretanjeServeraNit;
    List<Korisnik> korisnici;

    List<Korisnik> korisniciNaServeru = new ArrayList<>();
    FServer server;

    public NitKlijent(Socket soket, NitPokretanjeServera pokretanjeServeraNit, List<Korisnik> korisnici, FServer server) {
        this.soket = soket;

        this.pokretanjeServeraNit = pokretanjeServeraNit;
        this.korisnici = korisnici;

        this.server = server;
    }

    @Override
    public void run() {
        try {
            obradiKlijenta(soket);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(NitKlijent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void obradiKlijenta(Socket socket) throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("Cekam zahtev klijenta");
            ObjectInputStream inSocket = new ObjectInputStream(socket.getInputStream());
            Object object = inSocket.readObject();
            RequestObject requestObject = (RequestObject) object;

            ResponseObject responseObject = obradiZahtev(requestObject);
            ObjectOutputStream outSocket = new ObjectOutputStream(socket.getOutputStream());
            outSocket.writeObject(responseObject);
            outSocket.flush();
        }
    }

    private ResponseObject obradiZahtev(RequestObject requestObject) throws IOException {
        ResponseObject responseObject = new ResponseObject();

        int akcija = requestObject.getAction();
        switch (akcija) {
            case ActionCode.VRATI_SVE_PROIZVODE:

                try {
                    List<Proizvod> proizvodi = kontroler.Kontroler.getInstance().vratiProizvode();
                    responseObject.setResponse(proizvodi);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);

                } catch (Exception ex) {
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    responseObject.setMessage(ex.getMessage());
                }

                return responseObject;
            case ActionCode.SACUVAJ_PROIZVOD:

                try {

                    Proizvod p = (Proizvod) requestObject.getParameter();
                    kontroler.Kontroler.getInstance().dodajProizvod(p);

                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setMessage(ex.getMessage());
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
                }
                return responseObject;
            case ActionCode.VRATI_SVE_PROIZVODJACE:
                try {
                    List<Proizvodjac> proizvodjaci = kontroler.Kontroler.getInstance().vratiProizvodjace();
                    responseObject.setResponse(proizvodjaci);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    responseObject.setMessage(ex.getMessage());
                }

                return responseObject;
            case ActionCode.OBRISI_PROIZVOD:
                Proizvod proizvodId = (Proizvod) requestObject.getParameter();

                try {
                    kontroler.Kontroler.getInstance().obrisiProizvod(proizvodId);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setMessage(ex.getMessage());
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
                }
                return responseObject;
            case ActionCode.IZMENI_PROIZVOD:

                try {
                    Proizvod p = (Proizvod) requestObject.getParameter();
                    kontroler.Kontroler.getInstance().izmeniProizvod(p);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setMessage(ex.getMessage());
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
                }
                return responseObject;
            case ActionCode.REGISTRUJ_KORISNIKA:

                try {

                    korisnik = (Korisnik) requestObject.getParameter();
                    kontroler.Kontroler.getInstance().registrujKorisnika(korisnik);

                    korisniciNaServeru.add(korisnik);
                    pokretanjeServeraNit.setListaKorisnika(korisniciNaServeru);

//                    server.dodajRedUTabeli(korisnik);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setMessage(ex.getMessage());
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
                }
                return responseObject;
//            case ActionCode.PRIJAVI_KORISNIKA:
//
//                try {
//                    korisnici = kontroler.Kontroler.getInstance().vratiKorisnike();
//                    responseObject.setResponse(korisnici);
//                    responseObject.setResponseStatus(EnumResponseStatus.OK);
//
//                } catch (Exception ex) {
//                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
//                    responseObject.setMessage(ex.getMessage());
//                }
//
//                return responseObject;
            case ActionCode.VRATI_SVE_KORISNIKE:

                try {
                    korisnici = kontroler.Kontroler.getInstance().vratiSveKorisnike();
                    responseObject.setResponse(korisnici);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);

                } catch (Exception ex) {
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    responseObject.setMessage(ex.getMessage());
                }

                return responseObject;
            case ActionCode.SACUVAJ_STAVKE_RACUNA:

                try {

                    StavkaRacuna sr = (StavkaRacuna) requestObject.getParameter();
                    kontroler.Kontroler.getInstance().sacuvajStavkeRacuna(sr);

                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setMessage(ex.getMessage());
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
                }

                return responseObject;
            case ActionCode.VRATI_KORISNIKA_PO_KORISNICKOM_IMENU:

                try {

                    String korisnickoIme = (String) requestObject.getParameter();
                    korisnik = kontroler.Kontroler.getInstance().vratiKorisnikaPoKorisnickomImenu(korisnickoIme);
                    if (korisnik != null) {
                        korisniciNaServeru.add(korisnik);
                        pokretanjeServeraNit.setListaKorisnika(korisniciNaServeru);
                        server.dodajRedUTabeli(korisnik);
                    }
                    responseObject.setResponse(korisnik);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setMessage(ex.getMessage());
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
                }
                return responseObject;
            case ActionCode.SACUVAJ_RACUN:

                try {

                    Racun racun = (Racun) requestObject.getParameter();
                    kontroler.Kontroler.getInstance().sacuvajRacun(racun);

                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setMessage(ex.getMessage());
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
                }
                return responseObject;

            case ActionCode.VRATI_STAVKE_RACUNA:

                try {
                    List<StavkaRacuna> stavke = kontroler.Kontroler.getInstance().vratiStavkeRacuna();
                    responseObject.setResponse(stavke);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);

                } catch (Exception ex) {
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    responseObject.setMessage(ex.getMessage());
                }

                return responseObject;
            case ActionCode.VRATI_SVE_RACUNE:

                try {

                    List<Racun> racuni = kontroler.Kontroler.getInstance().vratiRacune();

                    responseObject.setResponse(racuni);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setMessage(ex.getMessage());
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
                }
                return responseObject;
            case ActionCode.BRISANJE_STAVKE_RACUNA:
                StavkaRacuna st = (StavkaRacuna) requestObject.getParameter();

                try {
                    kontroler.Kontroler.getInstance().obrisiStavkuRacuna(st);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setMessage(ex.getMessage());
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
                }
                return responseObject;
            case ActionCode.BRISANJE_RACUNA:
                Racun r = (Racun) requestObject.getParameter();

                try {
                    kontroler.Kontroler.getInstance().obrisiRacun(r);
                    responseObject.setResponseStatus(EnumResponseStatus.OK);
                } catch (Exception ex) {
                    responseObject.setMessage(ex.getMessage());
                    responseObject.setResponseStatus(EnumResponseStatus.ERROR);
                    Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
                }
                return responseObject;
            default:
                return responseObject;

        }
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Socket getSoket() {
        return soket;
    }

    public void setSoket(Socket soket) {
        this.soket = soket;
    }

}
