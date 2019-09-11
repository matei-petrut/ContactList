
package contactslist;

public abstract class Phone implements Comparable<Phone> {
    String phoneNb;
    
    Phone(String phoneNb) {
        if (validateNumber(phoneNb)) {
            this.phoneNb = phoneNb;
        }
    }
    
    public abstract boolean validateNumber(String phoneNb);
    
    public boolean equals(Object o) {
        if (phoneNb.compareTo(((Phone) o).phoneNb) == 0) {
            return true;
        }
        return false;
    }
    
    public int compareTo(Phone phoneNb) {
        return Integer.compare(Integer.valueOf(this.phoneNb), Integer.valueOf(phoneNb.phoneNb));
    }
    
    public String toString() {
        return "" + phoneNb;
    }
}
