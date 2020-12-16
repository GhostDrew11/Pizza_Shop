package Models;

import javafx.beans.property.SimpleStringProperty;

public class MenuItem implements Comparable<MenuItem>{

	private int itemID;
	private SimpleStringProperty category;
	private SimpleStringProperty description;
	private int quantity;

        public MenuItem(int itemID, SimpleStringProperty category, SimpleStringProperty description, int quantity) {
            this.itemID = itemID;
            this.category = category;
            this.description = description;
            this.quantity = quantity;
        }

        public MenuItem(SimpleStringProperty category, SimpleStringProperty description, int quantity) {
            this.category = category;
            this.description = description;
            this.quantity = quantity;
        }

        public MenuItem(SimpleStringProperty category, SimpleStringProperty description) {
            this.category = category;
            this.description = description;
        }
	

	public int getItemID() {
		return itemID;
	}



	public void setItemID(int itemID) {
		this.itemID = itemID;
	}



	public SimpleStringProperty getCategory() {
		return category;
	}



	public void setCategory(SimpleStringProperty category) {
		this.category = category;
	}



	public SimpleStringProperty getDescription() {
		return description;
	}



	public void setDescription(SimpleStringProperty description) {
		this.description = description;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public int compareTo(MenuItem arg0) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String toString() {
		return "MenuItem [itemID=" + itemID + ", quantity=" + quantity + "]";
	}
	
	

}
