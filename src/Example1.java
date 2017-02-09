
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a new city called kitchener
        City kitchener = new City();
        
        // creating a robot
        Robot karel = new Robot(kitchener,2,1,Direction.EAST); 
        karel.move();
        karel.turnLeft();
        
                
        
        
    }
}
