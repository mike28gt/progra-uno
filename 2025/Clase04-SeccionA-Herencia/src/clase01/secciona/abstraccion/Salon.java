/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase01.secciona.abstraccion;

/**
 *
 * @author miguelcatalan
 */
public class Salon {
    private int numero;
    private String ubicacion;
    private int capacidad;
    private Curso listadoCursos [];
    private int indice;

    public Salon(int numero, String ubicacion, int capacidad) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        listadoCursos = new Curso[10];
        indice = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.err.println("El número de salón ");
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad > 0) {
            this.capacidad = capacidad;
        } else {
            System.err.println("La capacidad debe ser un número positivo.");
        }
    }
    
    void asignar(Curso curso) {
        listadoCursos[indice] = curso;
        indice++;
    }
    
    public void mostrarCursosAsignados() {
        for (int i = 0; i < indice ; i++) {
            System.out.println(listadoCursos[i]);
        }
    }
    
}
