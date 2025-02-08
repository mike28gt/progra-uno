/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.metodos;

/**
 *
 * @author miguelcatalan
 */
public class Fibonacci {
    
    public int calcular(int numero) {
        if (numero == 0 || numero == 1) {
            return numero;
        }
        else {
            return calcular(numero - 1) + calcular(numero - 2);
        }
    }
    
}
