import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HSInstructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HSInstructions extends Actor
{
    /**
     * Act - do whatever the HSInstructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Press s for hi-score; press e to exit hi-score.", 25, Color.WHITE, new Color(0, 0, 0, 0)));
        if (Greenfoot.isKeyDown("s"))
        Greenfoot.setWorld(new Scores());// Add your action code here.
    }    
}
