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
        //Cuenta cuentaObj = new Cuenta("Miguel"); 
        //Cuenta cuentaObj2 = new Cuenta("Alejandro");
        
        //cuentaObj.numeroDeCuenta = 1;
        //cuentaObj.setNumeroDeCuenta(98234);
        //System.out.println(cuentaObj.getNumeroDeCuenta());
        //cuentaObj2.numeroDeCuenta = 2;
        
        //TecladoNumerico tecladoNumerico = new TecladoNumerico();
        //ATM atmObj = new ATM(tecladoNumerico);
    
        //Retiro retiroObj = new Retiro();
        //retiroObj.ejecutar(0);
        
        //Deposito depositoObj = new Deposito();
        //depositoObj.ejecutar(0);
        /*
        Cuenta obj = new Cuenta("");
        obj.obtenerSaldo(0);
        obj.obtenerSaldo("", 0);
        obj.obtenerSaldo(0, "");
        */

        //Transaccion transaccionObj = new Transaccion();
        //transaccionObj.ejecutar(0);
        /*
        Retiro retiroObj = new Retiro();
        retiroObj.ejecutar(0);
        
        Deposito depositoObj = new Deposito();
        depositoObj.ejecutar(0);
        
        Transaccion transaccionObj1 = new Deposito();
        transaccionObj1.ejecutar(0);
        
        Transaccion transaccionObj2 = new Retiro();
        transaccionObj2.ejecutar(0);
        
        int [] arr1 = new int[2];
        
        Transaccion [] arr2 = new Transaccion[2];
        arr2[0] = new Retiro();
        arr2[1] = new Deposito();
        
        arr2[0].ejecutar(0);
        arr2[1].ejecutar(0);
        
        
        ATM atm = new ATM();
        atm.polimorfismo(new Retiro());
        atm.polimorfismo(new Deposito());
      
        
        Pantalla pantallaObj = new Pantalla();
        pantallaObj.mostrarMensaje("Hola mundo");
        */
        
        //ATM atmObj = new ATM();
        
        //BaseDeDatos bd = new BaseDeDatos();
        //bd.escribir();
        //bd.leer();
        //bd.agregar();
        //bd.eliminar();
        
        BaseDeDatosSerializada bd = new BaseDeDatosSerializada();
        //bd.escribir();
        bd.eliminar();
        bd.leer();
    }
    
}
