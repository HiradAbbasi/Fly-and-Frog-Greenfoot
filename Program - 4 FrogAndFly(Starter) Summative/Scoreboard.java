import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The scoreboard class is responsible for counting and adding the
 * score that you get by collecting Food as the Fly. The maximum 
 * amount of points that you can gather is 100. That is also when 
 * you recive the text saying "You Win". The scoreboard is located
 * on the top left of the screen.
 * 
 * @author Hirad Abbasi 
 * @version October 23rd
 */
public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);

    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    /**
     * AddToScore will make sure to show count and display the score on the top 
     * left of the screen. When you reach the score of 100 the text "YOU WIN" 
     * will apear on the screen. The addToScore also needs to make sure to 
     * respawn the Food objects evey time the Fly reaches the score of 10 or above.
     * 
     * @param None There are no parameters
     * @return Nothing is returnted
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 100) {
            img.drawString("Score: " + points, 5,25); 
            ((Beach)getWorld()).resetFood();
        } else {
            img.drawString("You win!!!", 5,25);
        } 
    } 
    
    
}