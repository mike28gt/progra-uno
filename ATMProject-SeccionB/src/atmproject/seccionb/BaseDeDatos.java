/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.seccionb;

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
    
    private File fileObj = new File("cuentas.txt");
    
    public void escribir() {
        try { 
            FileWriter fw = new FileWriter(fileObj);
            BufferedWriter bw = new BufferedWriter(fw);
            //numero cuenta, nip, saldo, saldo flotante
            bw.write("12345|54321|100.00|0.00");
            bw.newLine();
            bw.write("34567|90876|1000.00|300.00");
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void agregar() {
        try { 
            FileWriter fw = new FileWriter(fileObj, true);
            BufferedWriter bw = new BufferedWriter(fw);
            //numero cuenta, nip, saldo, saldo flotante
            bw.write("98765|54321|100.00|0.00");
            bw.newLine();
            bw.write("87654|90876|1000.00|300.00");
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminar() {
        String numeroDeCuentaAEliminar = "34567";
        
        File cpFileObj = new File("copia_cuentas.txt");
        try {
            FileWriter fw = new FileWriter(cpFileObj);
            BufferedWriter bw = new BufferedWriter(fw);
            
            FileReader fr = new FileReader(fileObj);
            BufferedReader br = new BufferedReader(fr);
            
            String lineaArchivo;
            
            while ((lineaArchivo = br.readLine()) != null) {
                if (!lineaArchivo.startsWith(numeroDeCuentaAEliminar)) {
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
