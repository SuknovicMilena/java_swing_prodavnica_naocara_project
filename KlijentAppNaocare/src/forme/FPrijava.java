/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import java.util.List;
import javax.swing.JOptionPane;
import klijentKontroler.KlijentKontroler;
import session.Session;

/**
 *
 * @author Milena
 */
public class FPrijava extends javax.swing.JFrame {

    /**
     * Creates new form FPrijavaIliReg
     */
    List<Korisnik> korisnici;
    Korisnik korisnikPoUsernamu;

    public FPrijava() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnPotvrdiPrijavu = new javax.swing.JButton();
        jtfKorIme = new javax.swing.JTextField();
        jlKorIme = new javax.swing.JLabel();
        jlKorSifra = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jbtnRegistracija = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prijava na sistem");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Prijava na sistem"));
        jPanel1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        jbtnPotvrdiPrijavu.setText("Prijavi se na sistem");
        jbtnPotvrdiPrijavu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPotvrdiPrijavuActionPerformed(evt);
            }
        });

        jlKorIme.setText("Korisnicko ime");

        jlKorSifra.setText("Korisnicka sifra");

        jbtnRegistracija.setText("Registruj se ");
        jbtnRegistracija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistracijaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlKorIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlKorSifra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnRegistracija, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfKorIme, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addComponent(jPassword)
                        .addComponent(jbtnPotvrdiPrijavu, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfKorIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlKorIme, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlKorSifra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jbtnPotvrdiPrijavu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnRegistracija, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jbtnPotvrdiPrijavuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPotvrdiPrijavuActionPerformed
        // TODO add your handling code here:

        String username = jtfKorIme.getText();
        String pass = jPassword.getText();
        if (username.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Morate uneti sva neophodna polja!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }

        korisnikPoUsernamu = KlijentKontroler.getInstance().vratiKorisnika(username);

        if (korisnikPoUsernamu == null) {
            JOptionPane.showMessageDialog(this, "Korisnik sa tim imenom ne postoji, morate se registrovati.", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!korisnikPoUsernamu.getKorisnickaSifra().equals(pass)) {
            JOptionPane.showMessageDialog(this, "Pogresna sifra! Pokusajte ponovo", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Session.getInstance().setLogovaniKorisnik(korisnikPoUsernamu);

        FGlavna fglavna = new FGlavna();
        fglavna.prikaziSat();
        JOptionPane.showMessageDialog(this, "Uspesno ste se prijavili na sistem.");
        fglavna.postaviMeni();
        fglavna.setTitle("Glavna forma");
        fglavna.setExtendedState(fglavna.getExtendedState() | fglavna.MAXIMIZED_BOTH);
        fglavna.setVisible(true);
        fglavna.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_jbtnPotvrdiPrijavuActionPerformed

    private void jbtnRegistracijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistracijaActionPerformed
        // TODO add your handling code here:
        FRegistracija fregistracija = new FRegistracija();
        fregistracija.setVisible(true);
        fregistracija.setLocationRelativeTo(null);
        // this.setVisible(false);
    }//GEN-LAST:event_jbtnRegistracijaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbtnPotvrdiPrijavu;
    private javax.swing.JButton jbtnRegistracija;
    private javax.swing.JLabel jlKorIme;
    private javax.swing.JLabel jlKorSifra;
    private javax.swing.JTextField jtfKorIme;
    // End of variables declaration//GEN-END:variables

    public Korisnik getKorisnikPoUsernamu() {
        return korisnikPoUsernamu;
    }

    public void setKorisnikPoUsernamu(Korisnik korisnikPoUsernamu) {
        this.korisnikPoUsernamu = korisnikPoUsernamu;
    }

}
