/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmproject.secciona;

/**
 *
 * @author miguelcatalan
 */
public class ATMProjectSeccionA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teclado teclado1 = new Teclado();
        ATM atm = new ATM(teclado1);
        
        
        Cuenta obj = new Cuenta();
        
        //obj.numeroDeCuenta = 234;
        obj.setNumeroDeCuenta(234);
    }
    
}
