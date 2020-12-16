package Models;

import javafx.beans.property.SimpleStringProperty;

public class Drink implements Comparable<Drink>{

        private int drinkID;
	private SimpleStringProperty name;
	private SimpleStringProperty description;
        private int quantity;
	private double price;
	private SimpleStringProperty size;
        
        public int getDrinkID() {
            return drinkID;
        }

        public void setDrinkID(int drinkID) {
            this.drinkID = drinkID;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        
	public String getName() {
		return name.getValue();
	}

	public void setName(String name) {
		this.name = new SimpleStringProperty(name);
	}

	public String getDescription() {
		return description.getValue();
	}

	public void setDescription(String description) {
		this.description = new SimpleStringProperty(description);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size.getValue();
	}

	public void setSize(String size) {
		this.size = new SimpleStringProperty(size);
	}

        @Override
        public String toString() {
            return "Drink{" + "drinkID=" + drinkID + ", quantity=" + quantity + ", name=" + name + ", description=" + description + ", price=" + price + ", size=" + size + '}';
        }

        @Override
        public int compareTo(Drink o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

	
}
