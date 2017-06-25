/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import session.Session;

/**
 *
 * @author Milena
 */
public class FIzborServera extends javax.swing.JFrame {

    /**
     * Creates new form FIzborServera
     */
    public FIzborServera() {
        initComponents();
        System.out.println("Povezivanje je u toku...");
        jtfIpAdr.setText("localhost");
        jtfBrPorta.setText("9000");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnPoveziSe = new javax.swing.JButton();
        jtfBrPorta = new javax.swing.JTextField();
        jtfIpAdr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Povezivanje sa serverom...");

        jbtnPoveziSe.setText("Povezi se");
        jbtnPoveziSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPoveziSeActionPerformed(evt);
            }
        });

        jLabel1.setText("Broj porta");

        jLabel2.setText("IP adresa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfIpAdr, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBrPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jbtnPoveziSe)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfIpAdr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfBrPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPoveziSe))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPoveziSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPoveziSeActionPerformed
        System.out.println("Povezivanje je u toku...");

        String ip = jtfIpAdr.getText();
        String port = jtfBrPorta.getText();
        if (ip.isEmpty() || port.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Morate uneti sve trazene vrednosti kako bi se povezali sa serverom!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
        int portInt = Integer.parseInt(port);
        try {
            poveziSeSaServerom(ip, portInt);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(FIzborServera.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Server ne postoji!", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnPoveziSeActionPerformed

    public void poveziSeSaServerom(String ipAdr, int brojPorta) throws IOException {
        Socket socket = new Socket(ipAdr, brojPorta);
        System.out.println("Klijent se povezao sa serverom");

        Session.getInstance().setSocket(socket);

        JOptionPane.showMessageDialog(this, "Uspesno ste se povezali sa serverom.");

        FGlavna fglavna = new FGlavna();
        fglavna.setVisible(true);
        fglavna.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnPoveziSe;
    private javax.swing.JTextField jtfBrPorta;
    private javax.swing.JTextField jtfIpAdr;
    // End of variables declaration//GEN-END:variables
}
