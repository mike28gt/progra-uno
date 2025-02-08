/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento.sb;

/**
 *
 * @author miguelcatalan
 */
public class Dog {
    private int size;
    private String breed;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.err.println("El tamaño del perro debe ser mayor que 0.");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return "Hola, mi nombre es " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void bark() {
        System.out.println("Ruff! Ruff!");
    }
}
