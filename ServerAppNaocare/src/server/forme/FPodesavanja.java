/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.forme;

import db.Konekcija;
import db.KonekcioniString;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Milena
 */
public class FPodesavanja extends javax.swing.JFrame {

    /**
     * Creates new form FPodesavanja
     */
    public FPodesavanja() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtnSacuvaj = new javax.swing.JButton();
        jtfIP = new javax.swing.JTextField();
        jtfPort = new javax.swing.JTextField();
        jtfKorSifra = new javax.swing.JTextField();
        jtfSema = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfKorIme1 = new javax.swing.JTextField();
        jbtnUcitajParametre = new javax.swing.JButton();
        jtfUrl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbtnTest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Podesavanje parametara za bazu");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Podesavanje parametara za bazu"));

        jLabel1.setText("IP");

        jLabel2.setText("Korisnicko ime");

        jLabel3.setText("Port");

        jLabel4.setText("Korisnicka sifra");

        jbtnSacuvaj.setText("Sacuvaj");
        jbtnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSacuvajActionPerformed(evt);
            }
        });

        jLabel5.setText("Sema");

        jbtnUcitajParametre.setText("Ucitaj parametre");
        jbtnUcitajParametre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUcitajParametreActionPerformed(evt);
            }
        });

        jtfUrl.setEditable(false);

        jLabel6.setText("Url");

        jbtnTest.setText("Test");
        jbtnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnUcitajParametre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                                .addComponent(jbtnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfKorSifra, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jtfPort, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jtfIP, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jtfSema, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jtfKorIme1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jtfUrl))))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfSema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfKorIme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfKorSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnSacuvaj)
                    .addComponent(jbtnUcitajParametre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnTest)
                .addContainerGap(31, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnUcitajParametreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUcitajParametreActionPerformed
        try {
            Konekcija konekcija = Konekcija.vratiObjekat();
            String url = konekcija.getUrlPocetak();
            jtfUrl.setText(url);
            String ip = konekcija.getIp();
            jtfIP.setText(ip);
            String user = konekcija.getUser();
            jtfKorIme1.setText(user);
            String port = konekcija.getPort();
            jtfPort.setText(port);
            String sema = konekcija.getSema();
            jtfSema.setText(sema);
            String pass = konekcija.getPassword();
            jtfKorSifra.setText(pass);
        } catch (SQLException | IOException ex) {
            Logger.getLogger(FPodesavanja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnUcitajParametreActionPerformed

    private void jbtnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTestActionPerformed
        Konekcija konekcija = null;
        try {
            konekcija = Konekcija.vratiObjekat();
        } catch (SQLException | IOException ex) {
            Logger.getLogger(FPodesavanja.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Parametri nisu uspesno sacuvani!", "Greska!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String urlPocetak = konekcija.getUrlPocetak();
        try {
            String korisnickoIme = jtfKorIme1.getText().trim();
            String sifra = jtfKorSifra.getText();
            String url = urlPocetak + jtfIP.getText().trim() + ":" + jtfPort.getText().trim() + "/" + jtfSema.getText().trim();

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Test konekcije je uspesan. Zalis li da sacuvas podatke?", "Test", dialogButton);
            if (dialogResult == 0) {
                sacuvaj();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Konekcija nije uspostavljena! Proverite parametre koje ste uneli!");
        } catch (IOException ex) {
            Logger.getLogger(FPodesavanja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnTestActionPerformed

    private void jbtnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSacuvajActionPerformed
        try {
            sacuvaj();
        } catch (SQLException ex) {
            Logger.getLogger(FPodesavanja.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FPodesavanja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnSacuvajActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnSacuvaj;
    private javax.swing.JButton jbtnTest;
    private javax.swing.JButton jbtnUcitajParametre;
    private javax.swing.JTextField jtfIP;
    private javax.swing.JTextField jtfKorIme1;
    private javax.swing.JTextField jtfKorSifra;
    private javax.swing.JTextField jtfPort;
    private javax.swing.JTextField jtfSema;
    private javax.swing.JTextField jtfUrl;
    // End of variables declaration//GEN-END:variables

    private void sacuvaj() throws SQLException, IOException {
        String prefix = jtfUrl.getText();

        String korisnickoIme = jtfKorIme1.getText().trim();
        String sifra = jtfKorSifra.getText();
        String ip = jtfIP.getText().trim();
        String port = jtfPort.getText().trim();
        String sema = jtfSema.getText().trim();

        try {
            Properties props = new Properties();
            FileInputStream in = new FileInputStream("db.config");
            props.load(in);
            
            props.setProperty(KonekcioniString.URL, prefix);
            props.setProperty(KonekcioniString.USERNAME, korisnickoIme);
            props.setProperty(KonekcioniString.PASSWORD, sifra);
            props.setProperty(KonekcioniString.IP, ip);
            props.setProperty(KonekcioniString.PORT, port);
            props.setProperty(KonekcioniString.SEMA, sema);
            
            FileOutputStream out = new FileOutputStream("db.config");
            props.store(out, null);
            Konekcija.vratiObjekat().getDbutil().setProperties(props);
            JOptionPane.showMessageDialog(this, "Parametri su uspesno sacuvani!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Parametri nisu uspesno sacuvani!");
        }
    }
}
