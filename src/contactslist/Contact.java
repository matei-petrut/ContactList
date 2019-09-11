
package contactslist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contact {
    String firstN;
    String surN;
    LocalDate birthDay;
    Phone phone;
    
    Contact(String firstN, String surN, LocalDate birthDay, Phone phone) {
        if (validateName(firstN, surN) && validateBDay(birthDay)) {
            this.firstN = firstN;
            this.birthDay = birthDay;
            this.phone = phone;
            this.surN = surN;
        }
    }
    
    boolean validateName(String firstN, String surN) {
        if ((firstN.length() < 2) || (surN.length() < 2))
            return false;
        return true;
    }
    
    boolean validateBDay(LocalDate birthDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        
        if (birthDay.compareTo(LocalDate.parse(birthDay.toString(), formatter)) != 0)
            return false;
        return true;
    }
    
    public String toString() {
        return "" + firstN + " " + surN + ", " + birthDay.toString() + ", " + phone.toString();
    }
}
