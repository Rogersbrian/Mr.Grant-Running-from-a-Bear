import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class road extends Actor
{
    /**
     * Act - do whatever the road wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.setLocation(this.getX()-1, this.getY());
        if(this.isAtEdge()) this.setLocation(600, this.getY());
    }    
}
