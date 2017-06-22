/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klijentKontroler;

import domen.Korisnik;
import domen.Proizvod;
import domen.Proizvodjac;
import domen.Racun;
import domen.StavkaRacuna;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import request.RequestObject;
import response.ResponseObject;
import session.Session;
import util.ActionCode;

/**
 *
 * @author Milena
 */
public class KlijentKontroler {

    private static KlijentKontroler instance;

    private KlijentKontroler() {
    }

    public static KlijentKontroler getInstance() {
        if (instance == null) {
            instance = new KlijentKontroler();
        }
        return instance;
    }

    public List<Proizvod> vratiProizvode() {
        List<Proizvod> proizvodi = new ArrayList<>();
        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.VRATI_SVE_PROIZVODE);

            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            proizvodi = (List<Proizvod>) answer.getResponse();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return proizvodi;
    }

    public List<Proizvodjac> vratiSveProizvodjace() {
        List<Proizvodjac> proizvodjaci = new ArrayList<>();
        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.VRATI_SVE_PROIZVODJACE);
            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            proizvodjaci = (List<Proizvodjac>) answer.getResponse();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return proizvodjaci;
    }

    public void sacuvajProizvod(Proizvod proizvod) throws IOException {

        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.SACUVAJ_PROIZVOD);
            request.setParameter(proizvod);

            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KlijentKontroler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void izmeniProizvod(Proizvod proizvod) throws IOException {

        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.IZMENI_PROIZVOD);
            request.setParameter(proizvod);

            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KlijentKontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void obrisiProizvod(Proizvod proizvodId) throws IOException {

        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.OBRISI_PROIZVOD);
            request.setParameter(proizvodId);

            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KlijentKontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String[] vratiTipove() {
        String[] tipovi = {
            "Naocare za sunce", "Naocare za vid", "Ostali proizvodi"
        };
        return tipovi;
    }

    public void registrujKorisnika(Korisnik korisnik) throws IOException {

        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.REGISTRUJ_KORISNIKA);
            request.setParameter(korisnik);

            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KlijentKontroler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Korisnik> vratiKorisnike() {
        List<Korisnik> korisnici = new ArrayList<>();
        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.PRIJAVI_KORISNIKA);
            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            korisnici = (List<Korisnik>) answer.getResponse();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return korisnici;
    }

    public Korisnik vratiKorisnika(String korisnickoIme) {
        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.VRATI_KORISNIKA_PO_KORISNICKOM_IMENU);
            request.setParameter(korisnickoIme);
            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();

            Korisnik korisnik = (Korisnik) answer.getResponse();
            return korisnik;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    public List<Korisnik> vratiSveKorisnike() {
        List<Korisnik> korisnici = new ArrayList<>();
        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.VRATI_SVE_KORISNIKE);
            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            korisnici = (List<Korisnik>) answer.getResponse();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return korisnici;
    }

    public void sacuvajStavkeRacuna(StavkaRacuna sr) throws IOException {

        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.SACUVAJ_STAVKE_RACUNA);
            request.setParameter(sr);

            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            String message = (String) answer.getMessage();

            JOptionPane.showMessageDialog(null, message);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KlijentKontroler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sacuvajRacun(Racun racun) throws IOException {

        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.SACUVAJ_RACUN);
            request.setParameter(racun);

            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KlijentKontroler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Racun> vratiRacun() {
        List<Racun> racuni = new ArrayList<>();
        try {

            RequestObject request = new RequestObject();
            request.setAction(ActionCode.VRATI_SVE_RACUNE);
            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            racuni = (List<Racun>) answer.getResponse();

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return racuni;

    }

    public List<StavkaRacuna> vratSveStavke() {
        List<StavkaRacuna> stavke = new ArrayList<>();
        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.VRATI_STAVKE_RACUNA);
            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            stavke = (List<StavkaRacuna>) answer.getResponse();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return stavke;
    }

    public void obrisiStavkuRacuna(StavkaRacuna st) throws IOException {

        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.BRISANJE_STAVKE_RACUNA);
            request.setParameter(st);

            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KlijentKontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void obrisiRacun(Racun r) throws IOException {

        try {
            RequestObject request = new RequestObject();
            request.setAction(ActionCode.BRISANJE_RACUNA);
            request.setParameter(r);

            session.Session.getInstance().send(request);
            ResponseObject answer = Session.getInstance().recieve();
            String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KlijentKontroler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
