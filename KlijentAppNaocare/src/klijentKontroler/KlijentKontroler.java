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
import request.ZahtevObjekat;
import response.OdgovorObjekat;
import session.Session;
import util.Operacije;

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
        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.VRATI_SVE_PROIZVODE);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        proizvodi = (List<Proizvod>) answer.getResponse();
        return proizvodi;
    }

    public List<Proizvodjac> vratiSveProizvodjace() {
        List<Proizvodjac> proizvodjaci = new ArrayList<>();
        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.VRATI_SVE_PROIZVODJACE);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        proizvodjaci = (List<Proizvodjac>) answer.getResponse();
        return proizvodjaci;
    }

    public void sacuvajProizvod(Proizvod proizvod) throws IOException {

        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.SACUVAJ_PROIZVOD);
        request.setParameter(proizvod);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        String message = (String) answer.getMessage();

//    JOptionPane.showMessageDialog(null, message);
    }

    public void izmeniProizvod(Proizvod proizvod) throws IOException {

        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.IZMENI_PROIZVOD);
        request.setParameter(proizvod);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
    }

    public void obrisiProizvod(Proizvod proizvodId) throws IOException {

        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.OBRISI_PROIZVOD);
        request.setParameter(proizvodId);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
    }

    public static String[] vratiTipove() {
        String[] tipovi = {
            "Naocare za sunce", "Naocare za vid", "Ostali proizvodi"
        };
        return tipovi;
    }

    public void registrujKorisnika(Korisnik korisnik) throws IOException {

        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.REGISTRUJ_KORISNIKA);
        request.setParameter(korisnik);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
    }

    public List<Korisnik> vratiKorisnike() {
        List<Korisnik> korisnici = new ArrayList<>();
        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.PRIJAVI_KORISNIKA);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        korisnici = (List<Korisnik>) answer.getResponse();
        return korisnici;
    }

    public Korisnik vratiKorisnika(String korisnickoIme) {
        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.VRATI_KORISNIKA_PO_KORISNICKOM_IMENU);
        request.setParameter(korisnickoIme);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        Korisnik korisnik = (Korisnik) answer.getResponse();
        return korisnik;
    }

    public List<Korisnik> vratiSveKorisnike() {
        List<Korisnik> korisnici = new ArrayList<>();
        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.VRATI_SVE_KORISNIKE);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        korisnici = (List<Korisnik>) answer.getResponse();
        return korisnici;
    }

    public void sacuvajRacun(Racun racun) throws IOException {

        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.SACUVAJ_RACUN);
        request.setParameter(racun);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
    }

    public List<Racun> vratiRacun() {
        List<Racun> racuni = new ArrayList<>();
        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.VRATI_SVE_RACUNE);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        racuni = (List<Racun>) answer.getResponse();
        return racuni;

    }

    public List<StavkaRacuna> vratSveStavke() {
        List<StavkaRacuna> stavke = new ArrayList<>();
        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.VRATI_STAVKE_RACUNA);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        stavke = (List<StavkaRacuna>) answer.getResponse();
        return stavke;
    }

    public void obrisiStavkuRacuna(StavkaRacuna st) throws IOException {

        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.BRISANJE_STAVKE_RACUNA);
        request.setParameter(st);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
    }

    public void obrisiRacun(Racun r) throws IOException {

        ZahtevObjekat request = new ZahtevObjekat();
        request.setAction(Operacije.BRISANJE_RACUNA);
        request.setParameter(r);
        session.Session.getInstance().send(request);
        OdgovorObjekat answer = Session.getInstance().recieve();
        String message = (String) answer.getMessage();

//            JOptionPane.showMessageDialog(null, message);
    }
}
