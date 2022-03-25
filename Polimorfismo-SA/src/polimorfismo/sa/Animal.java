/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo.sa;

/**
 *
 * @author miguelcatalan
 */
public class Animal {
    private String picture;
    private String food;
    private int hunger;
    private int boundaries[] = new int[2];
    private int location [] = new int[2];

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        System.out.println("Método original de la clase Animal");
        this.food = food;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int[] getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(int[] boundaries) {
        this.boundaries = boundaries;
    }

    public int[] getLocation() {
        return location;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }
    
    public void makeNoise() {
        System.out.println("Make sound as an... animal?");
    }
    
    public void eat() {
        System.out.println("Eat as an... animal?");
    }
    
    public void sleep() {
        System.out.println("Sleep as an animal.");
    }
    
    public void roam() {
        System.out.println("Roam as an... animal");
    }
}
