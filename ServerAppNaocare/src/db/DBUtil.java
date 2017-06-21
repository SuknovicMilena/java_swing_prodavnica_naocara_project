/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Milena
 */
public class DBUtil {

    private final Properties properties;

    public DBUtil() throws FileNotFoundException, IOException {
        properties = new Properties();
        properties.load(new FileInputStream("db.config"));

    }

    public String vratiUrl() {
        return properties.getProperty(KonekcioniString.URL);
    }

    public String vratiKorisnika() {
        return properties.getProperty(KonekcioniString.USERNAME);
    }

    public String vratiSifru() {
        return properties.getProperty(KonekcioniString.PASSWORD);
    }
}
