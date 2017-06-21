/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.IDomenskiObjekat;
import domen.Korisnik;
import domen.Racun;
import domen.StavkaRacuna;
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

    public boolean pamtiSlozeniSlog(IDomenskiObjekat odo) throws SQLException, IOException {
        String upit;
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        try {
            Statement st = konekcija.createStatement();
            upit = " INSERT INTO " + odo.vratiNazivTabele()
                    + " VALUES (" + odo.vratiVrednostiZaInsert() + ")";
            st.executeUpdate(upit);
//            for (int j = 0; j < odo.vratiBrojVezanihObjekata(); j++) {
//                IDomenskiObjekat vezo;
//                for (int i = 0; i < odo.vratiBrojSlogovaVezanogObjekta(j); i++) {
//                    vezo = odo.vratiSlogVezanogObjekta(j, i);
//                    upit = " INSERT INTO " + vezo.vratiNazivTabele()
//                            + " VALUES (" + vezo.vratiVrednostiZaInsert() + ")";
//                    st.executeUpdate(upit);
//                }
//            }

            st.close();
        } catch (SQLException esql) {
            String porukaMetode = "\nNije zapamcen slozeni slog: " + esql;
            return false;
        }
        String porukaMetode = "\nZapamcen je slozeni slog.";
        return true;
    }

//    private int vratiMaxIDRacuna(Racun rac) throws SQLException, IOException {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//        String upit = "SELECT MAX(BrojRacuna) AS maks\n"
//                + "FROM racun";
//        int max = 0;
//        try {
//            Statement s = konekcija.createStatement();
//            ResultSet rs = s.executeQuery(upit);
//            while (rs.next()) {
//                max = rs.getInt("maks");
//            }
//            s.close();
//        } catch (SQLException sQLException) {
//
//        }
//        return max;
//    }
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

//    public void insertProizvod(Proizvod proizvod) throws SQLException, IOException, Exception {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//
//        konekcija.setAutoCommit(false);
//        Statement statement = null;
//        try {
//            String upit = " INSERT INTO proizvod (nazivProizvoda, cena, boja, tip, proizvodjacId) VALUES ('" + proizvod.getNazivProizvoda() + "',"
//                    + proizvod.getCena() + ",'" + proizvod.getBoja() + "','" + proizvod.getTip() + "'," + proizvod.getProizvodjac().getProizvodjacId() + ") ";
//
//            System.out.println(upit);
//            System.out.println("Izvršava se slučaj korišćenja: Dodavanje naočara");
//            statement = konekcija.createStatement();
//
//            statement.execute(upit);
//            konekcija.commit();
//        } catch (Exception e) {
//            konekcija.rollback();
//            throw new Exception("Proizvodi nisu sacuvani!");
//        } finally {
//            statement.close();
//
//        }
//    }
//    public void insertKorisnik(Korisnik korisnik) throws SQLException, IOException, Exception {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//
//        konekcija.setAutoCommit(false);
//        Statement statement = null;
//        try {
//            String upit = " INSERT INTO korisnik (ime, prezime, korisnickoIme, KorisnickaSifra) VALUES ('" + korisnik.getIme() + "','" + korisnik.getPrezime() + "','" + korisnik.getKorisnickoIme() + "','" + korisnik.getKorisnickaSifra() + "') ";
//
//            System.out.println(upit);
//            System.out.println("Izvršava se slučaj korišćenja: Registrovanje korisnika");
//            statement = konekcija.createStatement();
//
//            statement.execute(upit);
//            konekcija.commit();
//        } catch (Exception e) {
//            konekcija.rollback();
//            throw new Exception("Proizvodi nisu sacuvani!");
//        } finally {
//            statement.close();
//
//        }
//
//    }
    //  "Proizvod ID", "Naziv pr;oizvoda", "Cena", "Boja", "Tip"};
//    public List<Proizvod> getAllProizvodi() throws SQLException, IOException {
//
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//        ArrayList<Proizvod> proizvodi = new ArrayList<>();
//        List<Proizvodjac> proizvodjaci = this.getNazivProizvodjaci();
//        ResultSet rs = null;
//        String upitProizvodi = "SELECT * FROM proizvod";
//        System.out.println(upitProizvodi);
//        System.out.println("Izvršava se slučaj korišćenja: Pretraživanje naočara");
//        try {
//            Statement statement = konekcija.createStatement();
//            rs = statement.executeQuery(upitProizvodi);
//
//            while (rs.next()) {
//                Proizvod proizvod = new Proizvod();
//
//                proizvod.setProizvodId(rs.getInt("proizvodId"));
//                proizvod.setNazivProizvoda(rs.getString("nazivProizvoda"));
//                proizvod.setCena(rs.getDouble("cena"));
//                proizvod.setBoja(rs.getString("boja"));
//                proizvod.setTip(rs.getString("tip"));
//                int proizvodjacId = rs.getInt("proizvodjacId");
//                proizvod.setProizvodjac(proizvodjaci.stream().filter(o -> o.getProizvodjacId() == proizvodjacId).findFirst().get());
//                proizvodi.add(proizvod);
//            }
//            rs.close();
//
//        } catch (Exception e) {
//
//        }
//        return proizvodi;
//    }
//    public Proizvod getProizvodById(int id) throws SQLException {
//
//        Proizvod proizvod = null;
//        String upitProizvodi = "SELECT * FROM proizvod where proizvodId = " + id;
//        List<Proizvodjac> proizvodjaci = this.getNazivProizvodjaci();
//
//        System.out.println(upitProizvodi);
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery(upitProizvodi);
//
//            rs.first();
//            proizvod = new Proizvod();
//
//            proizvod.setProizvodId(rs.getInt("proizvodId"));
//            proizvod.setNazivProizvoda(rs.getString("nazivProizvoda"));
//            proizvod.setCena(rs.getDouble("cena"));
//            proizvod.setBoja(rs.getString("boja"));
//            proizvod.setTip(rs.getString("tip"));
//            int proizvodjacId = rs.getInt("proizvodjacId");
//            proizvod.setProizvodjac(proizvodjaci.stream().filter(o -> o.getProizvodjacId() == proizvodjacId).findFirst().get());
//
//        } catch (Exception e) {
//
//        }
//        return proizvod;
//    }
//    public List<Proizvodjac> getNazivProizvodjaci() throws SQLException, IOException {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//        ArrayList<Proizvodjac> proizvodjaci = new ArrayList<>();
//
//        String upit = "SELECT * FROM proizvodjac ";
//        System.out.println(upit);
//        try (Statement statement = konekcija.createStatement();
//                ResultSet rs = statement.executeQuery(upit)) {
//            while (rs.next()) {
//                Proizvodjac proizvodjac = new Proizvodjac();
//                proizvodjac.setProizvodjacId(rs.getInt("proizvodjacId"));
//                proizvodjac.setNaziv(rs.getString("naziv"));
//                proizvodjac.setZemlja(rs.getString("zemlja"));
//                proizvodjaci.add(proizvodjac);
//                System.out.println("uspesno");
//            }
//            rs.close();
//        }
//        return proizvodjaci;
//    }
//    public void izmeniProizvod(Proizvod proizvod) throws SQLException, IOException {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//               String upit = "UPDATE proizvod  SET nazivProizvoda=?, cena=?, boja=?, tip=?, proizvodjacId=? WHERE proizvodId=? ";
//        String sql = "UPDATE proizvod SET "
//                + "nazivProizvoda = '" + proizvod.getNazivProizvoda() + "', " + "cena = " + proizvod.getCena() + ","
//                + " " + "boja = '" + proizvod.getBoja() + "', " + "tip = '" + proizvod.getTip() + "',"
//                + " " + " proizvodjacId = " + proizvod.getProizvodjac().getProizvodjacId() + " "
//                + "WHERE proizvodId = " + proizvod.getProizvodId() + ";";
//
//        System.out.println(sql);
//        System.out.println("Izvršava se slučaj korišćenja: Izmena naočara");
//        PreparedStatement ps;
//        try {
//            ps = konekcija.prepareStatement(sql);
//            ps.executeUpdate();
//            ps.close();
//
//        } catch (Exception ex) {
//
//        }
//    }
//        try (PreparedStatement ps = connection.prepareStatement(upit)) {
    //            ps.setInt(1, proizvod.getProizvodId());
    //            ps.setString(2, proizvod.getNazivProizvoda());
    //            ps.setDouble(3, proizvod.getCena());
    //            ps.setString(4, proizvod.getBoja());
    //            ps.setString(5, proizvod.getTip());
    //            ps.setInt(3, proizvod.getProizvodjac().getProizvodjacId());
    //            ps.executeUpdate();
    //        }
//    public int getId() throws SQLException, IOException {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//        Proizvod proizvod = new Proizvod();
//        List<Proizvodjac> proizvodjaci = this.getNazivProizvodjaci();
//
//        String upitProizvodi = "SELECT * FROM proizvod";
//        System.out.println(upitProizvodi);
//        try {
//            Statement statement = konekcija.createStatement();
//            ResultSet rs = statement.executeQuery(upitProizvodi);
//
//            while (rs.first()) {
//
//                proizvod.setProizvodId(rs.getInt("proizvodId"));
//
//                int proizvodjacId = rs.getInt("proizvodjacId");
//                proizvod.setProizvodjac(proizvodjaci.stream().filter(o -> o.getProizvodjacId() == proizvodjacId).findFirst().get());
//
//            }
//            konekcija.close();
//
//        } catch (Exception e) {
//
//        }
//        return proizvod.getProizvodId();
//    }
//    public void obrisiProizvod(String proizvodId) throws SQLException, IOException {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//        // da nismo stavili navodnike oko poslatog id-ja obrisalo bi se sve!!!
//        String upit = "DELETE FROM proizvod WHERE  proizvodId = '" + proizvodId + "'  ; ";
//        System.out.println(upit);
//        System.out.println("Izvršava se slučaj korišćenja: Brisanje naočara");
//        PreparedStatement ps;
//        try {
//            ps = konekcija.prepareStatement(upit);
//            ps.executeUpdate();
//            ps.close();
//
//        } catch (Exception ex) {
//
//        }
//    }
//    public void obrisiKorisnika(int korisnikId) throws SQLException, IOException {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//        // da nismo stavili navodnike oko poslatog id-ja obrisalo bi se sve!!!
//        String upit = "DELETE FROM korisnik WHERE  korisnikId = '" + korisnikId + "'  ; ";
//        System.out.println(upit);
//        System.out.println("Izvršava se slučaj korišćenja: Brisanje korisnika");
//        PreparedStatement ps;
//        try {
//            ps = konekcija.prepareStatement(upit);
//            ps.executeUpdate();
//            ps.close();
//
//        } catch (Exception ex) {
//
//        }
//    }
    public List<Korisnik> prijaviKorisnika() throws SQLException, IOException {
        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
        ArrayList<Korisnik> korisnici = new ArrayList<>();

        String upit = "SELECT korisnickoIme,korisnickaSifra FROM korisnik ";
        System.out.println(upit);
        try (Statement statement = konekcija.createStatement();
                ResultSet rs = statement.executeQuery(upit)) {
            while (rs.next()) {
                Korisnik korisnik = new Korisnik();

                korisnik.setKorisnickoIme(rs.getString("korisnickoIme"));
                korisnik.setKorisnickaSifra(rs.getString("korisnickaSifra"));

                korisnici.add(korisnik);
                System.out.println("uspesno");
            }
            rs.close();
        }
        return korisnici;

    }

//    public List<Korisnik> vratiSveKorisnike() throws SQLException, IOException {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//        ArrayList<Korisnik> korisnici = new ArrayList<>();
//
//        String upit = "SELECT korisnikId,ime,prezime,korisnickoIme FROM korisnik ";
//        System.out.println(upit);
//        try (Statement statement = konekcija.createStatement();
//                ResultSet rs = statement.executeQuery(upit)) {
//            while (rs.next()) {
//                Korisnik korisnik = new Korisnik();
//
//                korisnik.setKorisnikId(rs.getInt("korisnikId"));
//                korisnik.setIme(rs.getString("ime"));
//                korisnik.setPrezime(rs.getString("prezime"));
//                korisnik.setKorisnickoIme(rs.getString("korisnickoIme"));
//
//                korisnici.add(korisnik);
//                System.out.println("uspesno");
//            }
//            rs.close();
//        }
//        return korisnici;
//
//    }
//    public Korisnik vratiKorisnikaPoSifri(String korisnickaSifra) throws SQLException, IOException {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//        Korisnik korisnik = new Korisnik();
//
//        String upit = "SELECT ime,prezime FROM korisnik WHERE korisnickaSifra = '" + korisnickaSifra + "' ";
//
//        System.out.println(upit);
//
//        try {
//            Statement statement = konekcija.createStatement();
//            ResultSet rs = statement.executeQuery(upit);
//            rs.first();
//
//            korisnik.setIme(rs.getString("ime"));
//            korisnik.setPrezime(rs.getString("prezime"));
//            System.out.println("uspesno");
//
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//        return korisnik;
//
//    }
//    public void insertStavkaRacuna(StavkaRacuna sr) throws SQLException, IOException, Exception {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//
//        konekcija.setAutoCommit(false);
//        Statement statement = null;
//        try {
//            String upit = " INSERT INTO stavkaracuna (redniBrojStavke, iznosStavke, proizvodId) VALUES (" + sr.getRedniBrojStavke() + ","
//                    + sr.getIznosStavke() + "," + sr.getProizvod().getProizvodId() + ") ";
//
//            System.out.println(upit);
//            System.out.println("Izvršava se slučaj korišćenja: Ubacivanje stavki racuna");
//            statement = konekcija.createStatement();
//
//            statement.execute(upit);
//            konekcija.commit();
//        } catch (Exception e) {
//            konekcija.rollback();
//            throw new Exception("Stavke računa nisu sacuvani!");
//        } finally {
//            statement.close();
//
//        }
//    }
//
//    public void insertRacun(Racun racun) throws SQLException, IOException, Exception {
//        Connection konekcija = Konekcija.vratiObjekat().vratiKonekciju();
//
//        konekcija.setAutoCommit(false);
//        Statement statement = null;
//        try {
//            String upit = " INSERT INTO racun (datumKupovine, ukupanIznos, korisnikId) VALUES (" + racun.getDatumKupovine() + ","
//                    + racun.getUkupanIznos() + "," + racun.getKorisnik().getKorisnikId() + ") ";
//
//            System.out.println(upit);
//            System.out.println("Izvršava se slučaj korišćenja: Ubacivanje stavki raČuna");
//            statement = konekcija.createStatement();
//
//            statement.execute(upit);
//            konekcija.commit();
//        } catch (Exception e) {
//            konekcija.rollback();
//            throw new Exception("Stavke računa nisu sacuvani!");
//        } finally {
//            statement.close();
//
//        }
//    }
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
