/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTabele;

import domen.Proizvod;
import domen.Proizvodjac;

import domen.Racun;
import domen.StavkaRacuna;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student
 */
public class ModelTabeleStavkaRacuna extends AbstractTableModel {

    Racun racun;
    String[] kolone = {"Rb", "Kolicina", "Cena", "Iznos stavke", "Proizvod"};
    List<Proizvod> listaProizvoda;

    public ModelTabeleStavkaRacuna(Racun racun, List<Proizvod> listaProizvoda) {
        this.racun = racun;
        this.listaProizvoda = listaProizvoda;
    }

    @Override
    public int getRowCount() {
        if (racun == null) {
            return 0;
        }
        return racun.getStavkeRacuna().size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaRacuna stavkaRacuna = racun.getStavkeRacuna().get(rowIndex);
        switch (columnIndex) {

            case 0:
                return stavkaRacuna.getRedniBrojStavke();
            case 1:
                return stavkaRacuna.getKolicina();
            case 2:
                return vratiCenu(stavkaRacuna.getProizvod().getProizvodId());
            case 3:
                return stavkaRacuna.getKolicina() * vratiCenu(stavkaRacuna.getProizvod().getProizvodId());

            case 4:
                return vratiProizvod(stavkaRacuna.getProizvod().getProizvodId());

            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public void dodajStavku(Proizvod p, int kolicina) {
        List<StavkaRacuna> stavkeRacuna = racun.getStavkeRacuna();
        StavkaRacuna sr = null;
        for (StavkaRacuna stavkaRacuna : stavkeRacuna) {
            if (stavkaRacuna.getProizvod().equals(p)) {
                sr = stavkaRacuna;
                break;
            }
        }

        if (sr == null) {
            StavkaRacuna novaSR = new StavkaRacuna();
            novaSR.setRacun(racun);
            novaSR.setRedniBrojStavke(racun.getStavkeRacuna().size() + 1);
            novaSR.setKolicina(kolicina);
            novaSR.setProizvod(p);
            racun.getStavkeRacuna().add(novaSR);
        } else {
            sr.setKolicina(sr.getKolicina() + kolicina);
        }
        racun.setUkupanIznos(racun.getUkupanIznos() + kolicina * p.getCena());
        fireTableDataChanged();

    }

    public Racun getRacun() {
        return racun;
    }

    public List<StavkaRacuna> getStavkeRacuna() {
        return racun.getStavkeRacuna();
    }

    public StavkaRacuna vratiStavku(int red) {
        StavkaRacuna srac = new StavkaRacuna();
        for (int i = 0; i < racun.getStavkeRacuna().size(); i++) {
            if (i == red) {
                srac = racun.getStavkeRacuna().get(i);
                break;
            }
        }
        return srac;
    }

//    public void obrisiStavku(StavkaRacuna st) {
//
//        racun.getStavkeRacuna().remove(st);
//        fireTableDataChanged();
//    }
    public void obrisiStavku(StavkaRacuna st) {
        racun.getStavkeRacuna().remove(st);
        List<StavkaRacuna> lisStavki = racun.getStavkeRacuna();

        for (int i = 0; i < lisStavki.size(); i++) {
            lisStavki.get(i).setRedniBrojStavke(i + 1);
        }
        fireTableDataChanged();
    }

    public Proizvod vratiProizvod(int sifra) {
        for (Proizvod proizvod : listaProizvoda) {
            if (proizvod.getProizvodId() == sifra) {
                return proizvod;
            }
        }
        return null;
    }

    public double vratiCenu(int sifra) {
        for (Proizvod proizvod : listaProizvoda) {
            if (proizvod.getProizvodId() == sifra) {
                return proizvod.getCena();
            }
        }
        return 0;
    }

    public List<Proizvod> getProizvodIzStavki() {
        List<Proizvod> listaProizvodaUStavkama = new ArrayList<>();
        for (StavkaRacuna st : racun.getStavkeRacuna()) {
            listaProizvodaUStavkama.add(st.getProizvod());
        }
        return listaProizvodaUStavkama;
    }

    public Proizvod vratiProizvodZaStavku(StavkaRacuna sr) {
        for (Proizvod proizvod : listaProizvoda) {
            if (proizvod.getProizvodId() == sr.getProizvod().getProizvodId()) {
                return proizvod;
            }
        }
        return null;
    }
}
