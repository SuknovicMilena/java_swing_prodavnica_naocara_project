/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.IDomenskiObjekat;
import domen.StavkaRacuna;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milena
 */
public class VratiStavkeRacunaSO extends AbstractSystemOperation {

    List<StavkaRacuna> listaStavki = new ArrayList<>();

    public VratiStavkeRacunaSO(DatabaseBroker dBBroker) {
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
        List<IDomenskiObjekat> idos = dBBroker.vratiSve(new StavkaRacuna());
        for (IDomenskiObjekat ido : idos) {
            listaStavki.add((StavkaRacuna) ido);
        }
        System.out.println("Izvrsava se slucaj koriscenja: Pregled stavki racuna. ");
    }

    public List<StavkaRacuna> getStavkeRacuna() {
        return listaStavki;
    }

}
