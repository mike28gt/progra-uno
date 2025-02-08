/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.poo.sa;

/**
 *
 * @author miguelcatalan
 */
public class Radio {
    private boolean sonido;
    private float emisora;
    private String frecuencia;
    
    Radio() {
        sonido = false;
        emisora = 93.3f;
        frecuencia = "FM";
    }

    public boolean isSonido() {
        return sonido;
    }

    public void setSonido(boolean sonido) {
        this.sonido = sonido;
    }

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        if (emisora > 50.0f && emisora < 100.0f) {
            this.emisora = emisora;
        }
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    
    
    public void subirVolumen() {}
    public void bajarVolumne() {}
    public void cambiarEmisora() {}
    public void guardarEmisora() {}
}
