/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase01.seccionb.abstraccion;

import java.time.LocalDate;
import java.util.ArrayList;

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
        
        Catedratico catedratico1 = new Catedratico("123", 
                "Miguel", "Catalan", 
                21, 
                'M', 
                "Facultad de Ingeniería en Sistema de Información y Ciencias de la Computación",
                "Ingeniero en Sistemas");
        
        Catedratico catedratico2 = new Catedratico("345", 
                "Roman", 
                "Cancinos", 
                25, 
                'M', 
                "Facultad de Ingeniería en Sistema de Información y Ciencias de la Computación",
                "Doctor en Derecho");
        
        Curso curso1 = new Curso(12, "Programación 1", catedratico1);
        /*
        curso1.nombre = "Programación 1";
        curso1.catedratico = "Miguel Catalán";
        curso1.codigo = 12;
        */
        
        Curso curso2 = new Curso(15, "Derecho Informático", catedratico2);
        /*
        curso2.nombre = "Derecho Informático";
        curso2.catedratico = "Román Cancinos";
        curso2.codigo = 15;
        */
        
        Estudiante estudiante1 = new Estudiante("7590-24-00001", 
                                                "Jose",
                                                "Leal",
                                                18,
                                                'M',
                                                "Ingeniería en Sistemas de Información");
        /*
        estudiante1.nombre = "Jose";
        estudiante1.apellidos = "Leal";
        */
        estudiante1.asignar(curso1);
        
        Estudiante estudiante2 = new Estudiante("7590-24-00002", 
                                                "Jackeline",
                                                "Navichoc",
                                                18,
                                                'F',
                                                "Ingeniería en Sistemas de Información");
        //estudiante2.nombre = "Jackeline Lourdes";
        estudiante2.setNombre("Jackeline Lourdes");
        
        //estudiante1.edad = 20;
        System.out.println("(Usando el getter) " + 
                            estudiante2.getNombre());
        
        
        /*
        estudiante2.nombre = "Jackeline";
        estudiante2.apellidos = "Navichoc";
        */
        estudiante2.pagar();
        
        estudiante2.asignar(curso1);
        
        curso1.mostrarEstudiantesAsignados();
        
        estudiante2.setEdad(-5);
        estudiante2.setEdad(19);
        System.out.println("La edad de " + 
                            estudiante2.getNombre() +
                            " es de " +
                            estudiante2.getEdad());
        
        estudiante2.setSexo('M');
        System.out.println("El sexo de " + 
                            estudiante2.getNombre() +
                            " es " +
                            estudiante2.getSexo());
        
        
        estudiante1.mostrarDatos();
        catedratico1.mostrarDatos();    
        
        Auditorio a1 = new Auditorio(123, "A-01", 500);
        
        Conferencista c1 = new Conferencista("Elon", "1234567890", 53, "Musk", 'M', LocalDate.of(2025, 3, 15), "Conferencia", catedratico1, "SpaceX");
        c1.mostrarDatos();
        
        estudiante1.mostrarDatos();
        
        catedratico1.generarIdInterno();
        
        int i;
        i = 1;
        
        Estudiante e1 = new Estudiante();
        MiembroUniversidad e2 = new Estudiante();
        Persona e3 = new Estudiante();
        Object e4 = new Estudiante();
        
        e1.pagar();
        Estudiante e5 = (Estudiante)e2;
        e5.pagar();
        
        AsignarCursos e6 = new Catedratico();
        AsignarCursos e7 = new Estudiante();
        
        ArrayList<MiembroUniversidad> lista = new ArrayList();
        lista.add(new Estudiante());
        lista.add(new Catedratico());
        
        Persona p5;
        p5 = new PersonalAdministrativo();
        p5.mostrarDatos();
        
        p5 = new Catedratico();
        p5.mostrarDatos();
        
        p5 = new Estudiante();
        p5.mostrarDatos();
        
        Persona [] personas = new Persona[10];
        personas[1] = new Estudiante();
        personas[2] = new Catedratico();
        personas[3] = new PersonalAdministrativo();
        
        
        
        /*
        Estudiante e1 = new Estudiante();
        
        System.out.println(estudiante1);
        */
        //Persona p1 = new Persona();
        //MiembroUniversidad mu1 = new MiembroUniversidad();
        
        
    }
    
}
