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
public class SOObrisiProizvod extends AbstractSystemOperation {

    public SOObrisiProizvod(DatabaseBroker dBBroker) {
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
        Proizvod proizvodId = (Proizvod) object;

        try {
            dBBroker.obrisi(proizvodId);
            System.out.println("Izvršava se slučaj korišćenja: Brisanje proizvoda");
        } catch (Exception ex) {
            System.out.println("Greska kod brisanja");
            throw new Exception("Greska kod brisanja  proizvoda!");
        }
    }

}
