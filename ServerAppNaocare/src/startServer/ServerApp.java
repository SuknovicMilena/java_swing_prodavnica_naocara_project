/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startServer;

import java.io.IOException;
import server.forme.FServer;

/**
 *
 * @author student
 */
public class ServerApp {

    public static void main(String[] args) throws IOException, ClassNotFoundException, Exception {
        FServer fserver = new FServer();
        fserver.setVisible(true);
        fserver.setLocationRelativeTo(null);
        System.out.println("Aplikacija je pokrenuta, server nije pokrenut.");
    }

}
