/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.seccionb;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguelcatalan
 */
public class BaseDeDatosSerializada {
    
    public void escribir() {
    
        try {
            Path pathObj = Paths.get("cuentas_serializadas.bin");
            OutputStream outputStreamObj = Files.newOutputStream(pathObj);
            ObjectOutputStream objectOutputStreamObj = new ObjectOutputStream(outputStreamObj);
            
            Cuenta c1 = new Cuenta(100.00f, 0.0f, 12345, 54321);
            Cuenta c2 = new Cuenta(150.00f, 50.0f, 23456, 65432);
            
            objectOutputStreamObj.writeObject(c1);
            objectOutputStreamObj.writeObject(c2);
            
            objectOutputStreamObj.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatosSerializada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void leer() {
        
        ObjectInputStream objectInputStreamObj = null;
        
        try {
            Path pathObj = Paths.get("cuentas_serializadas.bin");
            InputStream inputStreamObj = Files.newInputStream(pathObj);
            objectInputStreamObj = new ObjectInputStream(inputStreamObj);
            
            while (true) {
                Object obj = objectInputStreamObj.readObject();
                Cuenta cuentaObj = (Cuenta)obj;
                
                System.out.println(cuentaObj.getSaldo() + " " +
                                   cuentaObj.getSaldoFlotante() + " " +
                                   cuentaObj.getNumeroDeCuenta() + " " +
                                   cuentaObj.getNip());
            }
            
        } catch (EOFException ex) {
            System.out.println("Se alcanzo el fin de archivo.");
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatosSerializada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDeDatosSerializada.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (objectInputStreamObj != null) {
                try {
                    objectInputStreamObj.close();
                } catch (IOException ex) {
                    Logger.getLogger(BaseDeDatosSerializada.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void eliminar() {
        int numeroDeCuentaAEliminar = 23456;
        ArrayList arrayListObj = new ArrayList();
        int indiceAEliminar = -1;
        
        ObjectInputStream objectInputStreamObj = null;
        //Lectura y carga de datos
        try {
            Path pathObj = Paths.get("cuentas_serializadas.bin");
            InputStream inputStreamObj = Files.newInputStream(pathObj);
            objectInputStreamObj = new ObjectInputStream(inputStreamObj);
            
            while (true) {
                Object obj = objectInputStreamObj.readObject();
                
                arrayListObj.add(obj);
            }
            
        } catch (EOFException ex) {
            System.out.println("Se alcanzo el fin de archivo.");
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatosSerializada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDeDatosSerializada.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (objectInputStreamObj != null) {
                try {
                    objectInputStreamObj.close();
                } catch (IOException ex) {
                    Logger.getLogger(BaseDeDatosSerializada.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        // Manipular los datos - eliminación del objeto
    
        for (int i = 0; i < arrayListObj.size(); i++) {
            Object obj = arrayListObj.get(i);
            Cuenta cuentaObj = (Cuenta)obj;
            
            if (cuentaObj.getNumeroDeCuenta() == numeroDeCuentaAEliminar) {
                indiceAEliminar = i;
                break;
            }
        }
        
        arrayListObj.remove(indiceAEliminar);
        
        // Escribir los objetos del ArrayList al archivo
        
         try {
            Path pathObj = Paths.get("cuentas_serializadas.bin");
            OutputStream outputStreamObj = Files.newOutputStream(pathObj);
            ObjectOutputStream objectOutputStreamObj = new ObjectOutputStream(outputStreamObj);
            
            for (int i = 0; i < arrayListObj.size(); i++) {
                Object obj = arrayListObj.get(i);
                
                objectOutputStreamObj.writeObject(obj);
            }
            
            objectOutputStreamObj.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatosSerializada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
