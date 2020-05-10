import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count=0;
    private int rate=500;
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
       if(rate>95)
       rate--;
       }
    }    
    public void move(){
    int x= getX();
    double amplitude = 2.0;
    double frequency = 3.0;
    x--;
    setLocation(x, getY()+(int)(Math.sin((double)(getX()+1)*frequency/95.5)*amplitude));
}
}
