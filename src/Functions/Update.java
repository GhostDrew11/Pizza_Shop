package Functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Use to update items of the database through the app
public class Update {

    public static void updateDrink(String name, int price) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testpshop","root","Tutus");
        PreparedStatement ps=con.prepareStatement("update drink set ");
    }
}
