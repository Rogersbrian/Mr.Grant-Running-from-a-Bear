import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soda extends Actor
{
    /**
     * Act - do whatever the Soda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count=0;
    private int rate=800;
    public void act() 
    {
        count++;
        if(count>rate)
        {
        move();
        } 
        if(getX()==0)
       {
       count=0;
       setLocation(600, 190);
       if(rate>90)
       rate--;
       }
    }     
    public void move()
    {
        int y=getY();
        int x=getX();
       x-=2;
        setLocation(x,y);
    }
}

