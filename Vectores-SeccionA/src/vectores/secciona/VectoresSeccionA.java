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
        
        int [] var1 = {1, 2 ,3};
        int [] var2 = new int[10];
        String [] var3 = new String[10];
        Object [] var4 = new Object[5];
        
        //System.out.println(var1[2]);
        
        //System.out.println(var1[1]);
        //var1[1] = 4;
        //System.out.println(var1[1]);
        
        /*
        for (int indice = 0; indice < var1.length; indice++) {
            System.out.println(var1[indice]);
        }
        
        for (int dato : var1) {
            System.out.println(dato);
        }
        */
        /*
        Ejemplo e = new Ejemplo();
        int entero = 10;
        //System.out.println(entero);
        //e.parametroPorValor(entero);
        //System.out.println(entero);
        System.out.println(var1[0]);
        e.parametroPorReferencia(var1);
        System.out.println(var1[0]);
        //e.vectoresComoParametros(var1);
        */
        
        int [][] v = {{1, 4}, {2, 5}, {3, 6}}; 
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j ++) {
                System.out.println(v[i][j]);
            }
        }
        
        int [][] v1 = new int [3][4];
        
        
    }
    
}
