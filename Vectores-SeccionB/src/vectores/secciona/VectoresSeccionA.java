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
        
        /*
        int [] datos = {34, 56, 4, 10, 77, 51, 93, 30, 5, 52};
        System.out.printf("Arreglo desordenado:%n%s%n%n", Arrays.toString(datos));
        OrdenamientoCombinacion ordenamientoCombinacionObj = new OrdenamientoCombinacion();
        ordenamientoCombinacionObj.ordenamientoCombinacion(datos);
        System.out.printf("Arreglo ordenado:%n%s%n%n", Arrays.toString(datos));
        */
        
        int [] var1 = {1, 2, 3, 10};
        int [] var2 = new int[10];
        Object [] var3 = new Object[5];
        
        /*System.out.println(var1[2]);
        var1[1] = 4;
        System.out.println(var1[1]);
        System.out.println(var1[1 + 1]);
        */
        
        /*
        for (int i = 0; i < var1.length ; i++) {
            System.out.println(var1[i]);
        }
        
        for (int elemento : var1) {
            System.out.println(elemento);
        }
        */
        
        Ejemplo e = new Ejemplo();
        //e.vectorComoParametro(var1);
        /*
        int argumento = 10;
        System.out.println(argumento);
        e.parametroPorValor(argumento);
        System.out.println(argumento);
        */
//        System.out.println(var1[0]);
//        e.parametroPorReferencia(var1);
//        System.out.println(var1[0]);
         
        int [][] v = {{1, 4}, {2, 5}, {3, 6}};
        //System.out.println(v[1][1]);
        
        int [][] v1 = new int[4][6];
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.println(v[i][j]);
            }
        }

    }
    
}
