/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.folks;

/**
 *
 * @author Anthony
 */
public class Folks {
    String name;
    int age;
    double income;
    int iq;

    public Folks(String name, int age, double income, int iq) {
        this.name = name;
        this.age = age;
        this.income = income;
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Folks{" + "name=" + name 
                + ", age=" + age 
                + ", income=" + income 
                + ", iq=" + iq + '}';
    }
    
    
}
