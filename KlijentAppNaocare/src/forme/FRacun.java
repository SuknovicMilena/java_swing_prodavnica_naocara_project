/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import domen.Proizvod;
import domen.Proizvodjac;
import domen.Racun;
import domen.StavkaRacuna;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import klijentKontroler.KlijentKontroler;
import modelTabele.ModelTabeleProizvod;
import modelTabele.ModelTabeleStavkaRacuna;
import session.Session;

public class FRacun extends javax.swing.JDialog {

    FPrijava prijava;
    FGlavna glavna;
    Korisnik korisnik;

    public FRacun(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        srediFormu();
        jtxtBrojRacuna.setVisible(false);
        jlBrojRac.setVisible(false);
        this.korisnik = Session.getInstance().getLogovaniKorisnik();
        jtfKorisnik.setText(korisnik + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbPoslovniPartner = new javax.swing.JComboBox<>();
        jlBrojRac = new javax.swing.JLabel();
        jtxtBrojRacuna = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtDatumIzdavanja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtUkupanIznos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblStavkeRacuna = new javax.swing.JTable();
        jbtnSacuvaj = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblProizvodi = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtxtProizvodId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtNaziv = new javax.swing.JTextField();
        jtxtCena = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbtnDodaj = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtBoja = new javax.swing.JTextField();
        jtfTip = new javax.swing.JTextField();
        jtfProizvodjac = new javax.swing.JTextField();
        jtfKorisnik = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Racun");

        jlBrojRac.setText("Broj racuna");

        jtxtBrojRacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBrojRacunaActionPerformed(evt);
            }
        });

        jLabel2.setText("Korisnik");

        jLabel3.setText("Datum kupovine");

        jtxtUkupanIznos.setEditable(false);
        jtxtUkupanIznos.setEnabled(false);

        jLabel4.setText("Ukupan iznos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stavke racuna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jtblStavkeRacuna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Rb", "Iznos stavke", "Proizvod"
            }
        ));
        jScrollPane1.setViewportView(jtblStavkeRacuna);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jbtnSacuvaj.setText("Sacuvaj");
        jbtnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSacuvajActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proizvodi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jtblProizvodi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ProizvodId", "Naziv proizvoda", "Cena", "Boja", "Tip", "Proizvodjac"
            }
        ));
        jtblProizvodi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblProizvodiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblProizvodi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proizvod", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setEnabled(false);

        jLabel5.setText("ProizvodId");

        jtxtProizvodId.setEditable(false);

        jLabel6.setText("Naziv");

        jtxtNaziv.setEditable(false);

        jtxtCena.setEditable(false);

        jLabel7.setText("Cena");

        jbtnDodaj.setText("Dodaj");
        jbtnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajActionPerformed(evt);
            }
        });

        jLabel9.setText("Tip");

        jLabel10.setText("Boja");

        jLabel11.setText("Proizvodjac");

        jtxtBoja.setEditable(false);

        jtfTip.setEditable(false);

        jtfProizvodjac.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnDodaj)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfProizvodjac)
                            .addComponent(jtxtProizvodId, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jtxtNaziv)
                            .addComponent(jtxtCena)
                            .addComponent(jtxtBoja, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfTip))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtProizvodId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtxtBoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfProizvodjac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnDodaj)
                .addGap(30, 30, 30))
        );

        jtfKorisnik.setEditable(false);

        jLabel1.setText("Datum je u formatu (dd.MM.yyyy)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jlBrojRac))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfKorisnik)
                            .addComponent(jtxtBrojRacuna)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDatumIzdavanja)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jtxtUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlBrojRac)
                            .addComponent(jtxtBrojRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtDatumIzdavanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jtxtUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtblProizvodiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblProizvodiMouseClicked
        int red = jtblProizvodi.getSelectedRow();
        String ssifra = jtblProizvodi.getValueAt(red, 0).toString();
        int sifra = Integer.parseInt(ssifra);

        ModelTabeleProizvod mtp = (ModelTabeleProizvod) jtblProizvodi.getModel();
        Proizvod p = mtp.vratiProizvod(sifra);
        Proizvodjac proizvodjac = mtp.vratiProizvodjacaZaProizvod(p);

        prikaziProizvod(p, proizvodjac);
    }//GEN-LAST:event_jtblProizvodiMouseClicked

    private void jbtnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajActionPerformed
        int sifra = Integer.parseInt(jtxtProizvodId.getText());
        ModelTabeleProizvod mtp = (ModelTabeleProizvod) jtblProizvodi.getModel();
        Proizvod p = mtp.vratiProizvod(sifra);

        ModelTabeleStavkaRacuna mtsr = (ModelTabeleStavkaRacuna) jtblStavkeRacuna.getModel();
        mtsr.dodajStavku(p);
        jtxtUkupanIznos.setText(mtsr.getRacun().getUkupanIznos() + "");
    }//GEN-LAST:event_jbtnDodajActionPerformed

    private void jtxtBrojRacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBrojRacunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBrojRacunaActionPerformed

    private void jbtnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSacuvajActionPerformed
        // TODO add your handling code here:
        Racun racun = new Racun();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        try {
            date = (Date) sdf.parse(jtxtDatumIzdavanja.getText().trim());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Datum nije u korektnom formatu!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        racun.setDatumKupovine(date);

        racun.setKorisnik(korisnik);

        String ukupanIznos = jtxtUkupanIznos.getText();
        double ukupanDouble = Double.parseDouble(ukupanIznos);
        racun.setUkupanIznos(ukupanDouble);

        ModelTabeleStavkaRacuna model = (ModelTabeleStavkaRacuna) jtblStavkeRacuna.getModel();

        List<StavkaRacuna> stavke = model.getStavkeRacuna();
        racun.setStavkeRacuna(stavke);
        try {
            KlijentKontroler.getInstance().sacuvajRacun(racun);
//        for (StavkaRacuna stavkaRacuna : stavke) {
//            try {
//                KlijentKontroler.getInstance().sacuvajStavkeRacuna(stavkaRacuna);
//            } catch (IOException ex) {
//                Logger.getLogger(FRacun.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        } catch (IOException ex) {
            Logger.getLogger(FRacun.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtnSacuvajActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnDodaj;
    private javax.swing.JButton jbtnSacuvaj;
    private javax.swing.JComboBox<Object> jcbPoslovniPartner;
    private javax.swing.JLabel jlBrojRac;
    private javax.swing.JTable jtblProizvodi;
    private javax.swing.JTable jtblStavkeRacuna;
    private javax.swing.JTextField jtfKorisnik;
    private javax.swing.JTextField jtfProizvodjac;
    private javax.swing.JTextField jtfTip;
    private javax.swing.JTextField jtxtBoja;
    private javax.swing.JTextField jtxtBrojRacuna;
    private javax.swing.JTextField jtxtCena;
    private javax.swing.JTextField jtxtDatumIzdavanja;
    private javax.swing.JTextField jtxtNaziv;
    private javax.swing.JTextField jtxtProizvodId;
    private javax.swing.JTextField jtxtUkupanIznos;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        List<Proizvod> listaProizvoda = klijentKontroler.KlijentKontroler.getInstance().vratiProizvode();
        ModelTabeleStavkaRacuna tmStavke = new ModelTabeleStavkaRacuna(new Racun(), listaProizvoda);
        jtblStavkeRacuna.setModel(tmStavke);
        List<Proizvodjac> listaProizvodjaca = klijentKontroler.KlijentKontroler.getInstance().vratiSveProizvodjace();
        ModelTabeleProizvod model = new ModelTabeleProizvod(klijentKontroler.KlijentKontroler.getInstance().vratiProizvode(), listaProizvodjaca);
        jtblProizvodi.setModel(model);
    }

    private void prikaziProizvod(Proizvod p, Proizvodjac proizvodjac) {
        jtxtProizvodId.setText(p.getProizvodId() + "");
        jtxtNaziv.setText(p.getNazivProizvoda());
        jtxtCena.setText(p.getCena() + "");
        jtxtBoja.setText(p.getBoja());
        jtfTip.setText(p.getTip());
        jtfProizvodjac.setText(proizvodjac.getNaziv() + "");

    }

    public void postaviUlogovanogKorisnika(Korisnik korisnik) {
        jtfKorisnik.setText("" + korisnik);
    }

    private ModelTabeleProizvod vratiModel() {
        ModelTabeleProizvod model = (ModelTabeleProizvod) jtblProizvodi.getModel();
        return model;
    }
}
