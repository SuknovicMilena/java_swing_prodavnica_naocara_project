/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startKlijent;

import java.io.IOException;
import klijent.klijentskiSoket.Klijent;

/**
 *
 * @author student
 */
public class KlijentApp {

    public static void main(String[] args) throws IOException {
        Klijent klijent = new Klijent();
        klijent.poveziSeSaServerom();

    }

}
