/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.IDomenskiObjekat;
import domen.Korisnik;

import domen.Racun;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milena
 */
public class VratiSveRacuneSO extends AbstractSystemOperation {

    IDomenskiObjekat ido;
    List<Racun> racuni = new ArrayList<>();

    public VratiSveRacuneSO(DatabaseBroker dBBroker) {
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

        List<IDomenskiObjekat> idos = dBBroker.vratiSve(new Racun());
        for (IDomenskiObjekat ido : idos) {
            racuni.add((Racun) ido);
        }
        System.out.println("Izvrsava se slucaj koriscenja: Pregled svih racuna.");

    }

    public List<Racun> getRacuni() {
        return racuni;
    }
}
