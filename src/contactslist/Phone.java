
package contactslist;

public abstract class Phone implements Comparable<Phone> {
<<<<<<< HEAD
    String nrTel;
    
    Phone(String nrTel) {
        if (valideazaNumar()) {
            this.nrTel = nrTel;
        }
    }
    
    public abstract boolean valideazaNumar();
    
    public boolean equals(Object o) {
        if (nrTel.compareTo(((Phone) o).nrTel) == 0) {
=======
    String phoneNb;
    
    Phone(String phoneNb) {
        if (validateNumber()) {
            this.phoneNb = phoneNb;
        }
    }
    
    public abstract boolean validateNumber();
    
    public boolean equals(Object o) {
        if (phoneNb.compareTo(((Phone) o).phoneNb) == 0) {
>>>>>>> 6b461f7801b04c71420cc672162860ff7bdb5e54
            return true;
        }
        return false;
    }
    
<<<<<<< HEAD
    public int compareTo(Phone nrTel) {
        return Integer.compare(Integer.valueOf(this.nrTel), Integer.valueOf(nrTel.nrTel));
    }
    
    public String toString() {
        return "" + nrTel;
=======
    public int compareTo(Phone phoneNb) {
        return Integer.compare(Integer.valueOf(this.phoneNb), Integer.valueOf(phoneNb.phoneNb));
    }
    
    public String toString() {
        return "" + phoneNb;
>>>>>>> 6b461f7801b04c71420cc672162860ff7bdb5e54
    }
}
