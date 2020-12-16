/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import Models.Pizza;
import java.util.ArrayList;

/**
 *
 * @author Armel Hell
 */
public class CrudPizza {
    
    ArrayList<Pizza> list;

    public CrudPizza() {
        list = new ArrayList<>();
    }

    public CrudPizza(ArrayList<Pizza> list) {
        this.list = list;
    }
    
    public ArrayList<Pizza> getList() {
        return list;
    }

    public void setList(ArrayList<Pizza> list) {
        this.list = list;
    }
    
    public int searchPizza(String e, String p){
            boolean b = false;
            for(int i = 0; i < this.list.size(); i++){
                if(this.list.get(i).getName().contentEquals(e) && this.list.get(i).getSize().contentEquals(p))
                    return i;
            }
            return -1;
    }
}
