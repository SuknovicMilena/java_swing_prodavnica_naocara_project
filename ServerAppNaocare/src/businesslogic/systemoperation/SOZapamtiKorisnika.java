/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.Korisnik;

/**
 *
 * @author Milena
 */
public class SOZapamtiKorisnika extends AbstractSystemOperation {

    public SOZapamtiKorisnika(DatabaseBroker dBBroker) {
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
        Korisnik korisnik = (Korisnik) object;

        try {
            dBBroker.sacuvaj(korisnik);
            System.out.println("Izvrsava se SK1: Registrovanje  novog korisnika. ");
        } catch (Exception ex) {
            System.out.println("Greska kod registrovanja");
            throw new Exception("Greska kod registrovanja  korisnika!");
        }

    }

}
