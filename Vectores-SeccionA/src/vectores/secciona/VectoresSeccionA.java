/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores.secciona;

import java.util.Arrays;

/**
 *
 * @author miguelcatalan
 */
public class VectoresSeccionA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(datos));
        OrdenamientoSeleccion ordenamientoSeleccionObj = new OrdenamientoSeleccion();
        ordenamientoSeleccionObj.ordenamientoSeleccion(datos);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(datos));
        */
        
        /*
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(datos));
        OrdenamientoInsercion ordenamientoInsercionObj = new OrdenamientoInsercion();
        ordenamientoInsercionObj.ordenamientoInsercion(datos);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(datos));
        */
        
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(datos));
        OrdenamientoCombinacion ordenamientoCombinacionObj = new OrdenamientoCombinacion();
        ordenamientoCombinacionObj.ordenamientoCombinacion(datos);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(datos));
    }
    
}
