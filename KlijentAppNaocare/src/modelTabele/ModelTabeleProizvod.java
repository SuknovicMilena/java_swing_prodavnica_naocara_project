/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelTabele;

import domen.Proizvod;
import domen.Proizvodjac;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Milena
 */
public class ModelTabeleProizvod extends AbstractTableModel {

    List<Proizvod> proizvodi;
    List<Proizvodjac> proizvodjaci;

    String[] kolone = {"Naziv proizvoda", "Cena", "Boja", "Tip", "Proizvodjac"};

    public ModelTabeleProizvod(List<Proizvod> proizvodi, List<Proizvodjac> proizvodjaci) {
        this.proizvodi = proizvodi;
        this.proizvodjaci = proizvodjaci;
    }

    public void refresh(Object[][] objects) {
        //make the changes to the table, then call fireTableChanged
        fireTableChanged(null);
    }

    @Override
    public int getRowCount() {
        if (proizvodi == null) {
            return 0;
        }
        return proizvodi.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proizvod proizvod = proizvodi.get(rowIndex);

        switch (columnIndex) {

            case 0:
                return proizvod.getNazivProizvoda();
            case 1:
                return proizvod.getCena();
            case 2:
                return proizvod.getBoja();
            case 3:
                return proizvod.getTip();
            case 4:
                return vratiNazivProizvodjaca(proizvod.getProizvodjac().getProizvodjacId());
            default:
                return "N/A";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Proizvod proizvod = proizvodi.get(rowIndex);
        switch (columnIndex) {

            case 0:
                proizvod.setNazivProizvoda((String) aValue);
                break;
            case 1:
                proizvod.setCena((Double) aValue);
                break;
            case 2:
                proizvod.setBoja((String) aValue);
                break;
            case 3:
                proizvod.setTip((String) aValue);
                break;
            case 4:
                proizvod.setProizvodjac((Proizvodjac) aValue);

        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public void dodajProizvod(Proizvod proizvod) {
        proizvodi.add(proizvod);
        fireTableDataChanged();
    }

    public void obrisiProizvod(Proizvod proizvod) {
        proizvodi.remove(proizvod);
        fireTableDataChanged();
    }

    public void obrisiProizvodSelRed(int proizvod) {
        proizvodi.remove(proizvod);
        fireTableDataChanged();
    }

    public List<Proizvod> vratiListuProizvoda() {
        return proizvodi;
    }

    public Proizvod vratiProizvod(int sifra) {
        for (Proizvod proizvod : proizvodi) {
            if (proizvod.getProizvodId() == sifra) {
                return proizvod;
            }
        }
        return null;
    }

    public String vratiNazivProizvodjaca(int sifra) {
        for (Proizvodjac p : proizvodjaci) {
            if (p.getProizvodjacId() == sifra) {
                return p.getNaziv();
            }
        }
        return null;
    }

//    public void izmeniProizvod(Proizvod p) {
//        Proizvod proizvod = null;
//        for (int i = 0; i < proizvodi.size(); i++) {
//            proizvod = proizvodi.get(i);
//        }
//        proizvodi.set(proizvod.getProizvodId(), p);
//        fireTableDataChanged();
//
//    }
}
