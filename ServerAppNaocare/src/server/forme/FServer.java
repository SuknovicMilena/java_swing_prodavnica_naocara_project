/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.forme;

import server.forme.FPodesavanja;
import domen.Korisnik;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelTabele.ModelTabeleKorisnik;
import nitiServer.NitKlijent;
import nitiServer.NitSat;
import nitiServer.NitPokretanjeServera;

/**
 *
 * @author Milena
 */
public class FServer extends javax.swing.JFrame {

    NitPokretanjeServera server;
    ArrayList<Korisnik> listaPoslePretrage = new ArrayList<>();
    List<Korisnik> listaKorisnika;
    ModelTabeleKorisnik model;
    Korisnik korisnik;

    public FServer() throws Exception {
        initComponents();
        NitSat nitSat = new NitSat(jtxtSat);
        popuniTabeluKorisnici();
        srediTabelu();
        jbtnZaustaviServer.setVisible(false);
        jlStanjeServera.setText("Server nije pokrenut!");
        jlStanjeServera.setForeground(Color.ORANGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jtxtSat = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtnZaustaviServer = new javax.swing.JButton();
        jbtnPokreniServer = new javax.swing.JButton();
        jlStanjeServera = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablePrijavljeniKorisnici = new javax.swing.JTable();
        jbtnUkloniPrijavljenogKorisnika = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfUklanjanjePrijavljenih = new javax.swing.JTextField();
        jbtnPronadjiKorisnika = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbtnUkloniRegistrovanogKorisnika = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableRegistrovani = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jbtnRegKorZaUklanjanje = new javax.swing.JButton();
        jtfRegKorZaUklanjanje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbtnPodesavanja = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 153, 255));
        setForeground(java.awt.Color.gray);

        jtxtSat.setEditable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sanje servera"));

        jbtnZaustaviServer.setText("Zaustavi server");
        jbtnZaustaviServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnZaustaviServerActionPerformed(evt);
            }
        });

        jbtnPokreniServer.setText("Pokreni server");
        jbtnPokreniServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPokreniServerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlStanjeServera, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtnPokreniServer, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnZaustaviServer, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnPokreniServer)
                    .addComponent(jbtnZaustaviServer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlStanjeServera, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Lista prijavljenih korisnika"));

        jtablePrijavljeniKorisnici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ime", "Prezime", "Korisnicko ime"
            }
        ));
        jScrollPane1.setViewportView(jtablePrijavljeniKorisnici);

        jbtnUkloniPrijavljenogKorisnika.setText("Ukloni prijavljenog korisnika");
        jbtnUkloniPrijavljenogKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUkloniPrijavljenogKorisnikaActionPerformed(evt);
            }
        });

        jLabel1.setText("Korisnik za uklanjanje ");

        jbtnPronadjiKorisnika.setText("Pronadji korisnika");
        jbtnPronadjiKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPronadjiKorisnikaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jtfUklanjanjePrijavljenih, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnPronadjiKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnUkloniPrijavljenogKorisnika, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfUklanjanjePrijavljenih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPronadjiKorisnika))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jbtnUkloniPrijavljenogKorisnika))
        );

        jTabbedPane2.addTab("Svi trenutno prijavljeni korisnici", jPanel3);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registrovani korisnici"));

        jbtnUkloniRegistrovanogKorisnika.setText("Ukloni registrovanog korisnika");
        jbtnUkloniRegistrovanogKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUkloniRegistrovanogKorisnikaActionPerformed(evt);
            }
        });

        jtableRegistrovani.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ime", "Prezime", "Korisnicko ime"
            }
        ));
        jScrollPane2.setViewportView(jtableRegistrovani);

        jLabel2.setText("Korisnik za uklanjanje");

        jbtnRegKorZaUklanjanje.setText("Pretrazi ");
        jbtnRegKorZaUklanjanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegKorZaUklanjanjeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfRegKorZaUklanjanje))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(96, Short.MAX_VALUE)
                        .addComponent(jbtnUkloniRegistrovanogKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jbtnRegKorZaUklanjanje))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbtnRegKorZaUklanjanje)
                    .addComponent(jtfRegKorZaUklanjanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jbtnUkloniRegistrovanogKorisnika))
        );

        jTabbedPane2.addTab("Svi registrovani korisnici", jPanel1);

        jLabel3.setText("* Pretraga korisnika je po prezimenu");

        jbtnPodesavanja.setText("Podesavanja baze");
        jbtnPodesavanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPodesavanjaActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtSat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jbtnPodesavanja, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnPodesavanja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtSat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPokreniServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPokreniServerActionPerformed
        // TODO add your handling code here:
        server = new NitPokretanjeServera(this);

        server.start();

        jlStanjeServera.setText("Server je pokrenut!");
        jlStanjeServera.setForeground(Color.GREEN);
        jbtnZaustaviServer.setVisible(true);
        jbtnPokreniServer.setVisible(false);

    }//GEN-LAST:event_jbtnPokreniServerActionPerformed

    private void jbtnZaustaviServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnZaustaviServerActionPerformed
       
        server.setSignal(false);
        jlStanjeServera.setText("Server je zaustavljen!");
        jlStanjeServera.setForeground(Color.RED);
        System.out.println("Server je zaustavljen!");
        jbtnPokreniServer.setVisible(true);
        jbtnZaustaviServer.setVisible(false);
    }//GEN-LAST:event_jbtnZaustaviServerActionPerformed

    private void jbtnUkloniRegistrovanogKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUkloniRegistrovanogKorisnikaActionPerformed
        // TODO add your handling code here:

        if (jtableRegistrovani.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Morate izabrati red u tabeli!");

        } else {
            int index = jtableRegistrovani.getSelectedRow();
            try {
                if (listaPoslePretrage.isEmpty()) {
                    korisnik = kontroler.Kontroler.getInstance().vratiSveKorisnike().get(index);
                } else {
                    korisnik = listaPoslePretrage.get(index);
                }

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da obrisete korisnika?", "Brisanje korisnika", dialogButton);
                if (dialogResult == 0) {

                    kontroler.Kontroler.getInstance().obrisiKorisnika(korisnik);
                    ModelTabeleKorisnik mp = (ModelTabeleKorisnik) jtableRegistrovani.getModel();

                    mp.obrisiKorisnika(index);

                    jtableRegistrovani.setModel(mp);

                }
            } catch (Exception ex) {
                Logger.getLogger(FServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtnUkloniRegistrovanogKorisnikaActionPerformed

    private void jbtnUkloniPrijavljenogKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUkloniPrijavljenogKorisnikaActionPerformed

        List<NitKlijent> listaNiti = server.getListaAktivnihKlijenata();

        int brojReda = jtablePrijavljeniKorisnici.getSelectedRow();
        if (brojReda < 0) {
            JOptionPane.showMessageDialog(rootPane, "Morate izabrati red u tabeli!");
            return;
        }
        try {
            listaNiti.get(brojReda).getSoket().close();
            osveziTabelu(brojReda);
        } catch (IOException ex) {
            Logger.getLogger(FServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtnUkloniPrijavljenogKorisnikaActionPerformed

    private void jbtnPronadjiKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPronadjiKorisnikaActionPerformed
        // TODO add your handling code here:

        String prezimeKorisnika = jtfUklanjanjePrijavljenih.getText();
        try {
            List<Korisnik> listaSvih = server.getListaKorisnika();
            listaPoslePretrage = new ArrayList<>();

            for (Korisnik k : listaSvih) {
                if (k.getPrezime().toLowerCase().startsWith(prezimeKorisnika) || k.getPrezime().startsWith(prezimeKorisnika)) {
                    listaPoslePretrage.add(k);
                }
            }
            JOptionPane.showMessageDialog(this, "Pretraga je zavrsena!");

            popuniTabeluSaPretragom(listaPoslePretrage);
        } catch (Exception ex) {
            System.out.println("Sistem ne moze da nadje korisnik  sa tim prezimenom!" + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje korisnike sa tim vrednostima.", "Greska", JOptionPane.ERROR_MESSAGE);
        }
        setVisible(true);
    }//GEN-LAST:event_jbtnPronadjiKorisnikaActionPerformed

    private void jbtnRegKorZaUklanjanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegKorZaUklanjanjeActionPerformed
        uklanjanjeKorisnikaRegistrovanih();
    }//GEN-LAST:event_jbtnRegKorZaUklanjanjeActionPerformed

    private void jbtnPodesavanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPodesavanjaActionPerformed
        FPodesavanja fp = new FPodesavanja();
        fp.setVisible(true);
        fp.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtnPodesavanjaActionPerformed

    public void popuniTabeluKorisnici() throws Exception {
        listaKorisnika = kontroler.Kontroler.getInstance().vratiSveKorisnike();
        model = new ModelTabeleKorisnik(listaKorisnika);
        jtableRegistrovani.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton jbtnPodesavanja;
    private javax.swing.JButton jbtnPokreniServer;
    private javax.swing.JButton jbtnPronadjiKorisnika;
    private javax.swing.JButton jbtnRegKorZaUklanjanje;
    private javax.swing.JButton jbtnUkloniPrijavljenogKorisnika;
    private javax.swing.JButton jbtnUkloniRegistrovanogKorisnika;
    private javax.swing.JButton jbtnZaustaviServer;
    private javax.swing.JLabel jlStanjeServera;
    private javax.swing.JTable jtablePrijavljeniKorisnici;
    private javax.swing.JTable jtableRegistrovani;
    private javax.swing.JTextField jtfRegKorZaUklanjanje;
    private javax.swing.JTextField jtfUklanjanjePrijavljenih;
    private javax.swing.JTextField jtxtSat;
    // End of variables declaration//GEN-END:variables

    private void srediTabelu() {
        jtablePrijavljeniKorisnici.setModel(new ModelTabeleKorisnik(new ArrayList<Korisnik>()));
    }

    public void dodajRedUTabeli(Korisnik k) {
        model = (ModelTabeleKorisnik) jtablePrijavljeniKorisnici.getModel();
        model.dodajKorisnika(k);
        jtablePrijavljeniKorisnici.setModel(model);
    }

    private void osveziTabelu(int red) {

        model = (ModelTabeleKorisnik) jtablePrijavljeniKorisnici.getModel();

        model.obrisiKorisnika(red);
        jtablePrijavljeniKorisnici.setModel(model);

    }

    private void popuniTabeluSaPretragom(ArrayList<Korisnik> listaPoslePretrage) {

        model = new ModelTabeleKorisnik(listaPoslePretrage);
        jtablePrijavljeniKorisnici.setModel(model);
        if (listaPoslePretrage.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje zadatog korisnika", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void popuniTabeluSaPretragomReg(ArrayList<Korisnik> listaPoslePretrage) throws Exception {

        model = new ModelTabeleKorisnik(listaPoslePretrage);
        jtableRegistrovani.setModel(model);
        if (listaPoslePretrage.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje zadatog korisnika", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void uklanjanjeKorisnikaRegistrovanih() {

        String prezimeKorisnika = jtfRegKorZaUklanjanje.getText();
        try {

            listaPoslePretrage = new ArrayList<>();

            for (Korisnik k : listaKorisnika) {
                if (k.getPrezime().toLowerCase().startsWith(prezimeKorisnika) || k.getPrezime().startsWith(prezimeKorisnika)) {
                    listaPoslePretrage.add(k);
                }
            }
            JOptionPane.showMessageDialog(this, "Pretraga je zavrsena!");

            popuniTabeluSaPretragomReg(listaPoslePretrage);
        } catch (Exception ex) {
            System.out.println("Sistem ne moze da nadje korisnik  sa tim prezimenom!" + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje korisnike sa tim vrednostima.", "Greska", JOptionPane.ERROR_MESSAGE);
        }

    }
}
