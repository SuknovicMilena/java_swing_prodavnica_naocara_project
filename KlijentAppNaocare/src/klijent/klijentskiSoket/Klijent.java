/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klijent.klijentskiSoket;

import forme.FPrijava;
import java.io.IOException;
import java.net.Socket;
import session.Session;

/**
 *
 * @author student
 */
public class Klijent {

    public void poveziSeSaServerom() throws IOException {
        Socket socket = new Socket("127.0.0.1", 9000);
        System.out.println("Klijent se povezao sa serverom");

        Session.getInstance().setSocket(socket);

        FPrijava fglavna = new FPrijava();
        fglavna.setVisible(true);

    }
}
