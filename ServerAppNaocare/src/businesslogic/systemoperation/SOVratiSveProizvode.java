/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.IDomenskiObjekat;
import domen.Proizvod;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class SOVratiSveProizvode extends AbstractSystemOperation {

    private List<Proizvod> proizvodi;

    public SOVratiSveProizvode(DatabaseBroker dBBroker) {
        super(dBBroker);
        proizvodi = new ArrayList<>();
    }

    @Override
    protected void validate(Object object) throws Exception {
    }

    @Override
    protected void checkPreCondition(Object object) throws Exception {
    }

    @Override
    protected void executeOperation(Object object) throws Exception {

        List<IDomenskiObjekat> idos = dBBroker.vratiSve(new Proizvod());
        for (IDomenskiObjekat ido : idos) {
            proizvodi.add((Proizvod) ido);
        }
        System.out.println("Izvrsava se slucaj koriscenja: Pregled svih proizvoda. ");
    }

    public List<Proizvod> getProizvodi() {
        return proizvodi;
    }

}
