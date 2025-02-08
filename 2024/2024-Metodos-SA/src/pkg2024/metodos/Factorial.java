/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.metodos;

/**
 *
 * @author miguelcatalan
 */
public class Factorial {
    
    public int calcular(int numero) {
    
        int factorial = 1;
        
        for (int i = numero; i >= 1; i--) {
            factorial *= i;
        }
        
        return factorial;
    }
    
    public int calcularConRecursividad(int numero) {
        if (numero <= 1) {
            return 1;
        }
        else {
            return numero * calcularConRecursividad(numero - 1);
        }
    }
}
