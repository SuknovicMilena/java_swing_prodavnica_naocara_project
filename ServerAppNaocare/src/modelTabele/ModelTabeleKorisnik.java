/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTabele;

import domen.Korisnik;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student
 */
public class ModelTabeleKorisnik extends AbstractTableModel {

    List<Korisnik> korisnici;
    String[] kolone = {" Ime", "Prezime", "Korisnicko ime"};

    public ModelTabeleKorisnik(List<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public void dodajKorisnika(Korisnik korisnik) {
        korisnici.add(korisnik);
        fireTableDataChanged();
    }

    public void obrisiKorisnika(int red) {
        korisnici.remove(red);
        fireTableDataChanged();
    }

    public List<Korisnik> vratiKorisnike() {
        return korisnici;
    }

    @Override
    public int getRowCount() {
        if (korisnici == null) {
            return 0;
        }
        return korisnici.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Korisnik korisnik = korisnici.get(rowIndex);
        switch (columnIndex) {

            case 0:
                return korisnik.getIme();
            case 1:
                return korisnik.getPrezime();
            case 2:
                return korisnik.getKorisnickoIme();

            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {

        return kolone[column];
    }

}
