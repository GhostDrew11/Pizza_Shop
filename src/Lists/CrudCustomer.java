package Lists;

import java.util.ArrayList;

import Models.Customer;

public class CrudCustomer {

	private ArrayList<Customer> list;

	public CrudCustomer() {
		list = new ArrayList<>();
	}

	public CrudCustomer(ArrayList<Customer> list) {
		this.list = list;
	}

	public ArrayList<Customer> getList() {
		return list;
	}

	public void setList(ArrayList<Customer> list) {
		this.list = list;
	}
	
        public int searchCustomer(String e, String p){
            boolean b = false;
            for(int i = 0; i < this.list.size(); i++){
                if(this.list.get(i).getEmail().contentEquals(e) && this.list.get(i).getPassword().contentEquals(p))
                    return i;
            }
            return -1;
        }
	
	
	
}
