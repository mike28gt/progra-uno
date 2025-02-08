/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase01.secciona.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Clase01SeccionAAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        
        estudiante1.nombre = "Jonathan";
        
        estudiante2.nombre = "Hilda";
        
        estudiante1.programar();
        
        estudiante2.aprender();
    }
    
}
