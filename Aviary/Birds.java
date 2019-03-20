/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.aviary;

/**
 *
 * @author GLNN104Lab
 */
public class Birds {
    public int wingSpan;
    public String color;
    public String beakType;
    public boolean fly;
    public String name;
    public int age;

    public Birds(int wingSpan, String color, String beakType, boolean fly, String name, int age) {
        this.wingSpan = wingSpan;
        this.color = color;
        this.beakType = beakType;
        this.fly = fly;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Birds{" + "wingSpan=" + wingSpan 
                + ", color=" + color 
                + ", beakType=" + beakType 
                + ", fly=" + fly 
                + ", name=" + name 
                + ", age=" + age + '}';
    }
    
    
    
}
