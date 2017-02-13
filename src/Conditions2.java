
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Conditions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city
        City kw = new City();
        
        
        //create a robot
        Robot karel= new Robot(kw,4,1,Direction.EAST);
        
        
        //create path to follow
        new Thing (kw,4,2);
        new Thing (kw,4,3);
        new Thing (kw,4,3);
        
        new Thing (kw,3,3);
        
        new Thing (kw,2,3);
        new Thing (kw,2,3);
        new Thing (kw,2,3);
        new Thing (kw,2,3);
        
        //Show number of things count
        kw.showThingCounts(true);
        
        
        //step onto the first part of path
        karel.move();
        
        //loop
        while(true){
            //if there are things 
            //      pick them all up 
                   while(karel.canPickThing()){
                    karel.pickThing();
            
            // if holding 1 thing, move
            if(karel.countThingsInBackpack()== 1)
                //drop things
                karel.putThing();
                //move
                karel.move();
             
            // if holding 2 things, turn left
             } if(karel.countThingsInBackpack()== 2){ 
                //drop things
                karel.putThing();
                karel.putThing();
                //move
                karel.turnLeft();
                karel.move();
            // if holding 3 things, turn right
                if(karel.countThingsInBackpack())
            // if holding 4 things, stop
             }
            }
}
}
