
package listacontacte;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListaContacte {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver");  
        
        Connection dbConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","Steaua98");  
        Statement s = dbConn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
        
        
    }
    
    static void afiseazaContinutRS(ResultSet rs)
    {
        System.out.println("continue ResultSet ...");
        try {
            rs.beforeFirst();
            while(rs.next()){
                System.out.println("persoana:" + rs.getString("nume") + " " + rs.getString("prenume") + " are varsta: "+ rs.getString("varsta") + " ani");
            }
            System.out.println("...");
        } catch (SQLException ex) {
            Logger.getLogger(ListaContacte.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
    
}
