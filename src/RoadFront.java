import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RoadFront here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoadFront extends Actor
{
    /**
     * Act - do whatever the RoadFront wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.setLocation(this.getX()-2, this.getY());
        if(this.isAtEdge()) this.setLocation(600, this.getY());
    }    
}
