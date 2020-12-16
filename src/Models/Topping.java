package Models;

import javafx.beans.property.SimpleStringProperty;

public class Topping implements Comparable<Topping>{

	private int toppingID;
	private SimpleStringProperty name;
	
	public int getToppingID() {
		return toppingID;
	}

	public void setToppingID(int toppingID) {
		this.toppingID = toppingID;
	}

	public SimpleStringProperty getName() {
		return name;
	}

	public void setName(SimpleStringProperty name) {
		this.name = name;
	}

        @Override
        public int compareTo(Topping o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

	
}
