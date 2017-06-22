/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Milena
 */
public interface IDomenskiObjekat {

    public String vratiNazivTabele();

    public String vratiVrednostiZaInsert();

    public String vratiVrednostiZaUpdate();

    public List<IDomenskiObjekat> vratiListu(ResultSet rs);

    public IDomenskiObjekat vratiObjekat(ResultSet rs);

    public int vratiVrednostPK();

    public String vratiPK();

    public String vratiKolonuZaFiltriranje();

    public String vratiVrednostKoloneZaFiltriranje();

    public String vratiSlozeniPK();

    public int vratiBrojSlogovaVezanogObjekta();

    public IDomenskiObjekat vratiSlogVezanogObjekta(int i);
}
