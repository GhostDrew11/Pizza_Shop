/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import Models.Drink;
import java.util.ArrayList;

/**
 *
 * @author Armel Hell
 */
public class CrudDrink {
    
    ArrayList<Drink> list;

    public CrudDrink() {
    }

    public CrudDrink(ArrayList<Drink> list) {
        this.list = list;
    }

    public ArrayList<Drink> getList() {
        return list;
    }

    public void setList(ArrayList<Drink> list) {
        this.list = list;
    }
    
    public int searchDrink(String e, String p){
            boolean b = false;
            for(int i = 0; i < this.list.size(); i++){
                if(this.list.get(i).getName().contentEquals(e) && this.list.get(i).getSize().contentEquals(p))
                    return i;
            }
            return -1;
    }
        
}
