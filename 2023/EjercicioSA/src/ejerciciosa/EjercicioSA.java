/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosa;

import java.util.Random;

/**
 *
 * @author miguelcatalan
 */
public class EjercicioSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tiempoLlegadaCliente = numeroAleatorio();
        System.out.println("Minuto de llegada del primer cliente: " + tiempoLlegadaCliente);
        
        int tiempoDeServicioCliente, tiempoFinDeServicioCliente;
        
        for (int i = 0; i <= 720; i++) {
            System.out.println("Minuto " + i);
            
            if (i == tiempoLlegadaCliente) {
                System.out.println("Llega un cliente...");
                tiempoDeServicioCliente = numeroAleatorio();
                System.out.println("Tiempo de servicio del cliente: " + tiempoDeServicioCliente);
                tiempoFinDeServicioCliente = i + tiempoDeServicioCliente;
                System.out.println("Fin de tiempo de servicio del cliente: " + tiempoFinDeServicioCliente   );
                tiempoLlegadaCliente = i + numeroAleatorio();
                System.out.println("Tiempo de llegada del siguiente cliente: " + tiempoLlegadaCliente);
            }
            
           
            
        }
        
    }
    
    public static int numeroAleatorio() {
        Random r = new Random();
        return r.nextInt(1, 4);
    }
}
