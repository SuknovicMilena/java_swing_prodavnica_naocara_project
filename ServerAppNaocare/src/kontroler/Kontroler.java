/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import businesslogic.systemoperation.ObrisiKorisnikaSO;
import businesslogic.systemoperation.AbstractSystemOperation;
import businesslogic.systemoperation.DodajRacunSO;
import businesslogic.systemoperation.DodajStavkeRacuna;
import businesslogic.systemoperation.IzmeniProizvodSO;
import businesslogic.systemoperation.ObrisiProizvodSO;
import businesslogic.systemoperation.ObrisiRacunSO;
import businesslogic.systemoperation.ObrisiStavkuRacunaSO;
import businesslogic.systemoperation.PrijaviKorisnikaSo;
import businesslogic.systemoperation.RegistrovanjeKorisnikaSo;
import businesslogic.systemoperation.VratiSveProizvodeSO;
import businesslogic.systemoperation.VratiSveProizvodjaceSO;
import businesslogic.systemoperation.SacuvajProizvodSO;
import businesslogic.systemoperation.VratiKorisnikaSO;
import businesslogic.systemoperation.VratiSveRacuneSO;
import businesslogic.systemoperation.VratiStavkeRacunaSO;
import businesslogic.systemoperation.VratiSveKorisnikeSO;
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
            VratiSveProizvodeSO so = new VratiSveProizvodeSO(new DatabaseBroker());
            so.execute(null);
            return so.getProizvodi();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja metode getAllProizvodi()");
        }

    }

    public List<Proizvodjac> vratiProizvodjace() throws Exception {

        try {
            VratiSveProizvodjaceSO so = new VratiSveProizvodjaceSO(new DatabaseBroker());
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
        AbstractSystemOperation so = new SacuvajProizvodSO(dBBroker);
        so.execute(proizvod);

    }

    public void sacuvajProizvode(List<Proizvod> proizvodi) throws Exception {
        // DBBroker.sacuvajPartnere(partneri);
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new SacuvajProizvodSO(dBBroker);
        so.execute(proizvodi);
    }

    public void izmeniProizvod(Proizvod proizvod) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new IzmeniProizvodSO(dBBroker);
        so.execute(proizvod);
    }

    public void obrisiProizvod(Proizvod selektovaniRed) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new ObrisiProizvodSO(dBBroker);
        so.execute(selektovaniRed);

    }

    public void registrujKorisnika(Korisnik korisnik) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new RegistrovanjeKorisnikaSo(dBBroker);
        so.execute(korisnik);

    }

    public List<Korisnik> vratiKorisnike() throws Exception {

        try {
            PrijaviKorisnikaSo so = new PrijaviKorisnikaSo(new DatabaseBroker());
            so.execute(null);
            return so.getKorisnici();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja.");
        }

    }

    public List<Korisnik> vratiSveKorisnike() throws Exception {

        try {
            VratiSveKorisnikeSO so = new VratiSveKorisnikeSO(new DatabaseBroker());
            so.execute(null);
            return so.getKorisnici();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja.");
        }

    }

    public void sacuvajStavkeRacuna(StavkaRacuna sr) throws Exception {

        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new DodajStavkeRacuna(dBBroker);
        so.execute(sr);
    }

    public Korisnik vratiKorisnikaPoKorisnickomImenu(String korIme) throws Exception {

        try {
            VratiKorisnikaSO so = new VratiKorisnikaSO(new DatabaseBroker());
            so.execute(korIme);
            return so.getKorisnik();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja.");
        }

    }

    public void sacuvajRacun(Racun racun) throws Exception {

        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new DodajRacunSO(dBBroker);
        so.execute(racun);
    }

    public void obrisiKorisnika(Korisnik selektovaniRed) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new ObrisiKorisnikaSO(dBBroker);
        so.execute(selektovaniRed);

    }

    public List<Racun> vratiRacune() throws Exception {

        try {
            VratiSveRacuneSO so = new VratiSveRacuneSO(new DatabaseBroker());
            so.execute(null);
            return so.getRacuni();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja.");
        }

    }

    public List<StavkaRacuna> vratiStavkeRacuna() throws Exception {

        try {
            VratiStavkeRacunaSO so = new VratiStavkeRacunaSO(new DatabaseBroker());
            so.execute(null);
            return so.getStavkeRacuna();
        } catch (Exception ex) {
            throw new Exception("Greska kod izvrsenja.");
        }

    }
      public void obrisiStavkuRacuna(StavkaRacuna selektovaniRed) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new ObrisiStavkuRacunaSO(dBBroker);
        so.execute(selektovaniRed);

    }
        public void obrisiRacun(Racun selektovaniRed) throws SQLException, IOException, Exception {
        DatabaseBroker dBBroker = new DatabaseBroker();
        AbstractSystemOperation so = new ObrisiRacunSO(dBBroker);
        so.execute(selektovaniRed);

    }

}
