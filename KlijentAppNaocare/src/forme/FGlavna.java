/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
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

        jlUlogovaniKorisnik.setForeground(Color.GREEN);

        //Option dialog za zatvaranje aplikacije
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                Object[] opcije = {"Da", "Ne"};
                int izbor = JOptionPane.showOptionDialog(null, "Da li ste sigurni zelite zatvoriti aplikaciju?", "Kraj", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, opcije, "Da");
                if (izbor == 0) {

                    System.exit(0);
                }
            }
        });

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
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

        jlUlogovaniKorisnik.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlUlogovaniKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jtxtSat, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBDodajNoviProizvod, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jBSviProizvodi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbtnPretragaRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbtnNoviRacun, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnIzlogujSe, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnPrijaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnIzlogujSe)
                        .addComponent(jbtnPretragaRacuna))
                    .addComponent(jBSviProizvodi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDodajNoviProizvod)
                    .addComponent(jbtnNoviRacun))
                .addGap(96, 96, 96)
                .addComponent(jbtnPrijaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
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
        jmiNoviRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNoviRacunActionPerformed(evt);
            }
        });
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
        try {
            FPretragaNaocara fp = new FPretragaNaocara();
            FProizvodi fproizvodi = new FProizvodi(fp, true, null);
            fproizvodi.setVisible(true);
            fproizvodi.setLocationRelativeTo(null);
        } catch (Exception ex) {
            Logger.getLogger(FGlavna.class.getName()).log(Level.SEVERE, null, ex);
        }

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

    private void jmiNoviRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNoviRacunActionPerformed
        FRacun fracun = new FRacun(this, true);
        fracun.setVisible(true);
        fracun.setLocationRelativeTo(null);
    }//GEN-LAST:event_jmiNoviRacunActionPerformed

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

            jMOAplikaciji.setVisible(false);
            jmRacun.setVisible(false);
            jbtnNoviRacun.setVisible(false);
            jMProizvodi.setVisible(false);
            jbtnPretragaRacuna.setVisible(false);
            jBDodajNoviProizvod.setVisible(false);
            jBSviProizvodi.setVisible(false);
            jbtnIzlogujSe.setVisible(false);

            this.setTitle("Prijavite se ili registrujte na sistem...");
        }

    }

    public void postaviMeni() {
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        korisnik = session.Session.getInstance().getLogovaniKorisnik();
        jmRacun.setVisible(true);
        jMOAplikaciji.setVisible(true);
        jbtnNoviRacun.setVisible(true);
        jMProizvodi.setVisible(true);
        jbtnPretragaRacuna.setVisible(true);
        jBDodajNoviProizvod.setVisible(true);
        jBSviProizvodi.setVisible(true);
        jlUlogovaniKorisnik.setText("Trenutni korisnik je" + " " + korisnik + "");
        jbtnIzlogujSe.setVisible(true);
        jbtnPrijaviSe.setVisible(false);
        this.setTitle("Glavna forma");
    }
}
