
package contactslist;

public class Landline extends Phone{
    
<<<<<<< HEAD
    Landline(String nrTel) {
        super(nrTel);
    }
    public boolean valideazaNumar() {
        if (nrTel.length() != 10)
            return false;
        if ((!nrTel.startsWith("02")) || (!nrTel.startsWith("03")))
=======
    Landline(String phoneNb) {
        super(phoneNb);
    }
    public boolean validateNumber() {
        if (phoneNb.length() != 10)
            return false;
        if ((!phoneNb.startsWith("02")) || (!phoneNb.startsWith("03")))
>>>>>>> 6b461f7801b04c71420cc672162860ff7bdb5e54
            return false;
        return true;
    }
}
