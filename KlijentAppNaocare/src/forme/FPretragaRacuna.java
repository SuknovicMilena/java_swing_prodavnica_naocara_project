/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import domen.Proizvod;
import domen.Racun;
import domen.StavkaRacuna;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelTabele.ModelTabeleRacun;
import modelTabele.ModelTabeleStavkaRacuna;

/**
 *
 * @author Milena
 */
public class FPretragaRacuna extends javax.swing.JFrame {

    /**
     * Creates new form FPretragaRacuna
     */
    ModelTabeleRacun modelRacun;
    ModelTabeleStavkaRacuna model;
    List<Racun> racuni;
    List<Korisnik> korisnici;
    Racun r;
    StavkaRacuna sr;

    public FPretragaRacuna() {
        initComponents();
        popuniTabeluRacuna();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableRacun = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStavkeRacuna = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbtnBrisanjeRacuna = new javax.swing.JButton();
        jbtnBrisanjeStavki = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pretraga racuna");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Svi racuni"));

        jtableRacun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Broj racuna", "Datum kupovine", "Ukupan iznos", "Korisnik"
            }
        ));
        jtableRacun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableRacunMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableRacun);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Stavke izabranog racuna"));

        jTableStavkeRacuna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Redni broj stavke", "Broj racuna", "Iznos stavke", "Proizvod"
            }
        ));
        jScrollPane2.setViewportView(jTableStavkeRacuna);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Operacije")));

        jbtnBrisanjeRacuna.setText("Brisanje racuna");
        jbtnBrisanjeRacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrisanjeRacunaActionPerformed(evt);
            }
        });

        jbtnBrisanjeStavki.setText("Brisanje stavki");
        jbtnBrisanjeStavki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrisanjeStavkiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtnBrisanjeStavki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtnBrisanjeRacuna, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jbtnBrisanjeRacuna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnBrisanjeStavki)
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void jtableRacunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableRacunMouseClicked
        List<StavkaRacuna> stavke = klijentKontroler.KlijentKontroler.getInstance().vratSveStavke();

        List<StavkaRacuna> stavkeOdRacuna = new ArrayList<>();

        int sifra = jtableRacun.getSelectedRow();
        if (sifra < 0) {
            JOptionPane.showMessageDialog(this, "Morate selektovati jedan red!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        modelRacun = (ModelTabeleRacun) jtableRacun.getModel();
        r = modelRacun.vratiRacun(sifra);

        int brojRacuna = r.getBrojRacuna();
        for (StavkaRacuna stavkaRacuna : stavke) {
            int stavkaBrojRac = stavkaRacuna.getRacun().getBrojRacuna();
            if (brojRacuna == stavkaBrojRac) {
                stavkeOdRacuna.add(stavkaRacuna);
                r.setStavkeRacuna(stavkeOdRacuna);
            }
        }
        List<Proizvod> listaProizvoda = klijentKontroler.KlijentKontroler.getInstance().vratiProizvode();
        model = new ModelTabeleStavkaRacuna(r, listaProizvoda);

        jTableStavkeRacuna.setModel(model);

    }//GEN-LAST:event_jtableRacunMouseClicked

    private void jbtnBrisanjeRacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrisanjeRacunaActionPerformed
        // TODO add your handling code here:
        int sifra = jtableRacun.getSelectedRow();

        if (sifra < 0) {
            JOptionPane.showMessageDialog(this, "Morate izabrati red u tabeli!", "Greska", JOptionPane.ERROR_MESSAGE);

        } else {
            modelRacun = (ModelTabeleRacun) jtableRacun.getModel();
            if (r.getStavkeRacuna().size() > 0) {
                JOptionPane.showMessageDialog(this, "Mozete izbrisati samo racun sa predhodno uklonjenim stavkama!", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            }

            FPregledPojedinacnogRacuna fp = new FPregledPojedinacnogRacuna(this, true, r);
            fp.pogledajRacun(r);
            fp.setVisible(true);
            fp.setLocationRelativeTo(null);

        }

    }//GEN-LAST:event_jbtnBrisanjeRacunaActionPerformed

    private void jbtnBrisanjeStavkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrisanjeStavkiActionPerformed
        int sifra = jTableStavkeRacuna.getSelectedRow();
        if (sifra < 0) {
            JOptionPane.showMessageDialog(this, "Morate izabrati red u tabeli!", "Greska", JOptionPane.ERROR_MESSAGE);

        } else {
            model = (ModelTabeleStavkaRacuna) jTableStavkeRacuna.getModel();
            sr = model.vratiStavku(sifra);

            FStavkaRacuna izmena = new FStavkaRacuna(this, true, sr);
            izmena.pogledajStavku(sr);
            izmena.setVisible(true);
            izmena.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jbtnBrisanjeStavkiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableStavkeRacuna;
    private javax.swing.JButton jbtnBrisanjeRacuna;
    private javax.swing.JButton jbtnBrisanjeStavki;
    private javax.swing.JTable jtableRacun;
    // End of variables declaration//GEN-END:variables

    public void popuniTabeluRacuna() {
        racuni = klijentKontroler.KlijentKontroler.getInstance().vratiRacun();
        korisnici = klijentKontroler.KlijentKontroler.getInstance().vratiSveKorisnike();
        modelRacun = new ModelTabeleRacun(racuni, korisnici);
        jtableRacun.setModel(modelRacun);
    }

    public ModelTabeleStavkaRacuna vratiModel() {
        model = (ModelTabeleStavkaRacuna) jTableStavkeRacuna.getModel();
        return model;
    }

    public ModelTabeleRacun vratiModelRacuna() {
        modelRacun = (ModelTabeleRacun) jtableRacun.getModel();
        return modelRacun;
    }

}
