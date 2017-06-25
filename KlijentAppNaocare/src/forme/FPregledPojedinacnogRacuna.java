package forme;

import domen.Racun;
import javax.swing.JOptionPane;
import klijentKontroler.KlijentKontroler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Milena
 */
public class FPregledPojedinacnogRacuna extends javax.swing.JDialog {

    /**
     * Creates new form FPregledPojedinacnogRacuna
     */
    Racun racun;

    public FPregledPojedinacnogRacuna(java.awt.Frame parent, boolean modal, Racun racun) {
        super(parent, modal);
        initComponents();
        this.racun = racun;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfBrojRacuna = new javax.swing.JTextField();
        jtfDatumKupovine = new javax.swing.JTextField();
        jtfUkupanIznos = new javax.swing.JTextField();
        jtfKorisnik = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Brisanje racuna");

        jLabel1.setText("Broj racuna");

        jLabel2.setText("Datum kupovine");

        jLabel3.setText("Ukupan iznos");

        jLabel4.setText("Korisnik");

        jtfBrojRacuna.setEditable(false);

        jtfDatumKupovine.setEditable(false);

        jButton1.setText("Obrisi racun");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jtfUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDatumKupovine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBrojRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfBrojRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDatumKupovine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtfUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da izbrišete  racun?", "Brisanje  racuna", dialogButton);
            if (dialogResult == 0) {

                KlijentKontroler.getInstance().obrisiRacun(racun);
                FPretragaRacuna fpr = (FPretragaRacuna) getParent();
                modelTabele.ModelTabeleRacun model = fpr.vratiModelRacuna();

                model.getListaRacuna().remove(racun);

                model.fireTableDataChanged();
                System.out.println("Da");
                JOptionPane.showMessageDialog(rootPane, "Uspešno ste izbrisali  racun!");
            } else {
                System.out.println("Ne");
                JOptionPane.showMessageDialog(rootPane, "Niste izbrisali  racun!");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtfBrojRacuna;
    private javax.swing.JTextField jtfDatumKupovine;
    private javax.swing.JTextField jtfKorisnik;
    private javax.swing.JTextField jtfUkupanIznos;
    // End of variables declaration//GEN-END:variables

    void pogledajRacun(Racun r) {
        jtfBrojRacuna.setText(r.getBrojRacuna() + "");
        jtfDatumKupovine.setText(r.getDatumKupovine() + "");
        jtfUkupanIznos.setText(r.getUkupanIznos() + "");
        jtfKorisnik.setText(r.getKorisnik().getKorisnikId() + "");
    }
}
