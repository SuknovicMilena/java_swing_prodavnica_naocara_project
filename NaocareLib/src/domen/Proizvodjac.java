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
public class Proizvodjac implements Serializable, IDomenskiObjekat {

    private int proizvodjacId;
    private String naziv;
    private String Zemlja;

    public Proizvodjac() {
    }

    public Proizvodjac(String naziv) {
        this.naziv = naziv;
    }

    public Proizvodjac(String naziv, String Zemlja) {

        this.naziv = naziv;
        this.Zemlja = Zemlja;
    }

    public Proizvodjac(int proizvodjacId, String naziv, String Zemlja) {
        this.proizvodjacId = proizvodjacId;
        this.naziv = naziv;
        this.Zemlja = Zemlja;
    }

    public String getZemlja() {
        return Zemlja;
    }

    public void setZemlja(String Zemlja) {
        this.Zemlja = Zemlja;
    }

    public int getProizvodjacId() {
        return proizvodjacId;
    }

    public void setProizvodjacId(int proizvodjacId) {
        this.proizvodjacId = proizvodjacId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv;
    }


    @Override
    public String vratiNazivTabele() {
        return "proizvodjac";
    }

    @Override
    public String vratiVrednostiZaInsert() {
        return null;
    }

    @Override
    public List<IDomenskiObjekat> vratiListu(ResultSet rs) {
        List<IDomenskiObjekat> proizvodjaci = new ArrayList<>();
        try {
            while (rs.next()) {
                Proizvodjac proizvodjac = new Proizvodjac();
                proizvodjac.setProizvodjacId(rs.getInt("proizvodjacId"));
                proizvodjac.setNaziv(rs.getString("naziv"));
                proizvodjac.setZemlja(rs.getString("zemlja"));
                proizvodjaci.add(proizvodjac);

            }
            System.out.println("Uspesno vraceni proizvodjaci.");

        } catch (SQLException ex) {
            Logger.getLogger(Proizvodjac.class.getName()).log(Level.SEVERE, null, ex);
        }
        return proizvodjaci;
    }

    @Override
    public int vratiVrednostPK() {
        return proizvodjacId;
    }

    @Override
    public String vratiPK() {
        return "proizvodjacId";
    }

    @Override
    public String vratiVrednostiZaUpdate() {
        return null;
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
