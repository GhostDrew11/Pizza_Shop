package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//Packages where method target insertion of ordered items on the basket 
public class Insertion {

    public static void insertOrder(String name, Integer qty, String size) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testpshop","root","Tutus");
        PreparedStatement ps=con.prepareStatement("insert into corder (iname,quantity,size) values(?,?,?)");
        ps.setString(1, name);
        ps.setInt(2, qty);
        ps.setString(3, size);
        ps.executeUpdate();
        
        ps.close();
        con.close(); 
    }
    
}
