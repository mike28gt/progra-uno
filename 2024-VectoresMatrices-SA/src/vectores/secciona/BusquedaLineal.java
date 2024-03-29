/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores.secciona;

/**
 *
 * @author miguelcatalan
 */
public class BusquedaLineal {
    // realice la búsqueda lineal en los datos
    public  int busquedaLineal(int datos[], int llaveBusqueda) {
        // itera a través del vector de forma secuencial
        for (int indice = 0; indice < datos.length; indice++) {
            if (datos[indice] == llaveBusqueda) {
                return indice; // retorna el índice de la llave de búsqueda
            }
        }
        
        return -1; // no se encontró la llave de búsqueda
    }
}
