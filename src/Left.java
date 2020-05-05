import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Left here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Left extends Actor
{
    public static int interval = 0;
    public static double speed = 0;
    public static boolean firstStep = true;
    public static boolean leftTurn;
    public void act() 
    {
        if(Greenfoot.isKeyDown("f")) {
            if(firstStep) {
            speed = interval;
            }
            else if (leftTurn) resetTimer();
            
            this.setImage("LeftPress.png");
            leftTurn = false;
        }
        else this.setImage("Left.png");
        if(firstStep == true || leftTurn == true) {
        interval ++;
    }
    }  
    public static void resetTimer() {
       speed = (speed+interval)/2;
       interval = 0;
       System.out.println(speed);
    }
}
