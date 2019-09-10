
package contactslist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contact {
    String firstN;
    String surN;
    LocalDate birthDay;
    Phone phone;
    
    Contact(String firstN, String surN, LocalDate birthDay, Phone phone) {
        if (valideazaContact()) {
            this.firstN = firstN;
            this.birthDay = birthDay;
            this.phone = phone;
            this.surN = surN;
        }
    }
    
    boolean valideazaContact() {
<<<<<<< HEAD
        if (valideazaNume_Prenume() && validateData())
=======
        if (valideazaNume_Prenume() && valideazaData())
>>>>>>> 6b461f7801b04c71420cc672162860ff7bdb5e54
            return true;
        return false;
    }
    
    boolean valideazaNume_Prenume() {
        if ((firstN.length() <= 2) || (surN.length() <= 2))
            return false;
        return true;
    }
    
<<<<<<< HEAD
    boolean validateData() {
=======
    boolean valideazaData() {
>>>>>>> 6b461f7801b04c71420cc672162860ff7bdb5e54
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        
        if (birthDay.compareTo(LocalDate.parse(birthDay.toString(), formatter)) != 0)
            return false;
        return true;
    }
    
    public String toString() {
        return "" + firstN + " " + surN + ", " + birthDay.toString() + ", " + phone.toString();
    }
}
