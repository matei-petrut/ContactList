
package contactslist;

public class PhoneNumber extends Phone {
    
    PhoneNumber(String phoneNb) {
        super(phoneNb);
    }
    public boolean validateNumber() {
        if (phoneNb.length() != 10)
            return false;
        if (!phoneNb.startsWith("07"))
            return false;
        return true;
    }
}
