/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.IDomenskiObjekat;
import domen.Korisnik;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Milena
 */
public class DatabaseBroker {

    public List<IDomenskiObjekat> vratiSve(IDomenskiObjekat ido) throws SQLException, IOException {
        List<IDomenskiObjekat> idos = new ArrayList<>();
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        String upit = "SELECT * FROM " + ido.vratiNazivTabele();
        Statement statement = konekcija.createStatement();
        ResultSet rs = statement.executeQuery(upit);
        idos = ido.vratiListu(rs);
        statement.close();
        return idos;
    }

    public IDomenskiObjekat vratiObjekat(IDomenskiObjekat ido) throws SQLException, IOException {
        IDomenskiObjekat idos;
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        String upit = "SELECT * FROM " + ido.vratiNazivTabele();
        Statement statement = konekcija.createStatement();
        ResultSet rs = statement.executeQuery(upit);
        idos = ido.vratiObjekat(rs);
        statement.close();
        return idos;
    }

    public IDomenskiObjekat sacuvaj(IDomenskiObjekat obj) throws SQLException, IOException {
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        String upit = "INSERT INTO " + obj.vratiNazivTabele() + " VALUES (" + obj.vratiVrednostiZaInsert() + ")";
        System.out.println(upit);
        try (Statement st = konekcija.createStatement()) {
            st.executeUpdate(upit);
        }

        return obj;
    }

    public IDomenskiObjekat pamtiSlozeniSlog(IDomenskiObjekat odo) throws SQLException, IOException {
        String upit;
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        try {
            Statement st = konekcija.createStatement();
            upit = " INSERT INTO " + odo.vratiNazivTabele()
                    + " VALUES (" + odo.vratiVrednostiZaInsert() + ")";
            System.out.println(upit);
            st.execute(upit, Statement.RETURN_GENERATED_KEYS);
            int insertedId = st.getGeneratedKeys().getInt("brojRacuna");
            System.out.println(insertedId);
            st.close();

            IDomenskiObjekat vezo;
            for (int i = 0; i < odo.vratiBrojSlogovaVezanogObjekta(); i++) {
                st = konekcija.createStatement();

                vezo = odo.vratiSlogVezanogObjekta(i);
                upit = " INSERT INTO " + vezo.vratiNazivTabele()
                        + " VALUES (" + vezo.vratiVrednostiZaInsert() + ")";
                System.out.println(upit);
                st.executeUpdate(upit);
            }

            st.close();
        } catch (SQLException esql) {
            System.out.println(esql.getMessage());
        }
        return odo;
    }

    public IDomenskiObjekat vratiObjekatPoKljucu(IDomenskiObjekat odo, int id) throws SQLException, IOException {
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        String upit = "SELECT * FROM " + odo.vratiNazivTabele() + " WHERE " + odo.vratiPK() + " = " + id;
        System.out.println(upit);

        ArrayList<IDomenskiObjekat> lista = new ArrayList<>();
        try {
            Statement st = konekcija.createStatement();
            ResultSet rs = st.executeQuery(upit);
            lista = (ArrayList<IDomenskiObjekat>) odo.vratiListu(rs);
            st.close();
        } catch (SQLException sQLException) {

        }

        return lista.get(0);

    }

    public IDomenskiObjekat vratiObjekatPoNekojKoloni(IDomenskiObjekat odo, String filter) throws SQLException, IOException {
        IDomenskiObjekat idos;
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        String upit = "SELECT * FROM " + odo.vratiNazivTabele() + " WHERE " + odo.vratiKolonuZaFiltriranje() + " = '" + filter + "';";
        System.out.println(upit);
        IDomenskiObjekat obj = null;
        try {
            Statement st = konekcija.createStatement();
            ResultSet rs = st.executeQuery(upit);
            obj = odo.vratiObjekat(rs);
            st.close();
        } catch (SQLException sQLException) {

        }

        return obj;

    }

    public void izmeni(IDomenskiObjekat odo) throws SQLException, IOException {
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        String upit;
        try {
            Statement st = konekcija.createStatement();
            upit = "UPDATE " + odo.vratiNazivTabele()
                    + " SET " + odo.vratiVrednostiZaUpdate()
                    + " WHERE " + odo.vratiPK() + "=" + odo.vratiVrednostPK();
            System.out.println("PROMENI SLOG" + upit);
            st.executeUpdate(upit);
            st.close();
        } catch (SQLException esql) {

        }

    }

    public void obrisi(IDomenskiObjekat odo) throws SQLException, IOException {
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        String upit = "DELETE FROM " + odo.vratiNazivTabele() + " WHERE " + odo.vratiPK() + "=" + odo.vratiVrednostPK();

        Statement st = (Statement) konekcija.createStatement();
        st.executeUpdate(upit);

        st.close();

    }

    public void obrisiSaSlozenimPK(IDomenskiObjekat odo) throws SQLException, IOException {
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        String upit = "DELETE FROM " + odo.vratiNazivTabele() + odo.vratiSlozeniPK();

        Statement s = (Statement) konekcija.createStatement();
        s.executeUpdate(upit);

        s.close();

    }

    public void commit() {
        try {
            Konekcija.vratiObjekat().vratiKonekciju().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void rollback() {
        try {
            Konekcija.vratiObjekat().vratiKonekciju().rollback();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
