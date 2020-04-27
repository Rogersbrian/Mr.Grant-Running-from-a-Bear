import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tumbleweed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tumbleweed extends Actor
{
    /**
     * Act - do whatever the Tumbleweed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         int x= getX();
double amplitude = 2.0;
double frequency = 5.0;
x-=3;
setLocation(x, getY()+(int)(Math.sin((double)(getX()+1)*frequency/95.5)*amplitude));
    }    
}
