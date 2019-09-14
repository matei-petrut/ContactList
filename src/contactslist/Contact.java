
package contactslist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String firstN;
    private String surN;
    private LocalDate birthDay;
    private Phone phone;
    
    Contact(String firstN, String surN, LocalDate birthDay, Phone phone) {
        if (validateName(firstN, surN) && validateBDay(birthDay)) {
            this.firstN = firstN;
            this.birthDay = birthDay;
            this.phone = phone;
            this.surN = surN;
        }
    }
    
    public String getFristN() {
        return firstN;
    }
    
    public String getSurN(){
        return surN;
    }
    
    public LocalDate getBirthDay() {
        return birthDay;
    }
    
    public Phone getPhone() {
        return phone;
    }
    
    boolean validateName(String firstN, String surN) {
        if ((firstN.length() < 2) || (surN.length() < 2))
            return false;
        return true;
    }
    
    boolean validateBDay(LocalDate birthDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate bDay = LocalDate.parse(birthDay.toString(), formatter);
        
        if (birthDay.compareTo(LocalDate.parse(birthDay.toString(), formatter)) != 0)
            return false;
        return true;
    }
    
    public String toString() {
        return "" + firstN + " " + surN + ", " + birthDay.toString() + ", " + phone.toString();
    }
}
