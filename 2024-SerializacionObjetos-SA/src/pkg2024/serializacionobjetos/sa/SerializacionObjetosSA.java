/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.serializacionobjetos.sa;

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
public class SerializacionObjetosSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SerializacionObjetosSA obj = new SerializacionObjetosSA();
        obj.leer();
        
    }
    
    public void escribir() {
        
        Pelicula p1 = new Pelicula("Kung Fu Panda", 2024, "Familiar", "Director 1", "Estados Unidos");
        Pelicula p2 = new Pelicula("Garfield", 2024, "Familiar", "Director 2", "Estados Unidos");
        Pelicula p3 = new Pelicula("Dune", 2024, "Acción", "Director 3", "Estados Unidos");
        Pelicula p4 = new Pelicula("Space Jam", 1990, "Familiar", "Director 4", "Estados Unidos");
        
        Path path = Paths.get("listado_peliculas.obj");
        
        try {
            OutputStream outputStream = Files.newOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            
            objectOutputStream.writeObject(p1);
            objectOutputStream.writeObject(p2);
            objectOutputStream.writeObject(p3);
            objectOutputStream.writeObject(p4);
            
            objectOutputStream.close();
            
        } catch (IOException ex) {
            Logger.getLogger(SerializacionObjetosSA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void leer() {
        
        Path path = Paths.get("listado_peliculas.obj");
        
        try {
            InputStream inputStream = Files.newInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            
            while(true) {
                Pelicula p = (Pelicula)objectInputStream.readObject();
                System.out.println(p);
            }
            
        } catch (EOFException ex) {
            System.out.println("Se alcanzó el final del archivo.");
        } catch (IOException ex) {
            Logger.getLogger(SerializacionObjetosSA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SerializacionObjetosSA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
