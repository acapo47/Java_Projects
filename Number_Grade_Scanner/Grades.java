//@author Anthony Capo

package numgrade;         //package declaration

import java.util.Scanner; //imports java scanner utility

public class Grades {     //declare and begin the class

    public static void main(String[] args) {    
        
        System.out.println("Welcome to the Letter Grade Convertor Program"); 
        System.out.println();
        String choice = "y"; //input to continue using program
        Scanner scnr = new Scanner(System.in); //creates a Scanner object named scnr
        
        //do while loop repeats the program until the user decides to quit
        do{
            System.out.print("Enter numerical grade: "); //prompt user for input
            int grade = scnr.nextInt(); //scanner stores and looks for the next input
            
                //'if' & 'else if' statements determine what letter grade the numerical data corresponds with
  
                if (grade <= 100 && grade >= 88){
                    System.out.println("Letter grade: A");
                    System.out.println();
                }
                else if (grade <= 87 && grade >= 80){
                    System.out.println("Letter grade: B");
                    System.out.println();
                }
                else if (grade <= 79 && grade >= 67){
                    System.out.println("Letter grade: C");
                    System.out.println();
                }
                else if (grade <= 66 && grade >= 60){
                    System.out.println("Letter grade: D");
                    System.out.println();
                }
                else if (grade <= 60 && grade >= 0){
                    System.out.println("Letter grade: F");
                    System.out.println();
                }

                System.out.print("Continue? (Y/N): "); //user enters choice to continue or not
                choice = scnr.next(); //evaluates choice to end or continue program
                System.out.println();
        
            }while (choice.equalsIgnoreCase("y")); 
        } 
} //end of class
