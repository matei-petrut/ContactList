
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
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    Map criteriuOrdonare;
    Predicate<Contact> filtruCurent;

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        WelcomeScreen welcome = new WelcomeScreen();
        welcome.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                WelcomeScreen.index.setText("" + i);
                WelcomeScreen.progresBar.setValue(i);
                
                if (i == 100) {
                    welcome.setVisible(false);
                    MainApp main = new MainApp();
                    main.setVisible(true);
                }  
            }
        } catch(Exception e) {
            
        }
    }
}
   
