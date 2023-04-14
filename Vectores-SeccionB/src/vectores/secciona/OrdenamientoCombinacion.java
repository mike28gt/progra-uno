/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores.secciona;

/**
 *
 * @author miguelcatalan
 */
public class OrdenamientoCombinacion {
    
    public void ordenamientoCombinacion(int[] datos) {
        ordenarArreglo(datos, 0, datos.length - 1);
    }
    
    private void ordenarArreglo(int[] datos, int inferior, int superior) {
        
        // evalúa el caso base; el tamaño del arreglo es igual a 1
        if ((superior - inferior) >= 1) {
            
            // calcula el elemento medio del arreglo
            int medio1 = (inferior + superior) / 2;
            // calcula el siguiente elemento arriba
            int medio2 = medio1 + 1;
            
            // imprime en pantalla la división del arreglo
            System.out.printf("division: %s%n", subarregloString(datos, inferior, superior));
            System.out.printf("          %s%n", subarregloString(datos, inferior, medio1));
            System.out.printf("            %s%n%n", subarregloString(datos, medio2, superior));
            
            // divide el arreglo a la mitad, ordena cada mitad (invocación recursiva)
            ordenarArreglo(datos, inferior, medio1);
            ordenarArreglo(datos, medio2, superior);
            
            // combina dos arreglos ordenados después de que regresan las invocaciones de ordenarArreglo
            combinar(datos, inferior, medio1, medio2, superior);
        }
    }
    
    private void combinar(int[] datos, int izquierdo, int medio1, int medio2, int derecho) {
        
        // indice en subarreglo izquierdo
        int indiceIzquierdo = izquierdo;
        // indice en subarreglo derecho
        int indiceDerecho = medio2;
        // indice en arreglo de trabajo temporal
        int indiceCombinado = izquierdo;
        // arreglo de trabajo
        int[] combinado = new int[datos.length];
        
        // imprime en pantalla los dos subarreglos antes de combinarlos
        System.out.printf("combinacion: %s%n", subarregloString(datos, izquierdo, medio1));
        System.out.printf("             %s%n", subarregloString(datos, medio2, derecho));
        
        // combina los arreglos hasta llegar al final de uno de ellos
        while (indiceIzquierdo <= medio1 && indiceDerecho <= derecho) {
            // coloca el menot de dos elementos actuales en el resultado y lo mueve al siguiente espacio en los arreglos
            if (datos[indiceIzquierdo] <= datos[indiceDerecho]) {
                combinado[indiceCombinado++] = datos[indiceIzquierdo++];
            }
            else {
                combinado[indiceCombinado++] = datos[indiceDerecho++];
            }
        }
        
        // si el arreglo izquierdo está vacío
        if (indiceIzquierdo == medio2) {
            // copia el resto del arreglo derecho
            while (indiceDerecho <= derecho) {
                combinado[indiceCombinado++] = datos[indiceDerecho++];
            }
        }
        else {
            while (indiceIzquierdo <= medio1) {
                combinado[indiceCombinado++] = datos[indiceIzquierdo++];
            }
        }
        
        // copia los valores de vuelta al arreglo original
        for (int i = izquierdo; i <= derecho; i++) {
            datos[i] = combinado[i];
        }
        
        // imprime en pantalla el arreglo combinado
        System.out.printf("  %s%n%n", subarregloString(datos, izquierdo, derecho));
    }
    
    private String subarregloString(int[] datos, int inferior, int superior) {

        StringBuilder temporal = new StringBuilder();
        
        for (int i = 0; i < inferior; i++) {
            temporal.append("  ");
        }
        
        // imprime en pantalla el resto de los elementos del arreglo
        for (int i = inferior; i <= superior; i++) {
            temporal.append(" " + datos[i]);
        }
        
        return temporal.toString();
    }
}
