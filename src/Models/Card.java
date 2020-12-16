package Models;

import javafx.beans.property.SimpleStringProperty;

public class Card implements Comparable<Card>{

	private SimpleStringProperty cardholderName;
	private SimpleStringProperty cardNumber;
	private SimpleStringProperty cvv;
	private SimpleStringProperty date;
		
	public String getCardholderName() {
		return cardholderName.getValue();
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = new SimpleStringProperty(cardholderName);
	}

	public String getCardNumber() {
		return cardNumber.getValue();
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = new SimpleStringProperty(cardNumber);
	}

	public String getCvv() {
		return cvv.getValue();
	}

	public void setCvv(String cvv) {
		this.cvv = new SimpleStringProperty(cvv);
	}

	public String getDate() {
		return date.getValue();
	}

	public void setDate(String date) {
		this.date = new SimpleStringProperty(date);
	}

        @Override
        public int compareTo(Card o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String toString() {
            return "Card{" + "cardholderName=" + cardholderName + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", date=" + date + '}';
        }
        
}
