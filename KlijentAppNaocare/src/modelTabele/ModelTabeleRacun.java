/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTabele;

import domen.Korisnik;

import domen.Racun;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Milena
 */
public class ModelTabeleRacun extends AbstractTableModel {

    List<Racun> listaRacuna;
    List<Korisnik> listaKorisnika;

    public ModelTabeleRacun(List<Racun> listaRacuna, List<Korisnik> listaKorisnika) {
        this.listaRacuna = listaRacuna;
        this.listaKorisnika = listaKorisnika;
    }

    public ModelTabeleRacun() {
        listaRacuna = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        if (listaRacuna == null) {
            return 0;
        }
        return listaRacuna.size();
    }

    String kolone[] = {"Broj računa", "Datum kupovine", "Ukupan iznos", "Korisnik"};

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Racun rac = listaRacuna.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return rac.getBrojRacuna();
            case 1:

                return rac.getDatumKupovine();
            case 2:
                return rac.getUkupanIznos();

            case 3:
                return vratiImeKorisnika(rac.getKorisnik().getKorisnikId());
            default:
                return "n/a";
        }
    }

    public Racun vratiRacun(int redRacun) {
        Racun rac = new Racun();
        for (int i = 0; i < listaRacuna.size(); i++) {
            if (i == redRacun) {
                rac = listaRacuna.get(i);
                break;
            }
        }
        return rac;
    }

    public void obrisiRacun(Racun r) {
        listaRacuna.remove(r);
        fireTableDataChanged();
    }

    public String vratiImeKorisnika(int sifra) {
        for (Korisnik k : listaKorisnika) {
            if (k.getKorisnikId() == sifra) {
                return k.getIme() + " " + k.getPrezime();
            }
        }
        return null;
    }
}
