/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores.seccionb;

/**
 *
 * @author miguelcatalan
 */
public class OrdenamientoInsercion {
    
    public void ordenamientoInsercion(int[] datos) {
        
        // itera a través de datos.length - 1 elementos
        for (int siguiente = 1; siguiente < datos.length; siguiente++) {
            
            // valor a insertar
            int insercion = datos[siguiente];
            // posición en donde se va a colocar el elemento
            int moverElemento = siguiente;
            
            // busca posición para colocar el elemento actual
            while (moverElemento > 0 && datos[moverElemento - 1] > insercion) {
            
                // desplaza el elemento una posición a la derecha
                datos[moverElemento] = datos[moverElemento - 1];
                moverElemento--;
            }
            
            // coloca el elemento insertado
            datos[moverElemento] = insercion;
            //imprime la iteración del algoritmo
            imprimirIteracion(datos, siguiente, moverElemento);
        }
    }
    
    private void imprimirIteracion(int[] datos, int iteracion, int indice) {
        
        System.out.printf("despues de iteración %2d: ", iteracion);
        
        // imprime los elementos hasta el elemento intercambiado
        for (int i = 0; i < indice; i++) {
            System.out.printf("%d ", datos[i]);
        }
        
        // indica intercambio
        System.out.printf("%d* ", datos[indice]);
        
        // termina de imprimir el arreglo en pantalla
        for (int i = indice + 1; i < datos.length; i++) {
            System.out.printf("%d ", datos[i]);
        }
        
        System.out.printf("%n ");
        
        // indica la cantidad del arreglo que está ordenado
        for (int i = 0; i <= iteracion; i++) {
            System.out.printf("-- ");
        }
        System.out.println();
    }
}
