/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nitiServer;

import server.forme.FServer;
import domen.Korisnik;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import nitiServer.NitKlijent;

public class NitPokretanjeServera extends Thread {

    boolean signal = true;
    FServer server;

    private List<NitKlijent> listaAktivnihKlijenata = new ArrayList<>();
    private List<Korisnik> listaKorisnika = new ArrayList<>();
    NitKlijent klijent;
    Socket soket;

    public NitPokretanjeServera(FServer s) {
        server = s;
    }

    @Override
    public void run() {
        try {
            pokreniServera();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(NitPokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pokreniServera() throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(9000);
        System.out.println("Server program je pokrenut!\n Cekam klijente.");
        while (signal) {
            soket = serverSocket.accept();
            System.out.println("Klijent se povezao sa serverom");
            klijent = new NitKlijent(soket, this, listaKorisnika, server);
            klijent.start();
            listaAktivnihKlijenata.add(klijent);

        }

    }

    public List<NitKlijent> getListaAktivnihKlijenata() {
        return listaAktivnihKlijenata;
    }

    public void setListaAktivnihKlijenata(List<NitKlijent> listaAktivnihKlijenata) {
        this.listaAktivnihKlijenata = listaAktivnihKlijenata;
    }

    public Socket getSoket() {
        return soket;
    }

    public void setSoket(Socket soket) {
        this.soket = soket;
    }

    public List<Korisnik> getListaKorisnika() {
        return listaKorisnika;
    }

    public void setListaKorisnika(List<Korisnik> listaKorisnika) {
        this.listaKorisnika = listaKorisnika;
    }

    public boolean isSignal() {
        return signal;
    }

    public void setSignal(boolean signal) {
        this.signal = signal;
    }

}
