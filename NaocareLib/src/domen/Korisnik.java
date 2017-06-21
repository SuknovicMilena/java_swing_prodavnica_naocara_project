/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Milena
 */
public class Korisnik implements Serializable, IDomenskiObjekat {

    private int korisnikId;
    private String ime;
    private String prezime;
    private String korisnickoIme;
    private String korisnickaSifra;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Korisnik(String ime, String prezime, String korisnickoIme, String korisnickaSifra) {

        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.korisnickaSifra = korisnickaSifra;

    }

    public int getKorisnikId() {
        return korisnikId;
    }

    public void setKorisnikId(int korisnikId) {
        this.korisnikId = korisnikId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getKorisnickaSifra() {
        return korisnickaSifra;
    }

    public void setKorisnickaSifra(String korisnickaSifra) {
        this.korisnickaSifra = korisnickaSifra;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Korisnik other = (Korisnik) obj;
        if (!Objects.equals(this.korisnickoIme, other.korisnickoIme)) {
            return false;
        }
        return true;
    }

    @Override
    public String vratiNazivTabele() {
        return "korisnik";
    }

    @Override
    public String vratiVrednostiZaInsert() {
        return "   " + getKorisnikId() + ", '" + getIme() + "','" + getPrezime() + "','" + getKorisnickoIme() + "','"
                + getKorisnickaSifra() + "'";
    }

    @Override
    public List<IDomenskiObjekat> vratiListu(ResultSet rs) {
        List<IDomenskiObjekat> korisnici = new ArrayList<>();

        try {
            while (rs.next()) {
                Korisnik korisnik = new Korisnik();

                try {
                    korisnik.setKorisnikId(rs.getInt("korisnikId"));
                } catch (SQLException ex) {
                    Logger.getLogger(Korisnik.class.getName()).log(Level.SEVERE, null, ex);
                }
                korisnik.setIme(rs.getString("ime"));
                korisnik.setPrezime(rs.getString("prezime"));
                korisnik.setKorisnickoIme(rs.getString("korisnickoIme"));

                korisnici.add(korisnik);

            }
            System.out.println("Uspesno vraceni klijenti.");
        } catch (SQLException ex) {
            Logger.getLogger(Korisnik.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Korisnik.class.getName()).log(Level.SEVERE, null, ex);
        }

        return korisnici;
    }

    @Override
    public int vratiVrednostPK() {
        return korisnikId;
    }

    @Override
    public String vratiPK() {
        return "korisnikId";
    }

    @Override
    public String vratiVrednostiZaUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IDomenskiObjekat vratiObjekat(ResultSet rs) {
        try {
            Korisnik korisnik = new Korisnik();
            rs.first();

            korisnik.setIme(rs.getString("ime"));
            korisnik.setPrezime(rs.getString("prezime"));
            korisnik.setKorisnickoIme(rs.getString("korisnickoIme"));
            korisnik.setKorisnickaSifra(rs.getString("korisnickaSifra"));
            System.out.println("uspesno");
            return korisnik;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }

    @Override
    public String vratiKolonuZaFiltriranje() {
        return "korisnickoIme";
    }

    @Override
    public String vratiVrednostKoloneZaFiltriranje() {
        return "korisnickoIme";
    }

    @Override
    public String vratiSlozeniPK() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
