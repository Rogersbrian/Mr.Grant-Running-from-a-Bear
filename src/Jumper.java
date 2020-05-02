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
    private final double GRAVITY=1;
    private int velocity;
    private static boolean key = false;
    private int keyTime = 251;
    public Jumper(){
        velocity=0;
    }
    public void act() 
    {
        if (isTouching(Scorpion.class)||isTouching(Bear.class)||isTouching(Bird.class)||isTouching(Cactus.class)||isTouching(Cactus.class)||isTouching(Soda.class)||isTouching(Tumbleweed.class))
        Greenfoot.setWorld(new GameOver());
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
        velocity=-25;
    }
    public void move()
    {
        int y=getY();
        int x=getX();
   
        if(Greenfoot.isKeyDown("f")){//move
        key = true;
        keyTime = 0;
    }
    if (key == true){
    for (keyTime = 0; keyTime < 250; keyTime++)
        {
        if (Greenfoot.isKeyDown("j"))
        {
        x++;
        key = false;
        keyTime = 251;
    }
    }
}
        if (Greenfoot.isKeyDown("space"))//jump
        {
        y-=2;
    }
        setLocation(x,y);
    }
}
