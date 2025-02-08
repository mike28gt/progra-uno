/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase01.seccionb.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Clase01SeccionBAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Curso curso1 = new Curso(12, "Programación 1", "Miguel Catalán");
        /*
        curso1.nombre = "Programación 1";
        curso1.catedratico = "Miguel Catalán";
        curso1.codigo = 12;
        */
        
        Curso curso2 = new Curso(15, "Derecho Informático", "Román Cancinos");
        /*
        curso2.nombre = "Derecho Informático";
        curso2.catedratico = "Román Cancinos";
        curso2.codigo = 15;
        */
        
        Estudiante estudiante1 = new Estudiante("7590-24-00001", 
                                                "Jose",
                                                "Leal",
                                                18,
                                                'M');
        /*
        estudiante1.nombre = "Jose";
        estudiante1.apellidos = "Leal";
        */
        estudiante1.asignar(curso1);
        
        Estudiante estudiante2 = new Estudiante("7590-24-00002", 
                                                "Jackeline",
                                                "Navichoc",
                                                18,
                                                'F');
        /*
        estudiante2.nombre = "Jackeline";
        estudiante2.apellidos = "Navichoc";
        */
        estudiante2.pagar();
        
        estudiante2.asignar(curso1);
        
        curso1.mostrarEstudiantesAsignados();
        
        
        
        
        
    }
    
}
