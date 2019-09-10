
package contactslist;

public abstract class Phone implements Comparable<Phone> {
    String nrTel;
    
    Phone(String nrTel) {
        if (valideazaNumar()) {
            this.nrTel = nrTel;
        }
    }
    
    public abstract boolean valideazaNumar();
    
    public boolean equals(Object o) {
        if (nrTel.compareTo(((Phone) o).nrTel) == 0) {
            return true;
        }
        return false;
    }
    
    public int compareTo(Phone nrTel) {
        return Integer.compare(Integer.valueOf(this.nrTel), Integer.valueOf(nrTel.nrTel));
    }
    
    public String toString() {
        return "" + nrTel;
    }
}
