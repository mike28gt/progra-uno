/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase01.seccionb.abstraccion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
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
                "Miguel", 
                "Catalan", 
                21, 
                'M', 
                "Ingeniero en Ciencias y Sistemas",
                "Facultad de Ingeniería en Sistema de Información y Ciencias de la Computación");
        
        Catedratico catedratico2 = new Catedratico("345", 
                "Roman", 
                "Cancinos", 
                25, 
                'M', 
                "Doctor en Derecho",
                "Facultad de Ingeniería en Sistema de Información y Ciencias de la Computación");
        
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
                                                "Facultad de Ingeniería en Sistemas");
        /*
        estudiante1.nombre = "Jose";
        estudiante1.apellidos = "Leal";
        */
        estudiante1.asignar(curso1);
        
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("7590-24-00002", 
                                                "Jackeline",
                                                "Navichoc",
                                                18,
                                                'F',
                                                "Facultad de Ingeniería en Sistemas");
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
        
        System.out.println(estudiante1);
        
        Object o1 = new Object();
        
        /*
        Persona p1 = new Persona();
        MiembroUniversidad m1 = new MiembroUniversidad();
        Visitante v1 = new Visitante();
        */
        
        //AsignarCurso z1 = new AsignarCurso();
        
        catedratico1.generar();
        
        int i;
        i = 2;
       
        Estudiante e1;
        e1 = new Estudiante();
        
        MiembroUniversidad m1 = new Estudiante();
        Persona p1 = new Estudiante();
        Object o2 = new Estudiante();
        
        Estudiante e2 = (Estudiante)m1;
        e2.pagar();
        
        //Conferencista conferencista, Espacio ubicacion, String nombre, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoFin
        Conferencia co1 = new Conferencia(c1,
                a1,
                "Introducción a POO",
                LocalDateTime.of(2025, Month.MARCH, 29, 13, 0),
                LocalDateTime.of(2025, Month.MARCH, 29, 15, 0));
        
        co1.agregarAsistentes(estudiante1);
        co1.agregarAsistentes(catedratico1);
        
        System.out.println(co1);
        
        co1.mostrarAsistentes();
        
        //int codigo, String nombre, Catedratico catedratico
        Curso c3 = new Curso(15, "Cálculo", catedratico1);
        
        //String carne, String nombre, String apellidos, int edad, char sexo, String facultad
        Estudiante es1 = new Estudiante("7590-24-00001", "Manuel", "Mansilla", 18, 'M', "Ingeniería en Sistemas");
        Estudiante es2 = new Estudiante("7590-24-00002", "Amada", "Carcamo", 18, 'F', "Ingeniería en Sistemas");
        Estudiante es3 = new Estudiante("7590-24-00003", "Herbert", "Leal", 18, 'M', "Ingeniería en Sistemas");
        
        /*
        c3.agregarEstudiante(es1);
        c3.agregarEstudiante(es2);
        c3.agregarEstudiante(es3);
        
        c3.exportarEstudiantes("listado_estudiantes.bin");
        */
        
        c3.importarEstudiantes("listado_estudiantes.bin");
        
        ArrayList<Persona> b = new ArrayList<>();
        b.add(es1);
        b.get(0).getNombre();
        
    }
    
}
