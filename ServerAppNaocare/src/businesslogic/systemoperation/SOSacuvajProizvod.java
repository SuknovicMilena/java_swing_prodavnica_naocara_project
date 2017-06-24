/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.Proizvod;

/**
 *
 * @author student
 */
public class SOSacuvajProizvod extends AbstractSystemOperation {

    public SOSacuvajProizvod(DatabaseBroker dBBroker) {
        super(dBBroker);
    }

    @Override
    protected void validate(Object object) {

    }

    @Override
    protected void checkPreCondition(Object object) {

    }

    @Override
    protected void executeOperation(Object object) throws Exception {
        Proizvod proizvod = (Proizvod) object;

        try {
            dBBroker.sacuvaj(proizvod);
            System.out.println("Izvrsava se slucaj koriscenja: Kreiranje novog proizvoda. ");
        } catch (Exception ex) {
            System.out.println("Greska kod cuvanja:" + proizvod.getNazivProizvoda());
            throw new Exception("Greska kod cuvanja  proizvoda!");
        }

    }

}
