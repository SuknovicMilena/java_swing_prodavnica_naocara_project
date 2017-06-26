/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Proizvod;
import domen.Racun;
import domen.StavkaRacuna;
import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JOptionPane;
import klijentKontroler.KlijentKontroler;

/**
 *
 * @author Milena
 */
public class FStavkaRacuna extends javax.swing.JDialog {

    Racun racun;
    StavkaRacuna st;

    public FStavkaRacuna(java.awt.Frame parent, boolean modal, StavkaRacuna st) {
        super(parent, modal);
        initComponents();
        this.st = st;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfBrojRac = new javax.swing.JTextField();
        jtfProizvod = new javax.swing.JTextField();
        jtfIznos = new javax.swing.JTextField();
        jbtnBrisanjeStavke = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfKolicina = new javax.swing.JTextField();
        jtfCena = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Brisanje stavke racuna");

        jLabel2.setText("Iznos stavke");

        jLabel3.setText("Broj racuna");

        jLabel4.setText("Proizvod");

        jtfBrojRac.setEditable(false);

        jbtnBrisanjeStavke.setText("Obrisi stavku");
        jbtnBrisanjeStavke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrisanjeStavkeActionPerformed(evt);
            }
        });

        jLabel5.setText("Kolicina");

        jLabel6.setText("Cena");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnBrisanjeStavke)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtfIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfBrojRac, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfCena, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfBrojRac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jbtnBrisanjeStavke)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBrisanjeStavkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrisanjeStavkeActionPerformed

        try {

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da izbrišete  stavku racuna?", "Brisanje stavki racuna", dialogButton);
            if (dialogResult == 0) {

                KlijentKontroler.getInstance().obrisiStavkuRacuna(st);
                FPretragaRacuna fpr = (FPretragaRacuna) getParent();
                modelTabele.ModelTabeleStavkaRacuna model = fpr.vratiModel();
                model.obrisiStavku(st);

                model.fireTableDataChanged();
                System.out.println("Da");
                JOptionPane.showMessageDialog(rootPane, "Uspešno ste izbrisali stavku racuna!");
                this.dispose();
            } else {
                System.out.println("Ne");
                JOptionPane.showMessageDialog(rootPane, "Niste izbrisali stavku racuna!");
            }
        } catch (HeadlessException | IOException ex) {
            System.out.println(ex.getMessage());
        }
        this.dispose();
    }//GEN-LAST:event_jbtnBrisanjeStavkeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnBrisanjeStavke;
    private javax.swing.JTextField jtfBrojRac;
    private javax.swing.JTextField jtfCena;
    private javax.swing.JTextField jtfIznos;
    private javax.swing.JTextField jtfKolicina;
    private javax.swing.JTextField jtfProizvod;
    // End of variables declaration//GEN-END:variables

    void pogledajStavku(StavkaRacuna sr, Proizvod proizvod) {

        jtfKolicina.setText(sr.getKolicina() + "");
        jtfCena.setText(proizvod.getCena() + "");
        jtfBrojRac.setText(sr.getRacun().getBrojRacuna() + "");
        jtfIznos.setText(sr.getIznosStavke() + "");
        jtfProizvod.setText(proizvod.getNazivProizvoda() + "");

    }

}
