/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Armel Hell
 */
public class Belong implements Comparable<Belong>{
        
        private int customerID;
        private int cvv;

        public Belong(int customerID, int cvv) {
            this.customerID = customerID;
            this.cvv = cvv;
        }
        
        public int getCustomerID() {
            return customerID;
        }

        public void setCustomerID(int customerID) {
            this.customerID = customerID;
        }

        public int getCvv() {
            return cvv;
        }

        public void setCvv(int cvv) {
            this.cvv = cvv;
        }
        
        @Override
        public int compareTo(Belong o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String toString() {
            return "Belong{" + "customerID=" + customerID + ", cvv=" + cvv + '}';
        }
        
        
}
