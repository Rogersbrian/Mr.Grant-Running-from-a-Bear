import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HSBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HSBack extends Actor
{
    /**
     * Act - do whatever the HSBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.isKeyDown("e"))
        Greenfoot.setWorld(new MyMenu());// Add your action code here.
    }    
}
