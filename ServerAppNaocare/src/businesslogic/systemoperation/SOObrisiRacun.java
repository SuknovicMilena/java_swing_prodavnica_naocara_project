/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.Racun;

/**
 *
 * @author Milena
 */
public class SOObrisiRacun extends AbstractSystemOperation {

    public SOObrisiRacun(DatabaseBroker dBBroker) {
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
        Racun racun = (Racun) object;

        try {
            dBBroker.obrisi(racun);
            System.out.println("Izvršava se slučaj korišćenja: Brisanje  racuna");
        } catch (Exception ex) {
            System.out.println("Greska kod brisanja");
            throw new Exception("Greska kod brisanja racuna!"
                    + "Morate izbrisati prvo sve stavke ovog racuna.");
        }
    }

}
