import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     private String output ="";
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("space")){
        Greenfoot.setWorld(new MyWorld());
    }
    }   
}
