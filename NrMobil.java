
package listacontacte;

public class NrMobil extends NrTel {
    
    NrMobil(String nrTel) {
        super(nrTel);
    }
    public boolean valideazaNumar() {
        if (nrTel.length() != 10)
            return false;
        if (!nrTel.startsWith("07"))
            return false;
        return true;
    }
}
