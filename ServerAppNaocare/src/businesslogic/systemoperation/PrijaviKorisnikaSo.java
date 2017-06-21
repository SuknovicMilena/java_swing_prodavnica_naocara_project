/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.systemoperation;

import db.DatabaseBroker;
import domen.Korisnik;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milena
 */
public class PrijaviKorisnikaSo extends AbstractSystemOperation {

    List<Korisnik> korisnici;

    public PrijaviKorisnikaSo(DatabaseBroker dBBroker) {
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
        korisnici = dBBroker.prijaviKorisnika();
         System.out.println("Izvrsava se slucaj koriscenja: Prijava korisnika. ");
    }

    public List<Korisnik> getKorisnici() {
        return korisnici;
    }

}
