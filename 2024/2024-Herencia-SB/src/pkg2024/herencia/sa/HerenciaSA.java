/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.herencia.sa;

/**
 *
 * @author miguelcatalan
 */
public class HerenciaSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        EmpleadoRegular er1 = new EmpleadoRegular("Miguel Catalan", "1234567890", 100.00f, 100.00f);
        System.out.println("El salario es de: " + 
                er1.calcularSalario());
        
        EmpleadoGerente eg1 = new EmpleadoGerente("Miguel Catalan", "1234567890", 100.00f, 100.00f, 100.00f);
        System.out.println("El salario es de: " + 
                eg1.calcularSalario());
        
        
        EmpleadoGerente eg2 = new EmpleadoGerente("Miguel", "1", 1f, 1f, 1f);
        eg2.calcularSalario();
    }
    
    
    
}
