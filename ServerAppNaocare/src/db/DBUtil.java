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

    private Properties properties;

    public DBUtil() throws FileNotFoundException, IOException {
        properties = new Properties();
        ucitajProperti();

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

    public String vratiSemu() {
        return properties.getProperty(KonekcioniString.SEMA);
    }

    public String vratiIP() {
        return properties.getProperty(KonekcioniString.IP);
    }

    public String vratiPort() {
        return properties.getProperty(KonekcioniString.PORT);
    }

    public void setUrl(String value) {
        properties.setProperty("url", value);

    }

    public void setKorisnikUserName(String value) {
        properties.setProperty("username", value);

    }

    public void setSifruKorisnika(String value) {
        properties.setProperty("password", value);
    }

    public void setSemu(String value) {
        properties.setProperty("sema", value);

    }

    public void setIP(String value) {
        properties.setProperty("ip", value);
    }

    public void setPort(String value) {
        properties.setProperty("port", value);
    }

    public void ucitajProperti() throws IOException {
        FileInputStream file = new FileInputStream("db.config");

        properties.load(file);
        file.close();
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
