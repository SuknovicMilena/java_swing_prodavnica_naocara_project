/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Proizvod;
import domen.Proizvodjac;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelTabele.ModelTabeleProizvod;

/**
 *
 * @author Milena
 */
public class FPretragaNaocara extends javax.swing.JFrame {

    /**
     * Creates new form FPretragaNaocara
     */
    public FPretragaNaocara() throws IOException, Exception {

        initComponents();
        popuniTabeluProizvod();

    }

    public JTable getjTProizvodi() {
        return jTProizvodi;
    }

    public void setjTProizvodi(JTable jTProizvodi) {
        this.jTProizvodi = jTProizvodi;
    }

//    FPretragaNaocara(Container parent, boolean b) throws Exception {
//        initComponents();
//        popuniTabeluProizvod();
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTProizvodi = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jBDetalji = new javax.swing.JButton();
        jBDodaj = new javax.swing.JButton();
        jtfPretraga = new javax.swing.JTextField();
        jbtnPretrazi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pretraga naočara");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTProizvodi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTProizvodi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proizvod ID", "Naziv proizvoda", "Cena", "Boja", "Tip", "Proizvodjac"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTProizvodi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, -1, 219));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Operacije"));

        jBDetalji.setText("Detalji");
        jBDetalji.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jBDetaljiComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jBDetaljiComponentRemoved(evt);
            }
        });
        jBDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDetaljiActionPerformed(evt);
            }
        });
        jBDetalji.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBDetaljiKeyPressed(evt);
            }
        });

        jBDodaj.setText("Dodaj");
        jBDodaj.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jBDodajComponentHidden(evt);
            }
        });
        jBDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBDetalji, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jBDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBDetalji, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 20, -1, -1));
        getContentPane().add(jtfPretraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 258, 247, 41));

        jbtnPretrazi.setText("Pretrazi");
        jbtnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPretraziActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPretrazi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 168, 41));

        jLabel1.setText("Pretraga proizvoda je po nazivu proizvoda!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 311, 251, -1));

        jLabel2.setText("Pretraga proizvoda");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 123, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDetaljiActionPerformed

        if (jTProizvodi.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Morate izabrati red u tabeli!", "Greska", JOptionPane.ERROR_MESSAGE);

        } else {

            FProizvodi formaZaUnos = new FProizvodi(this, true);
            int index = jTProizvodi.getSelectedRow();
            Proizvod proizvod = klijentKontroler.KlijentKontroler.getInstance().vratiProizvode().get(index);
            formaZaUnos.updateProizvod(proizvod);

            formaZaUnos.setTitle("Detalji proizvoda");
            formaZaUnos.setVisible(true);
            formaZaUnos.setLocationRelativeTo(null);

        }

    }//GEN-LAST:event_jBDetaljiActionPerformed

    private void jBDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDodajActionPerformed
        FProizvodi fproizvodi = new FProizvodi(this, true);
        fproizvodi.setVisible(true);
        fproizvodi.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBDodajActionPerformed

    private void jBDetaljiComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jBDetaljiComponentRemoved

    }//GEN-LAST:event_jBDetaljiComponentRemoved

    private void jBDetaljiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBDetaljiKeyPressed

    }//GEN-LAST:event_jBDetaljiKeyPressed

    private void jBDodajComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jBDodajComponentHidden

    }//GEN-LAST:event_jBDodajComponentHidden

    private void jBDetaljiComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jBDetaljiComponentAdded

    }//GEN-LAST:event_jBDetaljiComponentAdded

    private void jbtnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPretraziActionPerformed
        // TODO add your handling code here:

        String nazivProizvoda = jtfPretraga.getText().trim();
        try {
            List<Proizvod> listaSvihProizvoda = klijentKontroler.KlijentKontroler.getInstance().vratiProizvode();
            ArrayList<Proizvod> listaPoslePretrage = new ArrayList<>();

            for (Proizvod p : listaSvihProizvoda) {
                if (p.getNazivProizvoda().toLowerCase().startsWith(nazivProizvoda) || p.getNazivProizvoda().startsWith(nazivProizvoda)) {
                    listaPoslePretrage.add(p);
                }
            }
            JOptionPane.showMessageDialog(this, "Pretraga je zavrsena!");

            popuniTabeluSaPretragom(listaPoslePretrage);
        } catch (Exception ex) {
            System.out.println("Sistem ne moze da nadje proizvode  sa tim imenom!" + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje korisnike  sa tim vrednostima", "Greska", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtnPretraziActionPerformed

    public void popuniTabeluProizvod() throws IOException, Exception {
        List<Proizvodjac> listaProizvodjaca = klijentKontroler.KlijentKontroler.getInstance().vratiSveProizvodjace();
        ModelTabeleProizvod model = new ModelTabeleProizvod(klijentKontroler.KlijentKontroler.getInstance().vratiProizvode(), listaProizvodjaca);
        jTProizvodi.setModel(model);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDetalji;
    private javax.swing.JButton jBDodaj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProizvodi;
    private javax.swing.JButton jbtnPretrazi;
    private javax.swing.JTextField jtfPretraga;
    // End of variables declaration//GEN-END:variables

    private void popuniTabeluSaPretragom(ArrayList<Proizvod> listaPoslePretrage) {
        List<Proizvodjac> listaProizvodjaca = klijentKontroler.KlijentKontroler.getInstance().vratiSveProizvodjace();
        ModelTabeleProizvod tmc = new ModelTabeleProizvod(listaPoslePretrage, listaProizvodjaca);
        jTProizvodi.setModel(tmc);
        if (listaPoslePretrage.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje zadati proizvod", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ModelTabeleProizvod vratiModel() {
        ModelTabeleProizvod model = (ModelTabeleProizvod) jTProizvodi.getModel();
        return model;

    }

    public void setujPonovoModel(ModelTabeleProizvod model) {

        jTProizvodi.setModel(model);

    }

}
