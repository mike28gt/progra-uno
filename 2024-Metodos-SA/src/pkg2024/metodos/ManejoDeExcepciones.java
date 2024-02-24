/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.metodos;

/**
 *
 * @author miguelcatalan
 */
public class ManejoDeExcepciones {
    
    public void metodoSinManejoDeExcepciones(int i) {
    
        int [] arreglo = new int[5];
        System.out.println("El valor de arreglo en el índice " + i + " es " + arreglo[i]);
    }
    
    public void metodoConManejoDeExcepciones(int i) {
    
        int [] arreglo = new int[5];
        
        try {
        System.out.println("El valor de arreglo en el índice " + i + " es " + arreglo[i]);
        } 
        catch (Exception e) {
            System.err.println("Se intento acceder a un índice inexistente");
        }
    }

    public void metodoConManejoDeExcepcionesConBloqueFinally(int i) {
    
        int [] arreglo = new int[5];
        
        try {
        System.out.println("El valor de arreglo en el índice " + i + " es " + arreglo[i]);
        } 
        catch (Exception e) {
            System.err.println("Se intento acceder a un índice inexistente");
        }
        finally {
            System.out.println("Este bloque se ejecuta independientemente si ocurre un error o no.");
        }
    }
    
}
