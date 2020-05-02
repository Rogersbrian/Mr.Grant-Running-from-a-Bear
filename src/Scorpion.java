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
    private int count=0;
    public void act() 
    {
        count++;
        if(count>100)
        {
     int y=getY();
        int x=getX();
        x-=4;
        setLocation(x,y);
        double amplitude = 1.3;
        double frequency = 10.0;
        x--;
        setLocation(x, getY()+(int)(Math.sin((double)(getX()+1)*frequency/95.5)*amplitude));
    }    
}
}
