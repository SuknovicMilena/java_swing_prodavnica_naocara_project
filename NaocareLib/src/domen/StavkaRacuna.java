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
public class StavkaRacuna implements Serializable, IDomenskiObjekat {

    private Racun racun;
    private int redniBrojStavke;
    private double iznosStavke;
    private Proizvod proizvod;
    private int kolicina;

    public StavkaRacuna() {
    }

    public StavkaRacuna(Racun racun, int redniBrojStavke, double iznosStavke, Proizvod proizvod, int kolicina) {
        this.racun = racun;
        this.redniBrojStavke = redniBrojStavke;
        this.iznosStavke = iznosStavke;
        this.proizvod = proizvod;
        this.kolicina = kolicina;
    }

    public double getIznosStavke() {
        return iznosStavke;
    }

    public void setIznosStavke(double iznosStavke) {
        this.iznosStavke = iznosStavke;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public int getRedniBrojStavke() {
        return redniBrojStavke;
    }

    public void setRedniBrojStavke(int redniBrojStavke) {
        this.redniBrojStavke = redniBrojStavke;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    @Override
    public String vratiNazivTabele() {
        return "stavkaRacuna";
    }

    @Override
    public String vratiVrednostiZaInsert() {
        return "" + getRedniBrojStavke() + "," + racun.getBrojRacuna() + ","
                + (proizvod.getCena() * getKolicina()) + "," + getProizvod().getProizvodId() + "," + getKolicina() + "";
    }

    @Override
    public String vratiVrednostiZaUpdate() {
        return null;
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
        final StavkaRacuna other = (StavkaRacuna) obj;
        if (!Objects.equals(this.proizvod.getProizvodId(), other.proizvod.getProizvodId())) {
            return false;
        }
        return true;
    }

    @Override
    public List<IDomenskiObjekat> vratiListu(ResultSet rs) {
        List<IDomenskiObjekat> stavke = new ArrayList<>();

        try {
            while (rs.next()) {
                StavkaRacuna st = new StavkaRacuna();

                try {
                    st.setRedniBrojStavke(rs.getInt("redniBrojStavke"));
                } catch (SQLException ex) {
                    Logger.getLogger(Korisnik.class.getName()).log(Level.SEVERE, null, ex);
                }
                Racun racun = new Racun();
                racun.setBrojRacuna(rs.getInt("brojRacuna"));
                st.setRacun(racun);

                st.setIznosStavke(rs.getDouble("iznosStavke"));
                Proizvod proizvod = new Proizvod();

                proizvod.setProizvodId(rs.getInt("proizvodId"));

                st.setProizvod(proizvod);
                st.setKolicina(rs.getInt("kolicina"));
                stavke.add(st);

            }
            System.out.println("Uspesno vracene sve stavke racuna.");
        } catch (SQLException ex) {
            Logger.getLogger(Korisnik.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Korisnik.class.getName()).log(Level.SEVERE, null, ex);
        }

        return stavke;
    }

    @Override
    public IDomenskiObjekat vratiObjekat(ResultSet rs) {
        return null;
    }

    @Override
    public int vratiVrednostPK() {
        return 0;
    }

    @Override
    public String vratiPK() {
        return "redniBrojStavke,brojRacuna";
    }

    @Override
    public String vratiKolonuZaFiltriranje() {
        return null;
    }

    @Override
    public String vratiVrednostKoloneZaFiltriranje() {
        return null;
    }

    @Override
    public String vratiSlozeniPK() {
        return " WHERE redniBrojStavke=" + redniBrojStavke
                + " AND brojRacuna=" + racun.getBrojRacuna();
    }

    @Override
    public int vratiBrojSlogovaVezanogObjekta() {
        return racun.getStavkeRacuna().size();
    }

    @Override
    public IDomenskiObjekat vratiSlogVezanogObjekta(int i) {
        return racun.getStavkeRacuna().get(i);
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

}
