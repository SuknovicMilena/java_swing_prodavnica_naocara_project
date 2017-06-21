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

    public StavkaRacuna() {
    }

    public StavkaRacuna(Racun racun, int redniBrojStavke, double iznosStavke, Proizvod proizvod) {
        this.racun = racun;
        this.redniBrojStavke = redniBrojStavke;
        this.iznosStavke = iznosStavke;
        this.proizvod = proizvod;
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
                + getIznosStavke() + "," + getProizvod().getProizvodId() + "";
    }

    @Override
    public String vratiVrednostiZaUpdate() {
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiVrednostKoloneZaFiltriranje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiSlozeniPK() {
        return " WHERE redniBrojStavke=" + redniBrojStavke
                + " AND brojRacuna=" + racun.getBrojRacuna();
    }

}
