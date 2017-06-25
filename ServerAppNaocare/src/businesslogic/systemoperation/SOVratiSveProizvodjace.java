/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.IDomenskiObjekat;
import domen.Proizvodjac;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milena
 */
public class SOVratiSveProizvodjace extends AbstractSystemOperation {

    private List<Proizvodjac> proizvodjaci;

    public SOVratiSveProizvodjace(DatabaseBroker dBBroker) {
        super(dBBroker);
        proizvodjaci = new ArrayList<>();
    }

    @Override
    protected void validate(Object object) throws Exception {
    }

    @Override
    protected void checkPreCondition(Object object) throws Exception {
    }

    @Override
    protected void executeOperation(Object object) throws Exception {

        List<IDomenskiObjekat> idos = dBBroker.vratiSve(new Proizvodjac());
        for (IDomenskiObjekat ido : idos) {
            proizvodjaci.add((Proizvodjac) ido);
        }
        System.out.println("Izvrsava se slucaj koriscenja: Pregled svih proizvodjaca. ");

    }

    public List<Proizvodjac> getProizvodjac() {
        return proizvodjaci;
    }
}
