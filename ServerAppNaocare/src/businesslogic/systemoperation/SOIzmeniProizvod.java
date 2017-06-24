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
 * @author Milena
 */
public class SOIzmeniProizvod extends AbstractSystemOperation {

    public SOIzmeniProizvod(DatabaseBroker dBBroker) {
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
        Proizvod proizvod = (Proizvod) object;

        try {
            dBBroker.izmeni(proizvod);
            System.out.println("Izvršava se slučaj korišćenja SK6: Izmena naočara");
        } catch (Exception ex) {
            System.out.println("Greska kod izmene:" + proizvod.getNazivProizvoda());
            throw new Exception("Greska kod izmene  proizvoda!");
        }
    }

}
