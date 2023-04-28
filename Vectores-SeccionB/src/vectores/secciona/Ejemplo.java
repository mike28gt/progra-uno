/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores.secciona;

/**
 *
 * @author miguelcatalan
 */
public class Ejemplo {
    
    public void vectorComoParametro(int [] parametro) {
        for (int elemento : parametro) {
            System.out.println(elemento);
        }
    }
    
    public void parametroPorValor(int parametro) {
        parametro = -1;
        System.out.println(parametro);
    }
    
    public void parametroPorReferencia(int [] vector) {
        vector[0] = -1;
        System.out.println(vector[0]);
    }
    
}
