/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudexample;

import java.util.ArrayList;

/**
 *
 * @author miguelcatalan
 */
public class CRUDExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EstudianteDB estudianteDb = new EstudianteDB();
        
        //Insertar registro
        Estudiante e1 = new Estudiante("7590-23-100000", "Jose", "Perez", 18, 'M');
        estudianteDb.agregar(e1);
        
        //Obtener un registro
        Estudiante e2 = estudianteDb.obtener("7590-23-100000");
        System.out.println(e2);
        
        //Actualizar registro
        e1.setNombres("Carlos");
        estudianteDb.actualizar(e1);
        System.out.println("Se actualizó registro...");
        
        //Eliminar registro
        estudianteDb.eliminar("7590-23-100000");
        System.out.println("Se eliminó registro...");
        
        //Listar todos los registros
        ArrayList<Estudiante> a = estudianteDb.obtenerTodos();
        System.out.println(a.size());
    }
    
}
