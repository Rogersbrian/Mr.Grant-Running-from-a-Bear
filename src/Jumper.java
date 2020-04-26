import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jumper extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int GRAVITY=1;
    private int velocity;
    public Jumper(){
        velocity=0;
    }
    public void act() 
    {
        fall();
        if(Greenfoot.isKeyDown("space")&&getY()>getWorld().getHeight()-70)
        jump();
        move();
    }    
    public void fall(){
        setLocation(getX(), getY()+velocity);
        if(getY()>getWorld().getHeight()-70)
        velocity=0;
        else
        velocity+=GRAVITY;
    }
    public void jump(){
        velocity=-20;
    }
    public void move()
    {
        int y=getY();
        int x=getX();
        if(Greenfoot.isKeyDown("f"))//move left
        x--;
        if(Greenfoot.isKeyDown("j"))//move right
        x++;
        if(Greenfoot.isKeyDown("space"))//jump
        {
        y--;
    }
        setLocation(x,y);
    }
}
