/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import businesslogic.systemoperation.AbstractSystemOperation;
import db.DatabaseBroker;
import domen.IDomenskiObjekat;
import domen.Korisnik;

/**
 *
 * @author Milena
 */
public class ObrisiKorisnikaSO extends AbstractSystemOperation {

    public ObrisiKorisnikaSO(DatabaseBroker dBBroker) {
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
        Korisnik korisnikId = (Korisnik) object;
        try {
            dBBroker.obrisi(korisnikId);
            System.out.println("Izvršava se slučaj korišćenja: Brisanje korisnika");
        } catch (Exception ex) {
            System.out.println("Greska kod brisanja");
            throw new Exception("Greska kod brisanja  korisnika!");
        }
    }

}
