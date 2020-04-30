import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyMenu extends World
{

    /**
     * Constructor for objects of class MyMenu.
     * 
     */
    public MyMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 230, 1); 
    }
    
        
    public void started() {
    addObject(new Sky(), 300, 115);
    addObject(new Mountain(), 599, 115);
    addObject(new RoadBack(), 599, 115);
    addObject(new Bush(), 599, 115);
    addObject(new road(), 599, 115);
    addObject(new RoadFront(), 599, 115);
    addObject(new Menu(), 300, 115);
    showText  ("Mr. Grant Runs Away From a Bear!", 300, 70);
    }
    
    
}
