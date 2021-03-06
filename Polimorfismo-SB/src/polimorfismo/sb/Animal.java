/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo.sb;

/**
 *
 * @author miguelcatalan
 */
public abstract class Animal {
    private String picture;
    private String food;
    private int hunger;
    private int boundaries[] = new int[2];
    private int location[] = new int[2];

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
    
    public abstract void makeNoise();
    
    public abstract void eat();
    
    public void sleep() {
        System.out.println("Sleep as an... animal?");
    }
    
    public abstract void roam();
}
