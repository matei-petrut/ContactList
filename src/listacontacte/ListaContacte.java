
package listacontacte;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListaContacte {
    private ArrayList<Contact> contacte = new ArrayList<Contact>();
    Map criteriuOrdonare;
    Predicate<Contact> filtruCurent;

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver");  
        
        Connection dbConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","Steaua98");  
        Statement s = dbConn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
        
        
    }
    
    public void addContact(Contact newContact) {
        contacte.add(newContact);
    }
}
   
