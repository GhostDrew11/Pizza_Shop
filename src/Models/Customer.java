package Models;

import javafx.beans.property.SimpleStringProperty;

public class Customer implements Comparable<Customer>{

	private int customerID;
	private SimpleStringProperty firstName;
	private SimpleStringProperty lastName;
	private SimpleStringProperty address;
        private SimpleStringProperty phonenumber;
	private SimpleStringProperty email;
	private SimpleStringProperty password;

        public Customer(int customerID, String firstName, String lastName, String address, String phonenumber, String email, String password) {
            this.customerID = customerID;
            this.firstName = new SimpleStringProperty(firstName);
            this.lastName = new SimpleStringProperty(lastName);
            this.address = new SimpleStringProperty(address);
            this.phonenumber = new SimpleStringProperty(phonenumber);
            this.email = new SimpleStringProperty(email);
            this.password = new SimpleStringProperty(password);
        }

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public SimpleStringProperty getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = new SimpleStringProperty(firstName);
	}

	public SimpleStringProperty getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = new SimpleStringProperty(lastName);
	}

	public SimpleStringProperty getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = new SimpleStringProperty(address);
	}

        public SimpleStringProperty getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(SimpleStringProperty phonenumber) {
            this.phonenumber = phonenumber;
        }
        
	public String getEmail() {
		return email.getValue();
	}

	public void setEmail(String email) {
		this.email = new SimpleStringProperty(email);
	}

	public String getPassword() {
		return password.getValue();
	}

	public void setPassword(String password) {
		this.password = new SimpleStringProperty(password);
	}

	@Override
	public int compareTo(Customer arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
