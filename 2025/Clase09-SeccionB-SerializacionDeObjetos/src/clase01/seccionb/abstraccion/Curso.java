/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.seccionb.abstraccion;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguelcatalan
 */
public class Curso {
    private int codigo;
    private String nombre;
    private Catedratico catedratico;
    private Estudiante listadoEstudiantes[] = new Estudiante[50];
    private int cantidadEstudiantes;
    
    public Curso(int codigo, String nombre, Catedratico catedratico) {
        System.out.println("Se ejecuta el constructor de curso");
        this.codigo = codigo;
        this.nombre = nombre;
        this.catedratico = catedratico;
        this.cantidadEstudiantes = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo >= 0) {
            this.codigo = codigo;
        } else {
            System.err.println("El código de curso debe ser mayor o igual que 0.");
        }
    }

    public String getNombre() {
        return nombre;
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 

    public void setNombre(String nombre) {
        if (nombre.trim().length() > 0) {
            this.nombre = nombre;
        } else {
            System.err.println("El nombre no puede estar vacío.");
        }
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        if (catedratico != null) {
            this.catedratico = catedratico;
        } else {
            System.err.print("El catedrático debe tener un valor válido.");
        }
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        this.listadoEstudiantes[cantidadEstudiantes] = estudiante;
        cantidadEstudiantes++;
    }
    
    public void mostrarEstudiantesAsignados() {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println(this.listadoEstudiantes[i]);
        }
    }
    
    public void exportarEstudiantes(String ruta) {
    
        Path path = Paths.get(ruta);
        
        try {
            OutputStream os = Files.newOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            
            for (int i = 0; i < cantidadEstudiantes; i++) {
                oos.writeObject(listadoEstudiantes[i]);
            }
            
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void importarEstudiantes(String ruta) {
        
        Path path = Paths.get(ruta);
        ObjectInputStream ois = null;
        
        try {
            InputStream is = Files.newInputStream(path);
            ois = new ObjectInputStream(is);
            
            while (true) {
                Estudiante e = (Estudiante)ois.readObject();
                System.out.println(e);
            }
                        
        } catch (EOFException ex) {
            System.out.println("Se terminó de leer el archivo.");
        } catch (IOException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    @Override
    public String toString() {
        return " codigo: " + codigo +
               " nombre: " + nombre +
               " Catedratico " + catedratico;
    }
}
