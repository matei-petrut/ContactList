
package contactslist;

public class MobilePhone extends Phone {
    
    MobilePhone(String phoneNb) {
        super(phoneNb);
    }
    public boolean validateNumber(String phoneNb) {
        if (phoneNb == null)
            return false;
        if (phoneNb.length() != 10)
            return false;
        if (!phoneNb.startsWith("07"))
            return false;
        return true;
    }
}
