/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Racun;
import domen.StavkaRacuna;
import javax.swing.JOptionPane;
import klijentKontroler.KlijentKontroler;

/**
 *
 * @author Milena
 */
public class FStavkaRacuna extends javax.swing.JDialog {

    /**
     * Creates new form FIzmenaStavkiRacuna
     *
     * @param parent
     * @param modal
     */
    public FStavkaRacuna(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfRbStavke = new javax.swing.JTextField();
        jtfBrojRac = new javax.swing.JTextField();
        jtfProizvod = new javax.swing.JTextField();
        jtfIznos = new javax.swing.JTextField();
        jbtnBrisanjeStavke = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Brisanje stavke racuna");

        jLabel1.setText("Redni broj stavke");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnBrisanjeStavke)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfBrojRac, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(54, 54, 54)
                            .addComponent(jtfRbStavke, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(95, 95, 95)
                            .addComponent(jtfProizvod))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfRbStavke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfBrojRac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(jtfProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnBrisanjeStavke)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBrisanjeStavkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrisanjeStavkeActionPerformed
        int redniBrojStavke = Integer.parseInt(jtfRbStavke.getText());
        String brRac = jtfBrojRac.getText();
        int brInt = Integer.parseInt(brRac);
        StavkaRacuna st = new StavkaRacuna();
        st.setRedniBrojStavke(redniBrojStavke);
        Racun racun = new Racun();
        racun.setBrojRacuna(brInt);
        st.setRacun(racun);

        try {

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da izbrišete  stavku racuna?", "Brisanje stavki racuna", dialogButton);
            if (dialogResult == 0) {
                KlijentKontroler.getInstance().obrisiStavkuRacuna(st);
                FPretragaRacuna fpr = (FPretragaRacuna) getParent();

                modelTabele.ModelTabeleStavkaRacuna model = fpr.vratiModel();
                model.obrisiStavku(st);

                System.out.println("Da");
                JOptionPane.showMessageDialog(rootPane, "Uspešno ste izbrisali stavku racuna!");
            } else {
                System.out.println("Ne");
                JOptionPane.showMessageDialog(rootPane, "Niste izbrisali stavku racuna!");
            }
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_jbtnBrisanjeStavkeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnBrisanjeStavke;
    private javax.swing.JTextField jtfBrojRac;
    private javax.swing.JTextField jtfIznos;
    private javax.swing.JTextField jtfProizvod;
    private javax.swing.JTextField jtfRbStavke;
    // End of variables declaration//GEN-END:variables

    void pogledajStavku(StavkaRacuna sr) {
        jtfBrojRac.setText(sr.getRacun().getBrojRacuna() + "");
        jtfIznos.setText(sr.getIznosStavke() + "");
        jtfProizvod.setText(sr.getProizvod().getProizvodId() + "");
        jtfRbStavke.setText(sr.getRedniBrojStavke() + "");
    }
}
