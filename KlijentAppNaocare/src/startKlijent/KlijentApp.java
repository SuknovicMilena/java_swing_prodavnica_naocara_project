/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startKlijent;

import forme.FIzborServera;
import java.io.IOException;

/**
 *
 * @author student
 */
public class KlijentApp {

    public static void main(String[] args) throws IOException {

        FIzborServera izbor = new FIzborServera();
        izbor.setVisible(true);
        izbor.setLocationRelativeTo(null);

    }

}
