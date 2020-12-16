package Models;

import javafx.beans.property.SimpleStringProperty;

public class Order implements Comparable<Order>{

	private int orderID;
	private int customerID;
	private int quantity;
	private SimpleStringProperty date;
        private SimpleStringProperty itemname;

    @Override
    public int compareTo(Order o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
}
