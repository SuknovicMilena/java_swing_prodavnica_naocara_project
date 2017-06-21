/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTabele;

import domen.Proizvod;
import domen.Racun;
import domen.StavkaRacuna;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student
 */
public class ModelTabeleStavkaRacuna extends AbstractTableModel {

    Racun racun;
    String[] kolone = {"Rb", "Broj racuna", "Iznos stavke", "Proizvod"};

    public ModelTabeleStavkaRacuna(Racun racun) {
        this.racun = racun;
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
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaRacuna stavkaRacuna = racun.getStavkeRacuna().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return stavkaRacuna.getRedniBrojStavke();
            case 1:
                return stavkaRacuna.getRacun().getBrojRacuna();
            case 2:
                return stavkaRacuna.getIznosStavke();
            case 3:
                return stavkaRacuna.getProizvod().getProizvodId();

            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public void dodajStavku(Proizvod p) {
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
            novaSR.setIznosStavke(p.getCena());
            novaSR.setProizvod(p);
            racun.getStavkeRacuna().add(novaSR);
        }
        racun.setUkupanIznos(racun.getUkupanIznos() + p.getCena());
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

    public void obrisiStavku(StavkaRacuna st) {
        racun.getStavkeRacuna().remove(st);
        fireTableDataChanged();
    }
}
