import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scorpion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorpion extends Actor
{
    /**
     * Act - do whatever the Scorpion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         int y=getY();
        int x=getX();
       x-=.05;
        setLocation(x,y);
    }    
}
