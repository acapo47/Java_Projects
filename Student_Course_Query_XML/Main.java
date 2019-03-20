/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg171206;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import my.entities.Course;
import my.entities.Student;

/**
 *
 * @author Anthony
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("171206PU");
        EntityManager em = 
                emf.createEntityManager();
        
        Student myStudent = new Student(new BigDecimal(15));
        myStudent.setFirstName("Ashley");
        myStudent.setLastName("Brian");
        
        Student myStudent2 = new Student(new BigDecimal(88));
        myStudent2.setFirstName("Oliver");
        myStudent2.setLastName("Montalbano");
        
        Course myCourse = new Course(new BigDecimal(99));
        myCourse.setCourseName("!Fun at 8AM");
        
        System.out.println(myStudent);
        System.out.println(myCourse);
        
        em.getTransaction().begin();
        em.persist(myStudent);
        em.persist(myStudent2);
        em.persist(myCourse);
        em.getTransaction().commit();
        
        myCourse.getStudentCollection().add(myStudent);
        myStudent.getCourseCollection().add(myCourse);
        myCourse.getStudentCollection().add(myStudent2);
        myStudent2.getCourseCollection().add(myCourse);
        
        em.getTransaction().begin();
        em.merge(myStudent);
        em.merge(myStudent2);
        em.merge(myCourse);
        em.getTransaction().commit();

    }

}
