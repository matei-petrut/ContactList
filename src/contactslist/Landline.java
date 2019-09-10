
package contactslist;

public class Landline extends Phone{
    
    Landline(String nrTel) {
        super(nrTel);
    }
    public boolean valideazaNumar() {
        if (nrTel.length() != 10)
            return false;
        if ((!nrTel.startsWith("02")) || (!nrTel.startsWith("03")))
            return false;
        return true;
    }
}
