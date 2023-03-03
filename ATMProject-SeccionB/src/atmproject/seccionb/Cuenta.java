/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.seccionb;

/**
 *
 * @author miguelcatalan
 */
public class Cuenta {
    private float saldo;
    private float saldoFlotante;
    private int numeroDeCuenta;
    private int nip;
    
    public Cuenta(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoFlotante() {
        return saldoFlotante;
    }

    public void setSaldoFlotante(float saldoFlotante) {
        this.saldoFlotante = saldoFlotante;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
    
    
    public int obtenerSaldo(int numeroDeCuenta) { return 0; }
    public void acreditar(int monto) { }
    public void debitar(int monto) { }
}

