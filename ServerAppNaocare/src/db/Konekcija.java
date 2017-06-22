/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Konekcija {

    private static Konekcija objekat;
    private Connection konekcija;
    String url;
    String user;
    String password;
    String sema;
    String ip;
    String port;
    String url1;

    public Konekcija() throws SQLException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBUtil dbutil = new DBUtil();
        url = dbutil.vratiUrl();
        user = dbutil.vratiKorisnika();
        password = dbutil.vratiSifru();
        sema = dbutil.vratiSemu();
        ip = dbutil.vratiIP();
        port = dbutil.vratiPort();
        url1 = url + ip + ":" + port + "/" + sema;
        konekcija = DriverManager.getConnection(url1, user, password);
        konekcija.setAutoCommit(false);
    }

    public Connection vratiKonekciju() {
        return konekcija;
    }

    public static Konekcija vratiObjekat() throws SQLException, IOException {
        if (objekat == null) {
            objekat = new Konekcija();
        }
        return objekat;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSema() {
        return sema;
    }

    public void setSema(String sema) {
        this.sema = sema;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

}
