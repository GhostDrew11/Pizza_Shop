package Models;


import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;

public class Pizza implements Comparable<Pizza>{

        private int pizzaID;
	private SimpleStringProperty name;
	private double price;
        private int quantity;
        private SimpleStringProperty description;
	private SimpleStringProperty size;
	private SimpleStringProperty crust;
        private SimpleStringProperty sauce;
        private ArrayList<String> topList;

        public Pizza(int pizzaID, String name, double price, int quantity, String description, String size, String crust) {
            this.pizzaID = pizzaID;
            this.name = new SimpleStringProperty(name);
            this.price = price;
            this.quantity = quantity;
            this.description = new SimpleStringProperty(description);
            this.size = new SimpleStringProperty(size);
            this.crust = new SimpleStringProperty(crust);
        }

        public Pizza(int pizzaID, String name, double price, int quantity, String description, String size, String crust, String sauce) {
            this.pizzaID = pizzaID;
            this.name = new SimpleStringProperty(name);
            this.price = price;
            this.quantity = quantity;
            this.description = new SimpleStringProperty(description);
            this.size = new SimpleStringProperty(size);
            this.crust = new SimpleStringProperty(crust);
            this.sauce = new SimpleStringProperty(sauce);
        }

        public int getPizzaID() {
            return pizzaID;
        }

        public void setPizzaID(int PizzaID) {
            this.pizzaID = PizzaID;
        }
        
	public String getName() {
		return name.getValue();
	}

	public void setName(String name) {
		this.name = new SimpleStringProperty(name);
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

	public String getCrust() {
		return crust.getValue();
	}

	public void setCrust(String crust) {
		this.crust = new SimpleStringProperty(crust);
	}

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getDescription() {
            return description.getValue();
        }

        public void setDescription(String description) {
            this.description = new SimpleStringProperty(description);
        }

        public String getSauce() {
            return sauce.getValue();
        }

        public void setSauce(String sauce) {
            this.sauce = new SimpleStringProperty(sauce);
        }
        
        @Override
        public int compareTo(Pizza o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String toString() {
            return "Pizza{" + "pizzaID=" + pizzaID + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", description=" + description + ", size=" + size + ", crust=" + crust + ", sauce=" + sauce + '}';
        }        

}
