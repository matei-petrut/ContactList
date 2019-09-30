/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactslist;

/**
 *
 * @author Peter
 */
public enum Filter {
    LANDLINE,
    MOBILE_PHONE,
    BIRTHDAY_TODAY,
    BIRTHDAY_THIS_MONTH,
    NO_FILTER;
    
    public String toString() {
        return this.name().replace("_", " ");
    }
}
