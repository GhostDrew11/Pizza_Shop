package Models;

import javafx.beans.property.SimpleStringProperty;

public class Delivery implements Comparable<Delivery>{

        private int orderID;
        private SimpleStringProperty address;
	private SimpleStringProperty datetime;

        public Delivery(int orderID, SimpleStringProperty address, SimpleStringProperty datetime) {
            this.orderID = orderID;
            this.address = address;
            this.datetime = datetime;
        }

        public int getOrderID() {
            return orderID;
        }

        public void setOrderID(int orderID) {
            this.orderID = orderID;
        }

        public SimpleStringProperty getAddress() {
            return address;
        }

        public void setAddress(SimpleStringProperty address) {
            this.address = address;
        }
        
	public SimpleStringProperty getDatetime() {
		return datetime;
	}

	public void setDatetime(SimpleStringProperty datetime) {
		this.datetime = datetime;
	}

        @Override
        public int compareTo(Delivery o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String toString() {
            return "Delivery{" + "orderID=" + orderID + ", address=" + address + ", datetime=" + datetime + '}';
        }

}
