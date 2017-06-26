/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.IDomenskiObjekat;
import domen.Racun;
import domen.StavkaRacuna;


/**
 *
 * @author Milena
 */
public class SOZapamtiRacun extends AbstractSystemOperation {

    IDomenskiObjekat racun;

    public SOZapamtiRacun(DatabaseBroker dBBroker) {
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

        if (object instanceof Racun) {
            Racun racun = (Racun) object;
            try {
                racun.setBrojRacuna(0);
                int racunId=dBBroker.sacuvajIVratiId(racun);
                racun.setBrojRacuna(racunId);
                for (StavkaRacuna sr : racun.getStavkeRacuna()) {
                    sr.setRacun(racun);
                    dBBroker.sacuvaj(sr);
                }

                System.out.println("Izvrsava se SK1: Kreiranje novog racuna. ");
            } catch (Exception ex) {
                System.out.println("Greska kod cuvanja racuna");
                throw new Exception("Greska kod cuvanja  racuna!");
            }
        }

    }

}
