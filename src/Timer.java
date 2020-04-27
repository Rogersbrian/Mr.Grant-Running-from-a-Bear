import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Timer extends Actor
{
    private int TimeElapsed = 0;
    private int minute = 0;
    private int second = 0;
    private String output="";
    public Timer() {
        Greenfoot.setSpeed(50);
        output = "Time:";
    }
    public Timer(String output) {
        Greenfoot.setSpeed(50);
        this.output = output;
    }
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Greenfoot.setSpeed(50);
        setImage(new GreenfootImage(output + "\n" + timeElapsed(), 25, Color.BLACK, new Color(0, 0, 0, 0)));
    }    
    
    public String timeElapsed(){
        TimeElapsed+=1;
        second=TimeElapsed/50;
        if(minute>59)
    {
    Greenfoot.stop();
    return "Great job! You won the game!";
}
        if(second>60)
        {
            minute++;
            TimeElapsed=0;   
        }
        if(minute==0&&second==0)
        {
        return second+ " sec";
    }
        if(minute==0)
        {
        return second+ " secs";
    }
   
        return minute + " min "+ second+ " secs";
            }
}
