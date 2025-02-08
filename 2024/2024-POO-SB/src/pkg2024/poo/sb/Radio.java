/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.poo.sb;

/**
 *
 * @author miguelcatalan
 */
public class Radio {
    private String tipoSonido;
    private float emisora;
    private String frecuencia;
    
    public Radio() {
       this.tipoSonido = "5.1";
       this.emisora = 96.5f;
       this.frecuencia = "FM";
    }

    public String getTipoSonido() {
        return tipoSonido;
    }

    public void setTipoSonido(String tipoSonido) {
        this.tipoSonido = tipoSonido;
    }

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        if (emisora >= 0.0f && emisora <=200.0f) {
            this.emisora = emisora;
        } 
        else {
            System.err.println("Emisora " + 
                    emisora + 
                    " no válida");
        }
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    public void cambiarEmisora() {}
    public void subirVolumen() {}
    public void bajarVolumen() {}
    public void recepcion() {} 
    public void apagar() {}
    public void encencender() {}
}
