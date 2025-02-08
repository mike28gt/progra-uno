/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem.sb;

import java.util.Scanner;

/**
 *
 * @author miguelcatalan
 */
public class InventoryManagementSystemSB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Guitar guitar = new Guitar("ASDF1234", "Fender", "Stratocaster", 
        //        "electric", "Cedar", "Cedar", 1499.00);
        
        Inventory inventario = new Inventory();
        
        inventario.addGuitar("ASDF1234", 1499.00, "Fender", "Stratocaster", "electric", 
                "Cedar", "Cedar");
        inventario.addGuitar("ASDF2345", 1700.00, "PRS", "SE Standard", "electric", 
                "Cedar", "Cedar");
        /*
        Guitar guitar = inventario.getGuitar("ASDF234");
        
        if (guitar == null) {
            System.out.println("No se encontró la guitarra.");
        } else {
            System.out.println("Se encontró la guitarra con serie " + guitar.getSerialNumber() +
                    " marca " + guitar.getBuilder());
        }
        */
        Guitar guitar = new Guitar("", "", "", "electric", "", "", 0);
        
        Guitar searchGuitar = inventario.search(guitar);
        
        if (searchGuitar != null) {
            System.out.println("Se encontró la guitarra " + searchGuitar.getBuilder() + 
                    " con número de serie " + searchGuitar.getSerialNumber());
        } else if (searchGuitar == null) {
            System.out.println("No se encontró la guitarra.");
        }
        
    }
}
