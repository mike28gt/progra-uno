/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem.sb;

import java.util.Iterator;
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

    public Guitar search(Guitar searchGuitar) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals("")) && 
                    (!builder.equals(guitar.getBuilder()))) {
                continue;
            }
            
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getModel()))) {
                continue;
            }
            
            String type = searchGuitar.getType();
            if ((type != null) && (!type.equals("")) &&
                    (!type.equals(guitar.getType()))) {
                continue;
            }
            
            String backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals("")) &&
                    (!backWood.equals(guitar.getBackWood()))) {
                continue;
            }
            
            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) &&
                    (!topWood.equals(guitar.getTopWood()))) {
                continue;
            }
            
            return guitar;
        }
        
        return null;
    }
}
