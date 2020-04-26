import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mountain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mountain extends Actor
{
    int i=0;
    public void act() 
    {
        if(i==3) {
        i=0;
        this.setLocation(this.getX()-1, this.getY());
        }
        i++;
        if(this.isAtEdge()) this.setLocation(600, this.getY());
    }    
}
