/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import businesslogic.systemoperation.SOObrisiKorisnika;
import businesslogic.systemoperation.AbstractSystemOperation;
import businesslogic.systemoperation.SOZapamtiRacun;
import businesslogic.systemoperation.SOIzmeniProizvod;
import businesslogic.systemoperation.SOObrisiProizvod;
import businesslogic.systemoperation.SOObrisiRacun;
import businesslogic.systemoperation.SOObrisiStavkuRacuna;

import businesslogic.systemoperation.SOZapamtiKorisnika;
import businesslogic.systemoperation.SOVratiSveProizvode;
import businesslogic.systemoperation.SOVratiSveProizvodjace;
import businesslogic.systemoperation.SOSacuvajProizvod;
import businesslogic.systemoperation.SOPrijaviKorisnika;
import businesslogic.systemoperation.SOPronadjiRacune;
import businesslogic.systemoperation.SOVratiStavkeRacuna;
import businesslogic.systemoperation.SOVratiSveKorisnike;
import db.DatabaseBroker;
import domen.Korisnik;
import domen.Proizvod;
import domen.Proizvodjac;
import domen.Racun;
import domen.StavkaRacuna;
import java.io.IOException;
import java.sql.SQLException;

import java.util.List;

/**
 *
 * @author Milena
 */
public class Kontroler {

    private static Kontroler instance;

    public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    private Kontroler() {
    }

    public List<Proizvod> vratiProizvode() throws Exception {

        try {
            SOVratiSveProizvode so = new SOVratiSveProizvode(new DatabaseBroker());
            so.execute(null);
            return so.getProizvodi();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja metode getAllProizvodi()");
        }

    }

    public List<Proizvodjac> vratiProizvodjace() throws Exception {

        try {
            SOVratiSveProizvodjace so = new SOVratiSveProizvodjace(new DatabaseBroker());
            so.execute(null);
            return so.getProizvodjac();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja metode getNazivProizvodjaci()");
        }

    }

//    public static List<Proizvod> vratiProizvode() throws IOException {
//
//        try {
//            proizvodi = new ArrayList<>();
//            DatabaseBroker dbb = new DatabaseBroker();
//            dbb.uspostaviKonekciju();
//            proizvodi = dbb.getAllProizvodi();
//            dbb.zatvoriKonekciju();
//            return proizvodi;
//        } catch (SQLException ex) {
//            Logger.getLogger(Kontroler.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return new ArrayList<>();
//    }
    public void dodajProizvod(Proizvod proizvod) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new SOSacuvajProizvod(dBBroker);
        so.execute(proizvod);

    }

    public void sacuvajProizvode(List<Proizvod> proizvodi) throws Exception {
        // DBBroker.sacuvajPartnere(partneri);
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new SOSacuvajProizvod(dBBroker);
        so.execute(proizvodi);
    }

    public void izmeniProizvod(Proizvod proizvod) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new SOIzmeniProizvod(dBBroker);
        so.execute(proizvod);
    }

    public void obrisiProizvod(Proizvod selektovaniRed) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new SOObrisiProizvod(dBBroker);
        so.execute(selektovaniRed);

    }

    public void registrujKorisnika(Korisnik korisnik) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new SOZapamtiKorisnika(dBBroker);
        so.execute(korisnik);

    }

    public List<Korisnik> vratiSveKorisnike() throws Exception {

        try {
            SOVratiSveKorisnike so = new SOVratiSveKorisnike(new DatabaseBroker());
            so.execute(null);
            return so.getKorisnici();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja.");
        }

    }

    public Korisnik vratiKorisnikaPoKorisnickomImenu(String korIme) throws Exception {

        try {
            SOPrijaviKorisnika so = new SOPrijaviKorisnika(new DatabaseBroker());
            so.execute(korIme);
            return so.getKorisnik();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja.");
        }

    }

    public void sacuvajRacun(Racun racun) throws Exception {

        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new SOZapamtiRacun(dBBroker);
        so.execute(racun);
    }

    public void obrisiKorisnika(Korisnik selektovaniRed) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new SOObrisiKorisnika(dBBroker);
        so.execute(selektovaniRed);

    }

    public List<Racun> vratiRacune() throws Exception {

        try {
            SOPronadjiRacune so = new SOPronadjiRacune(new DatabaseBroker());
            so.execute(null);
            return so.getRacuni();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja.");
        }

    }

    public List<StavkaRacuna> vratiStavkeRacuna() throws Exception {

        try {
            SOVratiStavkeRacuna so = new SOVratiStavkeRacuna(new DatabaseBroker());
            so.execute(null);
            return so.getStavkeRacuna();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja.");
        }

    }

    public void obrisiStavkuRacuna(StavkaRacuna selektovaniRed) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new SOObrisiStavkuRacuna(dBBroker);
        so.execute(selektovaniRed);

    }

    public void obrisiRacun(Racun selektovaniRed) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new SOObrisiRacun(dBBroker);
        so.execute(selektovaniRed);

    }

}
