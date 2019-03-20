/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.kennel;

/**
 *
 * @author GLNN104Lab
 */
public class Dog {
    String breed;
    String size;
    boolean badTemper;
    String owner;
    String name;

    public Dog(String breed, String owner, String name) {
        this.breed = breed;
        this.owner = owner;
        this.name = name;
    }

    public Dog(String breed, String size, 
            boolean badTemper, String owner, 
            String name) {
        this.breed = breed;
        this.size = size;
        this.badTemper = badTemper;
        this.owner = owner;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + 
                ", size=" + size + 
                ", badTemper=" + badTemper +
                ", owner=" + owner +
                ", name=" + name + '}';
    }
    
    
    
    
}
