
package contactslist;

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


public class ContactsList {
<<<<<<< HEAD
    private ArrayList<Contact> contacte = new ArrayList<Contact>();
=======
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
>>>>>>> 6b461f7801b04c71420cc672162860ff7bdb5e54
    Map criteriuOrdonare;
    Predicate<Contact> filtruCurent;

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver");  
        
        Connection dbConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","Steaua98");  
        Statement s = dbConn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
        
        
    }
    
    public void addContact(Contact newContact) {
<<<<<<< HEAD
        contacte.add(newContact);
=======
        contacts.add(newContact);
>>>>>>> 6b461f7801b04c71420cc672162860ff7bdb5e54
    }
}
   
