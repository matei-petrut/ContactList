
package contactslist;

public class PhoneNumber extends Phone {
    
<<<<<<< HEAD
    PhoneNumber(String nrTel) {
        super(nrTel);
    }
    public boolean valideazaNumar() {
        if (nrTel.length() != 10)
            return false;
        if (!nrTel.startsWith("07"))
=======
    PhoneNumber(String phoneNb) {
        super(phoneNb);
    }
    public boolean validateNumber() {
        if (phoneNb.length() != 10)
            return false;
        if (!phoneNb.startsWith("07"))
>>>>>>> 6b461f7801b04c71420cc672162860ff7bdb5e54
            return false;
        return true;
    }
}
