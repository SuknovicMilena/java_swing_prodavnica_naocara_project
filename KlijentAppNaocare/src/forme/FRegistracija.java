/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import klijentKontroler.KlijentKontroler;
import session.Session;

/**
 *
 * @author Milena
 */
public class FRegistracija extends javax.swing.JFrame {

    /**
     * Creates new form FRegistracija
     */
    public FRegistracija() {
        initComponents();
    }
    List<Korisnik> korisnici;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfIme = new javax.swing.JTextField();
        jtfPrezime = new javax.swing.JTextField();
        jtfKorisnickoIme = new javax.swing.JTextField();
        jbtnRegistrujSe = new javax.swing.JButton();
        jtfPass = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registracija");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registracija na sistem"));

        jLabel2.setText("Korisnicka sifra");

        jLabel3.setText("Ime");

        jLabel4.setText("Prezime");

        jLabel5.setText("Korisnicko ime");

        jbtnRegistrujSe.setText("Registruj se");
        jbtnRegistrujSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrujSeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnRegistrujSe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jtfKorisnickoIme, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jtfIme)
                    .addComponent(jtfPass))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jbtnRegistrujSe)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrujSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrujSeActionPerformed
        // TODO add your handling code here:
        String ime = jtfIme.getText();
        String prezime = jtfPrezime.getText();
        String korisnickoIme = jtfKorisnickoIme.getText();
        String korisnickaSifra = jtfPass.getText();

        if (ime.isEmpty() || prezime.isEmpty() || korisnickoIme.isEmpty() || korisnickaSifra.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Niste se uspesno registrovali, pokusajte ponovo.", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (korisnickaSifra.length() < 4) {
            JOptionPane.showMessageDialog(this, "Sifra mora da ima najmanje 4 karaktera.", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!korisnickaSifra.contains("@")) {
            JOptionPane.showMessageDialog(this, "Sifra mora da sadrzi @ simbol.", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Korisnik korisnik = new Korisnik(ime, prezime, korisnickoIme, korisnickaSifra);
        try {
            KlijentKontroler.getInstance().registrujKorisnika(korisnik);
            System.out.println("Korisnik se uspesno registrovao.");
            FGlavna fglavna = new FGlavna();
            Korisnik korisnikPoUsernamu = KlijentKontroler.getInstance().vratiKorisnika(korisnickoIme);
            Session.getInstance().setLogovaniKorisnik(korisnikPoUsernamu);

            JOptionPane.showMessageDialog(this, "Uspesno ste se registrovali na sistem.");
            fglavna.prikaziSat();
            fglavna.postaviMeni();
            fglavna.setTitle("Glavna forma");
            fglavna.setVisible(true);

            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(FPrijava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnRegistrujSeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnRegistrujSe;
    private javax.swing.JTextField jtfIme;
    private javax.swing.JTextField jtfKorisnickoIme;
    private javax.swing.JPasswordField jtfPass;
    private javax.swing.JTextField jtfPrezime;
    // End of variables declaration//GEN-END:variables
}
