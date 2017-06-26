/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.IDomenskiObjekat;
import domen.Korisnik;
import domen.Proizvod;

/**
 *
 * @author Milena
 */
public class SOVratiProizvod extends AbstractSystemOperation {

    Proizvod p = new Proizvod();
    IDomenskiObjekat ido;

    public SOVratiProizvod(DatabaseBroker dBBroker) {
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
        int proizvoId = (int) object;
        ido = dBBroker.vratiObjekatPoKljucu(p, proizvoId);

    }

    public Proizvod getProizvod() {
        return (Proizvod) ido;
    }

}
