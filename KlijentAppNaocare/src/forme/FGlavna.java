/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nitiKlijent.NitSat;
import session.Session;

/**
 *
 * @author Milena
 */
public class FGlavna extends javax.swing.JFrame {

    /**
     * Creates new form FGlavna
     */
    Korisnik korisnik;

    public FGlavna() {

        initComponents();
        srediMenu();
        jlUlogovaniKorisnik.setText("");
//        korisnik = session.Session.getInstance().getLogovaniKorisnik();
//        jlUlogovaniKorisnik.setText("Trenutno prijavljeni korisnik je: " + " " + korisnik);
        jlUlogovaniKorisnik.setForeground(Color.GREEN);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jBSviProizvodi = new javax.swing.JButton();
        jBDodajNoviProizvod = new javax.swing.JButton();
        jbtnNoviRacun = new javax.swing.JButton();
        jtxtSat = new javax.swing.JTextField();
        jlUlogovaniKorisnik = new javax.swing.JLabel();
        jbtnIzlogujSe = new javax.swing.JToggleButton();
        jbtnPretragaRacuna = new javax.swing.JButton();
        jbtnPrijaviSe = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMProizvodi = new javax.swing.JMenu();
        jMProizvodisvi = new javax.swing.JMenuItem();
        jmRacun = new javax.swing.JMenu();
        jmiNoviRacun = new javax.swing.JMenuItem();
        jMOAplikaciji = new javax.swing.JMenu();
        jMOautoru = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prodavnica naočara");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBSviProizvodi.setText("Svi proizvodi");
        jBSviProizvodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSviProizvodiActionPerformed(evt);
            }
        });

        jBDodajNoviProizvod.setText("Dodaj novi proizvod");
        jBDodajNoviProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDodajNoviProizvodActionPerformed(evt);
            }
        });

        jbtnNoviRacun.setText("Novi racun");
        jbtnNoviRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNoviRacunActionPerformed(evt);
            }
        });

        jtxtSat.setEditable(false);

        jbtnIzlogujSe.setText("Izloguj se ");
        jbtnIzlogujSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzlogujSeActionPerformed(evt);
            }
        });

        jbtnPretragaRacuna.setText("Pretraga racuna");
        jbtnPretragaRacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPretragaRacunaActionPerformed(evt);
            }
        });

        jbtnPrijaviSe.setText("Prijavi se");
        jbtnPrijaviSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrijaviSeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlUlogovaniKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jtxtSat, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jBSviProizvodi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jBDodajNoviProizvod)
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnPretragaRacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnNoviRacun, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addComponent(jbtnIzlogujSe, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jbtnPrijaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSviProizvodi)
                    .addComponent(jBDodajNoviProizvod)
                    .addComponent(jbtnNoviRacun)
                    .addComponent(jbtnIzlogujSe))
                .addGap(26, 26, 26)
                .addComponent(jbtnPretragaRacuna)
                .addGap(79, 79, 79)
                .addComponent(jbtnPrijaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtSat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUlogovaniKorisnik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenuBar1.setToolTipText("");

        jMProizvodi.setText("Proizvodi");
        jMProizvodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMProizvodiActionPerformed(evt);
            }
        });

        jMProizvodisvi.setText("Proizvodi");
        jMProizvodisvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMProizvodisviActionPerformed(evt);
            }
        });
        jMProizvodi.add(jMProizvodisvi);

        jMenuBar1.add(jMProizvodi);

        jmRacun.setText("Racun");
        jmRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRacunActionPerformed(evt);
            }
        });

        jmiNoviRacun.setText("Novi racun");
        jmRacun.add(jmiNoviRacun);

        jMenuBar1.add(jmRacun);

        jMOAplikaciji.setText("O aplikacji");

        jMOautoru.setText("O autoru");
        jMOautoru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMOautoruActionPerformed(evt);
            }
        });
        jMOAplikaciji.add(jMOautoru);

        jMenuBar1.add(jMOAplikaciji);

        setJMenuBar(jMenuBar1);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSviProizvodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSviProizvodiActionPerformed
        try {
            // TODO add your handling code here:
            FPretragaNaocara fpretraga = new FPretragaNaocara();
            fpretraga.setVisible(true);
            fpretraga.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(FGlavna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(FGlavna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBSviProizvodiActionPerformed

    private void jBDodajNoviProizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDodajNoviProizvodActionPerformed
        FProizvodi fproizvodi = new FProizvodi(null, true);
        fproizvodi.setVisible(true);
        fproizvodi.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBDodajNoviProizvodActionPerformed

    private void jMProizvodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMProizvodiActionPerformed

    }//GEN-LAST:event_jMProizvodiActionPerformed

    private void jMProizvodisviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMProizvodisviActionPerformed
        try {

            FPretragaNaocara fpretraga = new FPretragaNaocara();
            fpretraga.setVisible(true);
            fpretraga.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(FGlavna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(FGlavna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMProizvodisviActionPerformed

    private void jbtnNoviRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNoviRacunActionPerformed

        FRacun fracun = new FRacun(this, true);
        fracun.setVisible(true);
        fracun.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtnNoviRacunActionPerformed

    private void jmRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRacunActionPerformed
        FRacun fracun = new FRacun(this, true);
        fracun.setVisible(true);
        fracun.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmRacunActionPerformed

    private void jMOautoruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMOautoruActionPerformed
        // TODO add your handling code here:
        FOAutoru oAutoru = new FOAutoru();
        oAutoru.setVisible(true);
        oAutoru.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMOautoruActionPerformed

    private void jbtnIzlogujSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzlogujSeActionPerformed
        Session.getInstance().setLogovaniKorisnik(null);
        FPrijava fprijava = new FPrijava();
        fprijava.setVisible(true);
        fprijava.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnIzlogujSeActionPerformed

    private void jbtnPretragaRacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPretragaRacunaActionPerformed
        // TODO add your handling code here:
        FPretragaRacuna fp = new FPretragaRacuna();
        fp.setVisible(true);
        fp.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtnPretragaRacunaActionPerformed

    private void jbtnPrijaviSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrijaviSeActionPerformed
        this.setVisible(false);
        FPrijava p = new FPrijava();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jbtnPrijaviSeActionPerformed

    public void prikaziSat() {

        NitSat n = new NitSat(jtxtSat);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDodajNoviProizvod;
    private javax.swing.JButton jBSviProizvodi;
    private javax.swing.JMenu jMOAplikaciji;
    private javax.swing.JMenuItem jMOautoru;
    private javax.swing.JMenu jMProizvodi;
    private javax.swing.JMenuItem jMProizvodisvi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jbtnIzlogujSe;
    private javax.swing.JButton jbtnNoviRacun;
    private javax.swing.JButton jbtnPretragaRacuna;
    private javax.swing.JButton jbtnPrijaviSe;
    private javax.swing.JLabel jlUlogovaniKorisnik;
    private javax.swing.JMenu jmRacun;
    private javax.swing.JMenuItem jmiNoviRacun;
    private javax.swing.JTextField jtxtSat;
    // End of variables declaration//GEN-END:variables

    private void srediMenu() {

        if (korisnik == null) {
            jMOAplikaciji.setEnabled(false);
            jmRacun.setEnabled(false);
            jbtnNoviRacun.setVisible(false);
            jMProizvodi.setEnabled(false);
            jbtnPretragaRacuna.setVisible(false);
            jBDodajNoviProizvod.setVisible(false);
            jBSviProizvodi.setVisible(false);
            jbtnIzlogujSe.setVisible(false);

            this.setTitle("");
        }

    }

    public void postaviMeni() {

        korisnik = session.Session.getInstance().getLogovaniKorisnik();
        jmRacun.setEnabled(true);
        jMOAplikaciji.setEnabled(true);
        jbtnNoviRacun.setVisible(true);
        jMProizvodi.setEnabled(true);
        jbtnPretragaRacuna.setVisible(true);
        jBDodajNoviProizvod.setVisible(true);
        jBSviProizvodi.setVisible(true);
        jlUlogovaniKorisnik.setText("Trenutni korisnik je" + " " + korisnik + "");
        jbtnIzlogujSe.setVisible(true);
        jbtnPrijaviSe.setVisible(false);
    }
}
