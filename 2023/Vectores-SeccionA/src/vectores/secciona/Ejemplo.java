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
    
    public void vectoresComoParametros(int [] parametro) {
        for (int dato : parametro) {
            System.out.println(dato);
        }
    }
    
    public void parametroPorValor(int parametro) {
        parametro = 0;
        System.out.println(parametro);
    }
    
    public void parametroPorReferencia(int [] parametro) {
        parametro[0] = -1;
        System.out.println(parametro[0]);
    }
    
}
