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
    /*
    RanuraParaDepositos ranuraParaDepositosObj = new RanuraParaDepositos();
    TecladoNumerico tecladoNumericoObj = new TecladoNumerico();
    Pantalla pantallaObj = new Pantalla();
    Dispensador dispensadorObj = new Dispensador();
    */
    RanuraParaDepositos ranuraParaDepositosObj;
    TecladoNumerico tecladoNumericoObj;
    Pantalla pantallaObj;
    Dispensador dispensadorObj;
    
    //Implementación de relacion de agregación entre la clase TecladoNumerico y ATM
    ATM(TecladoNumerico tecladoNumericoObj) {
        ranuraParaDepositosObj = new RanuraParaDepositos();
        tecladoNumericoObj = tecladoNumericoObj;
        pantallaObj = new Pantalla();
        dispensadorObj = new Dispensador();
    }
}
