import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class Frog and it is reponsible for the frogs movement,
 * speed, and the frogs randomized actions. The frog is responible for 
 * finding and removing the fly from the game. The frog has randomized 
 * movement that helps it find the fly.
 * 
 * @author Hirad Abbasi
 * @version october23rd
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed; 
    
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
        speed=Greenfoot.getRandomNumber(4)+4;
    }
    
    /**
     * Act - Does whatever the Frog is told to do. Things such as
     * making the Frog move and also removing the Fly evey time they come
     * in contact. This method is called whenever the 'Act' or 'Run' 
     * button gets pressed in the environment.
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        move(speed);
        
        randomizedMove();
        
        atEdge();
        
        touchFly();
    }
    
    /**
     * RandomizedMove will move the Frog in randomized locations. Fiftty percent 
     * of the time the Frog turns right and Fiffy percent of the time it turns 
     * left. The degrees that the frogs uses to turn is 15 degrees.
     * 
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    private void randomizedMove()
    {
        /*
        * Make the frog turn off course 35% of the time.
        * It will turn left or right 15 degrees equally as often. 
        */ 
        if( Greenfoot. getRandomNumber(100) < 35)
        {
            if( Greenfoot. getRandomNumber(100) < 50)
            {
            //Turn counter clock wise 5 degrees
            turn(-15);
            }
            else 
            {
            //Turn clock wise 5 degrees
            turn(15);
            }
        }
    }
    
    /**
     * AtEdge will make th Frog turn 7 degrees when the Frog reaches the edge
     * of the World. 
     * 
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    private void atEdge()
    {
        /*
        * If the frog is near an edge of the world, make it turn
        * 7 degrees to the right. 
        * 
        * Hint: use the atEdgeOfWorld method in the Creature class.
        */
        if(isAtEdge()  == true)
        {
            turn(7);
        }
    }
    
    /**
     * TouchFly will make sure to pause the game and force a restart. The program
     * will stop when the Frog and the Frog come in contact.
     * 
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    private void touchFly()
    {
        /*
        * If the frog encounters the fly, the game ends, so
        * stop the scenario 
        */ 
        if(isTouching(Fly.class) == true )
        {
            Greenfoot.stop();
        }
    }
    
}     
        
  
    
