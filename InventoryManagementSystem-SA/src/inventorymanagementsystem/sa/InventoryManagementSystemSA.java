/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementsystem.sa;

/**
 *
 * @author miguelcatalan
 */
public class InventoryManagementSystemSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Guitar guitar = new Guitar("", "Tylor", "", "electric", 
                "", "", 0);
        
        Inventory inventory = new Inventory();
        
        inventory.addGuitar("ASDF1234", 1499.00, "Fender", "Stratocaster", "electric", 
                "Cedar", "Cedar");
        inventory.addGuitar("ASDF2345", 1600.00, "Paul Reed Smith", "SE Standard", "electric", 
                "Cedar", "Cedar");
        
        //Guitar searchGuitar = inventory.getGuitar("ASDF234");
        
        Guitar searchGuitar = inventory.search(guitar);
        
        if (searchGuitar != null) {
            System.out.println("Se encontró la guitarra " + searchGuitar.getBuilder() + 
                    " con número de serie " + searchGuitar.getSerialNumber());
        } else if (searchGuitar == null) {
            System.out.println("No se encontró la guitarra.");
        }
        
        
        
        
        
        
        

        
    }
    
}
