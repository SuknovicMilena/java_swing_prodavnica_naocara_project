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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblStavkeRacuna = new javax.swing.JTable();
        jtxtUkupanIznos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
        jtfKolicina = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jlBrojRac = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtBrojRacuna = new javax.swing.JTextField();
        jtfKorisnik = new javax.swing.JTextField();
        jtxtDatumIzdavanja = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Racun");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Stavke racuna"));

        jtblStavkeRacuna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Rb", "Kolicina", "Cena", "Iznos stavke", "Proizvod"
            }
        ));
        jScrollPane1.setViewportView(jtblStavkeRacuna);

        jtxtUkupanIznos.setEditable(false);
        jtxtUkupanIznos.setEnabled(false);

        jLabel4.setText("Ukupan iznos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jtxtUkupanIznos))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24))
        );

        jbtnSacuvaj.setText("Sacuvaj");
        jbtnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSacuvajActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Proizvodi"));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Proizvod"));
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

        jLabel8.setText("Kolicina");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnDodaj)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfProizvodjac)
                            .addComponent(jtxtProizvodId, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jtxtNaziv)
                            .addComponent(jtxtCena)
                            .addComponent(jtxtBoja, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfTip)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfKolicina)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnDodaj)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Racun"));

        jlBrojRac.setText("Broj racuna");

        jLabel2.setText("Korisnik");

        jLabel3.setText("Datum kupovine");

        jtxtBrojRacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBrojRacunaActionPerformed(evt);
            }
        });

        jtfKorisnik.setEditable(false);

        jLabel1.setText("Datum je u formatu (dd.MM.yyyy)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtDatumIzdavanja, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlBrojRac)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfKorisnik)
                                    .addComponent(jtxtBrojRacuna)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBrojRac)
                    .addComponent(jtxtBrojRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDatumIzdavanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
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

    @SuppressWarnings("element-type-mismatch")
    private void jbtnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajActionPerformed
        if (jtxtProizvodId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Niste selektovali ni jedan proizvod!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jtfKolicina.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Unesite kolicinu!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int kolicina = Integer.parseInt(jtfKolicina.getText());
        int sifra = Integer.parseInt(jtxtProizvodId.getText());
        ModelTabeleProizvod mtp = (ModelTabeleProizvod) jtblProizvodi.getModel();
        Proizvod p = mtp.vratiProizvod(sifra);
        ModelTabeleStavkaRacuna mtsr = (ModelTabeleStavkaRacuna) jtblStavkeRacuna.getModel();
        if (mtsr.getProizvodIzStavki().contains(p)) {
            JOptionPane.showMessageDialog(this, "Izabranu stavku ste vec uneli, ne mozete ponovo!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;

        }
        mtsr.dodajStavku(p, kolicina);

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
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da sačuvate proizvod?", "Dodavanje racuna", dialogButton);
            if (dialogResult == 0) {
                KlijentKontroler.getInstance().sacuvajRacun(racun);
                JOptionPane.showMessageDialog(this, "Uspesno ste sacuvali racun!");

            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Niste uspesno sacuvali racun racun!");
            Logger.getLogger(FRacun.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnDodaj;
    private javax.swing.JButton jbtnSacuvaj;
    private javax.swing.JComboBox<Object> jcbPoslovniPartner;
    private javax.swing.JLabel jlBrojRac;
    private javax.swing.JTable jtblProizvodi;
    private javax.swing.JTable jtblStavkeRacuna;
    private javax.swing.JTextField jtfKolicina;
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
