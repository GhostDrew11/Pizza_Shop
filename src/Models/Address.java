package Models;

import javafx.beans.property.SimpleStringProperty;

//Each classes under the Model package represent the item we manipulate through the database and the GUI
public class Address implements Comparable<Address>{
    
    private SimpleStringProperty street;
    private SimpleStringProperty city;
    private SimpleStringProperty state;
    private SimpleStringProperty zip;

    public Address(SimpleStringProperty street, SimpleStringProperty city, SimpleStringProperty state, SimpleStringProperty zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /*public Address() {
        
    }*/
    
    
    
    public SimpleStringProperty getStreet() {
        return street;
    }

    public void setStreet(SimpleStringProperty street) {
        this.street = street;
    }

    public SimpleStringProperty getCity() {
        return city;
    }

    public void setCity(SimpleStringProperty city) {
        this.city = city;
    }

    public SimpleStringProperty getState() {
        return state;
    }

    public void setState(SimpleStringProperty state) {
        this.state = state;
    }

    public SimpleStringProperty getZip() {
        return zip;
    }

    public void setZip(SimpleStringProperty zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + '}';
    }

    @Override
    public int compareTo(Address o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
