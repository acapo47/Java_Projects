/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.simpsons;

/**
 *
 * @author Anthony
 */
public class Folks {
    public String name;
    int age;
    double salary;
    int iq;

    public Folks(String name, int age, double salary, int iq) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Folks{" + "name=" + name 
                + ", age=" + age 
                + ", salary=" + salary 
                + ", iq=" + iq + '}';
    }
    
    
    
}
