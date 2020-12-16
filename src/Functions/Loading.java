package Functions;

import Lists.CrudCustomer;
import Lists.CrudPizza;
import Models.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


//Methods are used to load created generated items of the database into the code 
public class Loading {
    
    public static CrudCustomer LoadCustomer(){
        try{
            CrudCustomer c = new CrudCustomer();
            ArrayList<Customer> l = new ArrayList<>();
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/testpshop" , "root", "Tutus");
            Statement s = connection.createStatement();
            ResultSet r = s.executeQuery("select * from customer");
            while(r.next()){
                l.add(new Customer(r.getInt(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5),r.getString(6),r.getString(7)));
            }
            c = new CrudCustomer(l);
            return c;
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(CrudCustomer.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static CrudPizza LoadPizza() throws ClassNotFoundException, SQLException{
        CrudPizza p = new CrudPizza();
        ArrayList<Customer> l = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/testpshop" , "root", "Tutus");
        Statement s = connection.createStatement();
        ResultSet r = s.executeQuery("select * from pizza");
        while(r.next()){
            
        }
        return p;
    }
    
    
    public static ObservableList<String> sizelist(){
        ArrayList<String> l = new ArrayList();
        while(l.size()!= 3){
            l.add("small");
            l.add("medium");
            l.add("large");
        }
        ObservableList<String> slist = FXCollections.observableArrayList(l);
        return slist;
    }
    
    public static ObservableList<String> Pizzaslist(){
        ArrayList<String> l = new ArrayList();
        while(l.size()!= 4){
            l.add("small");
            l.add("medium");
            l.add("large");
            l.add("extra large");
        }
        ObservableList<String> slist = FXCollections.observableArrayList(l);
        return slist;
    }
    
    public static ObservableList<String> crustlist(){
        ArrayList<String> l = new ArrayList();
        while(l.size()!= 3){
            l.add("thin");
            l.add("regular");
            l.add("pan");
        }
        ObservableList<String> slist = FXCollections.observableArrayList(l);
        return slist;
    }
    
    public static ObservableList<String> saucelist(){
        ArrayList<String> l = new ArrayList();
        while(l.size()!= 1){
            l.add("tomato sauce");
        }
        ObservableList<String> slist = FXCollections.observableArrayList(l);
        return slist;
    }
    
    public static void loadOrder(){
        
    }

}
