
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class CountingLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // create robot karel
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);

        //make a counter
        int counter = 0;
        while (counter < 5) {
            //move
            karel.move();
            //increase the counter!
            counter = counter + 1;
        }
        karel.turnAround();
        // using a for loop to count
        //for(define a variable;condition to loop;cahnge variable)
        for (int i = 0; i < 5; i = i++) {
            //move
            karel.move();
        }
        //Compound Condition
        //&& <= AND statement - both must be true
        //|| <= OR statement - one of them must be true
        if (karel.frontIsClear()) {
            if (karel.countThingsInBackpack() == 5) {
                //do something
            }
        }
        if (karel.frontIsClear() && karel.countThingsInBackpack() == 5) {
        }

    }
}