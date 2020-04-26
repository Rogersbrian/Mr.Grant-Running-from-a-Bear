import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void started() {
    addObject(new Mountain(), 599, 250);
    addObject(new Bush(), 599, 250);
    addObject(new RoadBack(), 599, 270);
    addObject(new road(), 599, 280);
    addObject(new RoadFront(), 599, 280);
    addObject(new Jumper(), 250, 330);
    addObject(new Bear(), 100, 350);
    addObject(new HealthBar(), 500, 50);
    addObject(new Heart(), 455, 50);
    addObject(new Heart2(), 478, 50);
    addObject(new Heart3(), 501, 50);
    addObject(new Heart4(), 524, 50);
    addObject(new Heart5(), 547, 50);
    addObject(new Timer(), 200, 50);
    
    
    
    }
}