/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.secciona;

/**
 *
 * @author miguelcatalan
 */
public class ATM {
    
    //Dispensador dispensadorObj = new Dispensador();
    //Pantalla pantallaObj = new Pantalla();
    //RanuraDeDeposito ranuraDeDepositoObj = new RanuraDeDeposito();
    //Teclado tecladoObj = new Teclado();
    
    Dispensador dispensadorObj;
    Pantalla pantallaObj;
    RanuraDeDeposito ranuraDeDepositoObj;
    Teclado tecladoObj;
    
    ATM(Teclado tecladoObj) {
        dispensadorObj = new Dispensador();
        pantallaObj = new Pantalla();
        ranuraDeDepositoObj = new RanuraDeDeposito();
        this.tecladoObj = tecladoObj;
    }
    
    void depositar(int monto) { }
    void acreditar(int monto) { }
    void mostrarSaldo(int numeroDeCuenta) { }
    void retirar(int monto) { }
    void debitar(int monto) { }
    boolean autenticar(int nip, int numeroDeCuenta) { return true; }
}
