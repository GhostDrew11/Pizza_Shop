package Lists;

import java.util.ArrayList;

import Models.Order;

public class CrudOrder {

	ArrayList<Order> list;

	public CrudOrder() {
		list = new ArrayList<>();
	}

	public CrudOrder(ArrayList<Order> list) {
		this.list = list;
	}

	public ArrayList<Order> getList() {
		return list;
	}

	public void setList(ArrayList<Order> list) {
		this.list = list;
	}
	
}
