package contactslist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public abstract class Database {
    public static void emptyJList(DefaultListModel model) {
        model.removeAllElements();
    }
    
    public static void displayInJList(DefaultListModel model) {                
        String sql = "select firstN, surN, birthday, phone from Contacts";
        try {
            PreparedStatement s = connect().prepareStatement(sql);
            ResultSet results = s.executeQuery();
            
            while (results.next()) {
                String firstN = results.getString(1);
                String surN = results.getString(2);
                String bDay = results.getString(3);                                               
                Phone phone = null;
                
                if (results.getString(4).startsWith("07"))
                    phone = new MobilePhone(results.getString(4));
                if (results.getString(4).startsWith("02") || results.getString(4).startsWith("03"))
                    phone = new Landline(results.getString(4));
                Contact c = new Contact(firstN, surN, LocalDate.parse(bDay), phone);
                model.addElement(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void displayDatabase() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection dbConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","Steaua98");  
            Statement s = dbConn.createStatement();
            String q = "Select * from Contacts";
	    ResultSet rs=s.executeQuery(q);
			
	    if(rs.next()){ 
		do{
                    System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
		}while(rs.next());
            }else{
		System.out.println("Record Not Found...");
            }
	    dbConn.close();
            
        }catch(SQLException|ClassNotFoundException e){
            System.out.println("ERROR connecting to database!");
            System.out.println(e.toString());
        }
    }
    
     public static Connection connect(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection dbConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","Steaua98");  
            return dbConn;
        }catch(SQLException|ClassNotFoundException e){
            System.out.println("ERROR connecting to database!");
            System.out.println(e.toString());
     }
        return null;
  }
}
