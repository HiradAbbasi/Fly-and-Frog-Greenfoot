import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Hirad Abbasi
 * Class: Software Development 10S
 * Teacher: Mr.Hardman
 * Last date modified: October 23rd
 * 5 marks
 */



public class Beach extends World
{
    private Scoreboard score;
    
    /**
     * Constructor for objects of class Beach.Things such as the
     * Fly, the frog, and the random pieces of Food on the ground.
     * The constructor also stores the information for the 
     * scoreboard and also updates eveytime the Fly reaches the 
     * score of 10 or above.
     *
     */
    public Beach()
    {
       super(800, 600, 1); 
       
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)
       addFood(10);
       
       //Reset the Foodwhen all the Food on the screen is gone
       resetFood();

       //Add a Fly object at a random position somewhere in the world
       Fly();
       
       //Add a Frog object at the center of the world
       Frog();
       
       //The score borads location on the screen
       score = new Scoreboard();
       addObject( score, 80, 10);
    }
    
    /**
     * addFood will add Food objects in random locations in the world.
     * The addFood method is also used to respawn Food after the Fly 
     * reaches the score of 10 and above.  
     * 
     * @param There is int number inside the Parameters
     * @return Nothing is returned
     */
    
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) 
        {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);            
        }
    }
    /**
     * update will add the score of the Fly eating the Food in the World to the
     * scoreboard.
     * 
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    public void update()
    {
        score.addToScore();
    }
    
    /**
     * resetFood will reset the Food on the screen after the Fly reaches the
     * score of 10 or above.
     * 
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    public void resetFood()
    {
        if( getObjects(Food.class).isEmpty() == true)
        {
            addFood(10);            
        }
    }
    
    /**
     * Fly will be added to World in a random X and Y cordinate. There is one
     * Fly that spawns in every time the World is reset.
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    public void Fly()
    {
       int x = Greenfoot.getRandomNumber( getWidth() ); 
       int y = Greenfoot.getRandomNumber( getHeight() );
       addObject(new Fly(), x, y);
    }
    
    /**
     * Frog will be added to the center of the World . There is one Frog
     * that spawns in every time the World is reset.
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    public void Frog()
    {
        addObject(new Frog(), getWidth()/2, getHeight()/2);
    }   
} 
    

