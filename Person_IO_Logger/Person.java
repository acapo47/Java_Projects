/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.classes;

/**
 *
 * @author Anthony
 */
public class Person {
    String firstName;
    String lastName;
    int age;
    String major;

    public Person(String firstName, String lastName, int age, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", major=" + major + '}';
    }
    
}
