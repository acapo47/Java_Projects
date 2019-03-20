/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.kennel;

import my.exceptions.BadDoggieException;

/**
 *
 * @author Anthony
 */
public class Doggy {

    private String size;
    private String breed;
    private String name;
    private boolean badAttitude;

    public Doggy(String size, String breed,
            String name, boolean badAttitude) {
        this.size = size;
        this.breed = breed;
        this.name = name;
        this.badAttitude = badAttitude;
    }

    public String bark(int times) {
        String yelp = "";
        for (int i = 0; i < times; i++) {
            yelp += "Hey ";
        } // end for
        return yelp;
    }// end method bark
    
    public String pet() throws BadDoggieException{
        if (badAttitude) {
            throw new BadDoggieException("Don't pet "
                    + "this dog!!!!");
        } 
        return "Who's a good doggie?";
    } //end method pet

    @Override
    public String toString() {
        return "Doggy{" + "size=" + size
                + ", breed=" + breed
                + ", name=" + name
                + ", badAttitude=" + badAttitude + '}';
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the badAttitude
     */
    public boolean isBadAttitude() {
        return badAttitude;
    }

    /**
     * @param badAttitude the badAttitude to set
     */
    public void setBadAttitude(boolean badAttitude) {
        this.badAttitude = badAttitude;
    }

}
