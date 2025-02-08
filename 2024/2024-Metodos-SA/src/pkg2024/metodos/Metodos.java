/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.metodos;

/**
 *
 * @author miguelcatalan
 */
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Factorial f = new Factorial();
        int n = 4;
        System.out.println("Factorial de " + n + " es: " + f.calcular(n));
        System.out.println("Factorial de " + n + " usando recursividad es: " + f.calcularConRecursividad(n));
        
        Fibonacci fi = new Fibonacci();
        int n1 = 10;
        System.out.println("La serie de Fibonacci de " + n1 + " es: " + fi.calcular(n1));
        
        ManejoDeExcepciones m = new ManejoDeExcepciones();
        //m.metodoSinManejoDeExcepciones(-10);
        m.metodoConManejoDeExcepciones(-10);
        m.metodoConManejoDeExcepcionesConBloqueFinally(-10);
        m.metodoConManejoDeExcepcionesConBloqueFinally(4);
    }
    
}
