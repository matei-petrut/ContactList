
package listacontacte;

public abstract class NrTel implements Comparable<NrTel> {
    String nrTel;
    
    NrTel(String nrTel) {
        if (valideazaNumar()) {
            this.nrTel = nrTel;
        }
    }
    
    public abstract boolean valideazaNumar();
    
    public boolean equals(Object o) {
        if (nrTel.compareTo(((NrTel) o).nrTel) == 0) {
            return true;
        }
        return false;
    }
    
    public int compareTo(NrTel nrTel) {
        return Integer.compare(Integer.valueOf(this.nrTel), Integer.valueOf(nrTel.nrTel));
    }
    
    public String toString() {
        return "" + nrTel;
    }
}
