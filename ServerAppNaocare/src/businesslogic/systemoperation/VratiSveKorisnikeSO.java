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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milena
 */
public class VratiSveKorisnikeSO extends AbstractSystemOperation {

    List<Korisnik> korisnici;

    public VratiSveKorisnikeSO(DatabaseBroker dBBroker) {
        super(dBBroker);
        korisnici = new ArrayList<>();
    }

    @Override
    protected void validate(Object object) throws Exception {

    }

    @Override
    protected void checkPreCondition(Object object) throws Exception {

    }

    @Override
    protected void executeOperation(Object object) throws Exception {
        List<IDomenskiObjekat> idos = dBBroker.vratiSve(new Korisnik());
        for (IDomenskiObjekat ido : idos) {
            korisnici.add((Korisnik) ido);
        }
         System.out.println("Izvrsava se slucaj koriscenja: Vracanje svih korisnika. ");
    }

    public List<Korisnik> getKorisnici() {
        return korisnici;
    }

}
