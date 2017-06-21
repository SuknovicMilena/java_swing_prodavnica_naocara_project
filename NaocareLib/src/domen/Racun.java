/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Milena
 */
public class Racun implements Serializable, IDomenskiObjekat {

    private int brojRacuna;
    private Date datumKupovine;
    private double ukupanIznos;
    private List<StavkaRacuna> stavkeRacuna;
    private Korisnik korisnik;

    public Racun() {
        stavkeRacuna = new ArrayList<>();
    }

    public Racun(int brojRacuna, Date datumKupovine, double ukupanIznos, List<StavkaRacuna> stavkeRacuna, Korisnik korisnik) {
        this.brojRacuna = brojRacuna;
        this.datumKupovine = datumKupovine;
        this.ukupanIznos = ukupanIznos;
        this.stavkeRacuna = stavkeRacuna;
        this.korisnik = korisnik;
    }

    public List<StavkaRacuna> getStavkeRacuna() {
        return stavkeRacuna;
    }

    public void setStavkeRacuna(List<StavkaRacuna> stavkeRacuna) {
        this.stavkeRacuna = stavkeRacuna;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public Date getDatumKupovine() {
        return datumKupovine;
    }

    public void setDatumKupovine(Date datumKupovine) {
        this.datumKupovine = datumKupovine;
    }

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    @Override
    public String vratiNazivTabele() {
        return "racun";
    }

    @Override
    public String vratiVrednostiZaInsert() {
        String datum = new SimpleDateFormat("dd.MM.yyyy").format(datumKupovine);

        return " '" + datum + "'," + getUkupanIznos() + "," + getKorisnik().getKorisnikId() + "";
    }

    @Override
    public String vratiVrednostiZaUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IDomenskiObjekat> vratiListu(ResultSet rs) {
        List<IDomenskiObjekat> racuni = new ArrayList<>();

        try {
            while (rs.next()) {
                Racun racun = new Racun();

                try {
                    racun.setBrojRacuna(rs.getInt("brojRacuna"));
                } catch (SQLException ex) {
                    Logger.getLogger(Korisnik.class.getName()).log(Level.SEVERE, null, ex);
                }
                racun.setDatumKupovine(rs.getDate("datumKupovine"));
                racun.setUkupanIznos(rs.getDouble("ukupanIznos"));
                Korisnik korisnik = new Korisnik();
                korisnik.setKorisnikId(rs.getInt("korisnikId"));
                racun.setKorisnik(korisnik);
                racuni.add(racun);

                System.out.println("Uspesno vraceni racuni.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Korisnik.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Korisnik.class.getName()).log(Level.SEVERE, null, ex);
        }

        return racuni;
    }

    @Override
    public IDomenskiObjekat vratiObjekat(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int vratiVrednostPK() {
        return brojRacuna;
    }

    @Override
    public String vratiPK() {
        return "brojRacuna";
    }

    @Override
    public String vratiKolonuZaFiltriranje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiVrednostKoloneZaFiltriranje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiSlozeniPK() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
