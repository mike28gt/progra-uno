/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmproject.seccionb;

/**
 *
 * @author miguelcatalan
 */
public class ATMProjectSeccionB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creación de objetos
        Cuenta cuentaObj = new Cuenta("Miguel"); 
        Cuenta cuentaObj2 = new Cuenta("Alejandro");
        
        cuentaObj.numeroDeCuenta = 1;
        cuentaObj.setNumeroDeCuenta(1);
        cuentaObj.getNumeroDeCuenta();
        //cuentaObj2.numeroDeCuenta = 2;
        
        TecladoNumerico tecladoNumerico = new TecladoNumerico();
        ATM atmObj = new ATM(tecladoNumerico);
    }
    
}
