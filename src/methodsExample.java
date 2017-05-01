/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class methodsExample {

    //method to say hello
    public static void sayHello() {
        System.out.println("Hello!");
    }

    //overloaded method...has parameters
    //say hello to specific person
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    /**
     * calculates the volume of the cylinder
     *
     * @param radius
     * @param height
     * @return
     */
    public static double volumeOfCylinder(double radius, double height) {

        //calculate the volume
        double rSquared = Math.pow(radius, 2);
        double volume = rSquared * Math.PI * height;

        return volume; // sends back an answer  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //calling the sayHello method
        //create string variable 
        String n = "Fred";
        sayHello();
        sayHello("Bob");
        sayHello(n);

        //Cylinder with radius = 10, height = 15
        double answer = volumeOfCylinder(10, 15);
        System.out.println(answer);


    }
}
