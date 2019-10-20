
package contactslist;

public class Landline extends Phone{
    
    Landline(String phoneNb) {
        super(phoneNb);
    }
    public boolean validateNumber(String phoneNb) {
        if (phoneNb == null) 
            return false;
        if (phoneNb.length() != 10) 
            return false;
        if (phoneNb.startsWith("02") || phoneNb.startsWith("03")) 
            return true;
        else
            return false;
    }
}
