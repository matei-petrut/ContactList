
package listacontacte;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contact {
    String nume;
    String prenume;
    LocalDate dataNastere;
    NrTel telefon;
    
    Contact(String nume, String preunme, LocalDate dataNstere, NrTel telefon) {
        if (valideazaContact()) {
            this.nume = nume;
            this.dataNastere = dataNastere;
            this.telefon = telefon;
            this.prenume = prenume;
        }
    }
    
    boolean valideazaContact() {
        if (valideazaNume_Prenume() && valideazaData())
            return true;
        return false;
    }
    
    boolean valideazaNume_Prenume() {
        if ((nume.length() <= 2) || (prenume.length() <= 2))
            return false;
        return true;
    }
    
    boolean valideazaData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        
        if (dataNastere.compareTo(LocalDate.parse(dataNastere.toString(), formatter)) != 0)
            return false;
        return true;
    }
}
