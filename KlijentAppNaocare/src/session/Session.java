/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import domen.Korisnik;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import response.OdgovorObjekat;

/**
 *
 * @author student
 */
public class Session {

    private Socket socket;
    private static Session instance;
    private Korisnik logovaniKorisnik;

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;

    }

    private Session() {

    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Korisnik getLogovaniKorisnik() {
        return logovaniKorisnik;
    }

    public void setLogovaniKorisnik(Korisnik logovaniKorisnik) {
        this.logovaniKorisnik = logovaniKorisnik;
    }

    public void send(request.ZahtevObjekat object) {
        ObjectOutputStream output = null;
        try {
            output = new ObjectOutputStream(socket.getOutputStream());
            output.writeObject(object);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Diskonektovani ste sa servera. Ugasite aplikaciju i startujte ponovo\"");
            System.out.println("Server je otkacio klijenta.");
        }
    }

    public OdgovorObjekat recieve() {
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(socket.getInputStream());

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Diskonektovani ste sa servera. Ugasite aplikaciju i startujte ponovo\"");
            System.out.println("Server je otkacio klijenta.");
        }
        try {
            return (OdgovorObjekat) input.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
