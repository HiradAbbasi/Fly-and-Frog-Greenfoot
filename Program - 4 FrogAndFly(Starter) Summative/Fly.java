import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * The fly counts how many Food object it eats and every time the
 * fly eats all 10 Food objects, 10 more Food objects are added to the 
 * the world. This Fly class controls and randomizes the Fly's rotation
 * and also gives you the chance to control the Fly.
 * 
 * @author Hirad Abbasi
 * @version October 23rd
 */
public class Fly extends Creature
{
    public Fly()
    {
        /*
        * modify this code to make the turtle face any random 
        * initial direction
        */
        setRotation(Greenfoot. getRandomNumber(360));
    }
    
    /**
     * Act - Does whatever the Fly is controlled to do. Things such as
     * making the fly move and also removing the Food evey time they come
     * in contact. This method is called whenever the 'Act' or 'Run' 
     * button gets pressed in the environment.
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        moveKeys();
        removeTouching();
        
    } 
    
    /**
     * MoveKeys is used to Contorl the Fly in the Up,Right, and Left directions.
     * When the right key is pressed the fly turns 5 degrees and when the Left 
     * key is pressed the fly turns -5 degrees.
     * 
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    private void moveKeys()
    {
        // make the fly move 4 steps in the direction it is facing
        if(Greenfoot.isKeyDown("Up") == true)
        {
            move(4);
        }
        /*
        * Make the fly turn left or right 5 degrees when
        * the left or right arrow key is pressed. 
        */
         if(Greenfoot.isKeyDown("Left") == true)
        {
            turn(-5);
        }
        
        if(Greenfoot.isKeyDown("Right") == true)
        {
            turn(5);
        }
    }
    
     /**
     * removeTouching is in controlling of removing Food objects on the World
     * every time the Fly comes in contact with the Food.
     * 
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    private void removeTouching()
    {
        /*
        * If the fly touches a Food object, remove the Food object
        * from the world. 
        */
        if(isTouching(Food.class) == true )
        {
            removeTouching(Food.class);
            ( (Beach)getWorld() ).update();
        }   
    }
}
