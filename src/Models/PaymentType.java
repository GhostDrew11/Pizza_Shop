package Models;

import javafx.beans.property.SimpleStringProperty;

public class PaymentType implements Comparable <PaymentType>{

	private int customerID;
	private SimpleStringProperty category;

        public PaymentType(int customerID, SimpleStringProperty category) {
            this.customerID = customerID;
            this.category = category;
        }
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
        
	public SimpleStringProperty getCategory() {
		return category;
	}

	public void setCategory(SimpleStringProperty category) {
		this.category = category;
	}

	@Override
	public int compareTo(PaymentType arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "PaymentType [customerID=" + customerID + "]";
	}

}
