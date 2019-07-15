/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacontacte;

/**
 *
 * @author Peter
 */
public enum Ordonare {
    DUPA_NUME,
    DUPA_PRENUME,
    DUPA_DATA_NASTERII,
    DUPA_TELEFON;
    
    public String toString() {
        return this.name();
    }
    
}
