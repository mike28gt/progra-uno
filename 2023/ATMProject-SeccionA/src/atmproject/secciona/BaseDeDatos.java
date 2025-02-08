/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.secciona;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguelcatalan
 */
public class BaseDeDatos {
    File fileObj = new File("cuentas.txt");
    
    //Escribir dentro del archivo
    public void escribir() {
        try {
            FileWriter fw = new FileWriter(fileObj);
            BufferedWriter bw = new BufferedWriter(fw);
            //numero de cuenta, nip, saldo, saldo flotante
            bw.write("12345|23456|123.00|0.00");
            bw.newLine();
            bw.write("98765|13579|1000.10|33.00");
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            //Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
    }
    
    public void leer() {
        try {
            FileReader fr = new FileReader(fileObj);
            BufferedReader br = new BufferedReader(fr);
            
            String lineaArchivo;
            
            while ((lineaArchivo = br.readLine()) != null) {
                System.out.println(lineaArchivo);
            }
            
            br.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void agregarDatos() {
        try {
            FileWriter fw = new FileWriter(fileObj, true);
            BufferedWriter bw = new BufferedWriter(fw);
            //numero de cuenta, nip, saldo, saldo flotante
            bw.write("88888|23456|123.00|0.00");
            bw.newLine();
            bw.write("99999|13579|1000.10|33.00");
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            //Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
    }
    
    public void eliminar() {
    
        String numeroCuentaAEliminar = "98765";
        
        // Crear un archivo que represente la copia
        // del archivo original
        
        try {
            File cpFileObj = new File("copia_cuentas.txt");
            FileWriter fw = new FileWriter(cpFileObj);
            BufferedWriter bw = new BufferedWriter(fw);
            
            FileReader rf = new FileReader(fileObj);
            BufferedReader br = new BufferedReader(rf);
            
            String lineaArchivo;
            
            while ((lineaArchivo = br.readLine()) != null) {
                if (!lineaArchivo.startsWith(numeroCuentaAEliminar)) {
                    bw.write(lineaArchivo);
                    bw.newLine();
                }
            }
            
            bw.close();
            br.close();
            
            cpFileObj.renameTo(fileObj);
            
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
