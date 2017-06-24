/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milena
 */
public class Proizvod implements Serializable, IDomenskiObjekat {

    private int proizvodId;
    private String nazivProizvoda;
    private double cena;
    private String boja;
    private String tip;
    private Proizvodjac proizvodjac;

    public Proizvod() {
    }

    //konstruktor bez ID-ja
    public Proizvod(String nazivProizvoda, double cena, String boja, String tip, Proizvodjac proizvodjac) {

        this.nazivProizvoda = nazivProizvoda;
        this.cena = cena;
        this.boja = boja;
        this.tip = tip;
        this.proizvodjac = proizvodjac;
    }

    public Proizvod(int proizvodId, String nazivProizvoda, double cena, String boja, String tip, Proizvodjac proizvodjac) {
        this.proizvodId = proizvodId;
        this.nazivProizvoda = nazivProizvoda;
        this.cena = cena;
        this.boja = boja;
        this.tip = tip;
        this.proizvodjac = proizvodjac;
    }

    public Proizvod(int idProizvoda) {
        proizvodId = idProizvoda;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getProizvodId() {
        return proizvodId;
    }

    public void setProizvodId(int proizvodId) {
        this.proizvodId = proizvodId;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public Proizvodjac getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(Proizvodjac proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getImenaKolonaZaInsert() {
        return "nazivProizvoda, cena, boja, nazivTipa, proizvodjacId";
    }

    @Override
    public String toString() {
        return nazivProizvoda;
    }

    @Override
    public String vratiNazivTabele() {
        return "proizvod";
    }

    @Override
    public String vratiVrednostiZaInsert() {
        return "   " + getProizvodId() + "  ,'" + getNazivProizvoda() + "',"
                + getCena() + ",'" + getBoja() + "','" + getTip() + "'," + getProizvodjac().getProizvodjacId() + "";
    }

    @Override
    public List<IDomenskiObjekat> vratiListu(ResultSet rs) {
        List<IDomenskiObjekat> proizvodi = new ArrayList<>();
        try {
            while (rs.next()) {
                Proizvod proizvod = new Proizvod();

                proizvod.setProizvodId(rs.getInt("proizvodId"));
                proizvod.setNazivProizvoda(rs.getString("nazivProizvoda"));
                proizvod.setCena(rs.getDouble("cena"));
                proizvod.setBoja(rs.getString("boja"));
                proizvod.setTip(rs.getString("tip"));

                Proizvodjac p = new Proizvodjac();
                p.setProizvodjacId(rs.getInt("proizvodjacId"));

                proizvod.setProizvodjac(p);
                proizvodi.add(proizvod);

            }
            System.out.println("Uspesno vraceni proizvodi.");
        } catch (Exception e) {

        }
        return proizvodi;
    }

    @Override
    public int vratiVrednostPK() {
        return proizvodId;
    }

    @Override
    public String vratiPK() {
        return "proizvodId";
    }

    @Override
    public String vratiVrednostiZaUpdate() {
        return ""
                + "nazivProizvoda = '" + getNazivProizvoda() + "', " + "cena = " + getCena() + ","
                + " " + "boja = '" + getBoja() + "', " + "tip = '" + getTip() + "',"
                + " " + " proizvodjacId = " + getProizvodjac().getProizvodjacId() + " "
                + "";
    }

    @Override
    public IDomenskiObjekat vratiObjekat(ResultSet rs) {
        return null;
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
        return null;
    }

    @Override
    public int vratiBrojSlogovaVezanogObjekta() {
        return 0;
    }

    @Override
    public IDomenskiObjekat vratiSlogVezanogObjekta(int i) {
        return null;
    }
}
