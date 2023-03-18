/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.seccionb;

/**
 *
 * @author miguelcatalan
 */
public class ATM {

    private RanuraParaDepositos ranuraParaDepositosObj;
    private TecladoNumerico tecladoNumericoObj;
    private Pantalla pantallaObj;
    private Dispensador dispensadorObj;
    
    //Implementación de relacion de agregación entre la clase TecladoNumerico y ATM
    public ATM() {
        this.ranuraParaDepositosObj = new RanuraParaDepositos();
        this.tecladoNumericoObj = new TecladoNumerico();
        this.pantallaObj = new Pantalla();
        this.dispensadorObj = new Dispensador();
        
        this.solicitarDatos();
    }
    
    private void solicitarDatos() {
        pantallaObj.mostrarMensaje("Bienvenido!\n");
        pantallaObj.mostrarMensaje("Ingrese su número de cuenta: ");
        int numeroCuenta = tecladoNumericoObj.capturarDatos();
    }
    
}
