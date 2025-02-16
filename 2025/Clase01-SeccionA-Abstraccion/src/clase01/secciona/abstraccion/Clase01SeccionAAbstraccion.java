/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase01.secciona.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Clase01SeccionAAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante1 = new Estudiante("Jonathan", "Perez", 'M', "7590-23-0001", 18);
        Estudiante estudiante2 = new Estudiante("Hilda", "Lopez", 'F', "7590-23-0002", 17);
        
        Curso curso1 = new Curso(12, "Programación 1", "Miguel Catalán");
        Curso curso2 = new Curso(6, "Física 1", "David Mux");
        
        Salon salon1 = new Salon(202, "INED", 35);
        Salon salon2 = new Salon(201, "INED", 35);
        
        estudiante1.asignar(curso1);
        estudiante1.asignar(curso2);
        estudiante1.mostrarCursosAsignados();
        /*
        estudiante1.nombre = "Jonathan";
        estudiante1.apellidos = "Perez";
        estudiante1.carne = "7590-23-0001";
        estudiante1.sexo = 'M';
        estudiante1.edad = 18;
        */
        /*
        estudiante2.nombre = "Hilda";
        estudiante2.apellidos = "Lopez";
        estudiante2.carne = "7590-23-0002";
        estudiante2.sexo = 'F';
        estudiante2.edad = 17;
        */
        
        estudiante1.programar();
        
        estudiante2.aprender();
    }
    
}
