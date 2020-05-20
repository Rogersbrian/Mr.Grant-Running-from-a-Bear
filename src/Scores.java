import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scores extends World
{

    /**
     * Constructor for objects of class Scores.
     * 
     */
    public Scores()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
    addObject(new ScoreBoard(800,600), 400,300);
    addObject (new HSBack(), 1,1);
    }
    
        
    

 

}
