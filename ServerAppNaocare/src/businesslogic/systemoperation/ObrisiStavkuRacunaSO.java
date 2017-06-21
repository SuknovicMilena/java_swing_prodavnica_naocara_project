/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.StavkaRacuna;

/**
 *
 * @author Milena
 */
public class ObrisiStavkuRacunaSO extends AbstractSystemOperation {

    public ObrisiStavkuRacunaSO(DatabaseBroker dBBroker) {
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
        StavkaRacuna st = (StavkaRacuna) object;

        try {
            dBBroker.obrisiSaSlozenimPK(st);
            System.out.println("Izvršava se slučaj korišćenja: Brisanje stavke racuna");
        } catch (Exception ex) {
            System.out.println("Greska kod brisanja");
            throw new Exception("Greska kod brisanja  stavki racuna!");
        }
    }

}
