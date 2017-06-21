/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.IDomenskiObjekat;
import domen.Proizvod;
import domen.StavkaRacuna;

/**
 *
 * @author Milena
 */
public class DodajStavkeRacuna extends AbstractSystemOperation {

    public DodajStavkeRacuna(DatabaseBroker dBBroker) {
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
        StavkaRacuna sr = (StavkaRacuna) object;

        try {
            dBBroker.sacuvaj((IDomenskiObjekat) sr);
        } catch (Exception ex) {
            System.out.println("Greska kod cuvanja:" + sr.getRedniBrojStavke());
            throw new Exception("Greska kod cuvanja  stavki!");
        }
    }

}
