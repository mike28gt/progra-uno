/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem.sb;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author miguelcatalan
 */
public class Inventory {
    List guitars;
    
    public Inventory() {
        guitars = new LinkedList();
    }
    
    void addGuitar(String serialNumber, double price, String builder, String model, 
            String type, String backWood, String topWood) {
        
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, 
                topWood, price);
        
        guitars.add(guitar);
    }
    
    Guitar getGuitar(String serialNumber) {
        for (int i = 0; i < guitars.size(); i++) {
            Guitar guitar = (Guitar)guitars.get(i);
            
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }
/*
            search(Guitar):Guitar
*/
}
