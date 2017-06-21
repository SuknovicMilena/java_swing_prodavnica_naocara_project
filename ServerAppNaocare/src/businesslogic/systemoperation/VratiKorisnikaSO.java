/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.IDomenskiObjekat;
import domen.Korisnik;
import java.util.List;

/**
 *
 * @author Milena
 */
public class VratiKorisnikaSO extends AbstractSystemOperation {

    Korisnik korisnik = new Korisnik();
    IDomenskiObjekat idos;

    public VratiKorisnikaSO(DatabaseBroker dBBroker) {
        super(dBBroker);

    }

    @Override
    protected void validate(Object object) throws Exception {

    }

    @Override
    protected void checkPreCondition(Object object) throws Exception {

    }

    @Override
    protected void executeOperation(Object object) throws Exception {
        String korIme = (String) object;
        idos = dBBroker.vratiObjekatPoNekojKoloni(korisnik, korIme);
         System.out.println("Izvrsava se slucaj koriscenja: Vracanje svih korisnika po nekom atributu. ");
    }

    public Korisnik getKorisnik() {
        return (Korisnik) idos;
    }
}
