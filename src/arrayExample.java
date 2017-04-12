
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class arrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to scan user input
       Scanner input = new Scanner (System.in);
       
       //create a list of 5 numbers
       double[] marks = new double[5];
       
       //scan in some marks
        System.out.println("Please enter in 5 marks.");
        
//        //longer way
//        //put a number in first position
//        marks[0] = input.nextDouble();
//        //put a number in second position
//        marks[1] = input.nextDouble();
//        //put in a number in third position
//        marks[2] = input.nextDouble();
//        //put in a number in fourth position
//        marks[3] = input.nextDouble();
//        //put in a number in fifth position
//        marks[4] = input.nextDouble();

        //BETTER WAY TO DO THIS - FOR LOOPS
        for (int i = 0; i < marks.length;i++){
            marks[i]=input.nextDouble(); 
        }
        //print out numbers
        System.out.println("Your numbers are ");
        for (int i = 0;i < marks.length;i++){
            System.out.println(marks[i]);
}
        // use a for loop to determine the sum
        //start with an accumulator
        double sum = 0;
        //for loop to go through each number
        for (int i =0; i<marks.length;i++){
            //add whatever number I'm on to sum
            sum = sum + marks[i];
        }
        System.out.println("The sum is " + sum);
        
        //calculate average
        double avg = sum/marks.length;
        System.out.println("The average is " + avg);
   
        //enhanced for loop
        for(double num:marks){
}
} 
}
     
       
        
