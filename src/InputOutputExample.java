
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class InputOutputExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);

        //asking the user to type in there name
        System.out.println("Please enter your name.");
        //scanning in their name into a variable 
        String name2 = input.nextLine();
        //string name = "Nathania";
        String name = "Nathania";

        //saying hello to user
        System.out.println("Hello " + name2);

        //ask the user what year they were born
        //use this to calculate age
        System.out.println("What year were you born?");
        int year = input.nextInt();
        //determine their age
        int age = 2017 - year;
        if (age > 0) {
            System.out.println("You are " + age + " years old!");
        } else {
            System.out.println("I think you are lying...");
        }
    }
}