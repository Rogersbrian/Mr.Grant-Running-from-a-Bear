import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Jumper extends Actor
{
    private Pacer pacer;
    private final double GRAVITY=1;
    private int velocity;
    private static boolean key = false;
    private int keyTime = 251;
    private int i = 0;
    public Jumper(){
        velocity=0;
        pacer = MyWorld.getPacer();
    }
    public void act() 
    {
        if (isTouching(Scorpion.class)||isTouching(Bear.class)||isTouching(Bird.class)||isTouching(Cactus.class)||isTouching(Cactus.class)||isTouching(Soda.class)||isTouching(Tumbleweed.class))
        Greenfoot.setWorld(new GameOver());
        if (isTouching(CliffBar.class)||isTouching(ElectricBike.class)||isTouching(Gatorade.class)||isTouching(ZPizza.class)||isTouching(Tumbleweed.class))
        {
        Points.addToTotal();
        }
        fall();
        if(Greenfoot.isKeyDown("space")&&getY()>getWorld().getHeight()-70)
        jump();
        move();
    }    
    public void fall(){
        setLocation(getX(), getY()+velocity);
        if(getY()>getWorld().getHeight()-70)
        velocity=0;
        else if(i == 2) {
       velocity+=GRAVITY;
         
    }
    }
    
    public void jump(){
        velocity=-8;
        pacer.increaseSpeed(0.8);
    }
    
    public void move()
    {
        int y=getY();
        int x=getX();
        int paceNum = (int)Math.round((pacer.getSpeed()-1)*3);
        
         if(i == 2) {
        x+= paceNum;
        i=0;
    }
    else i++;
        /*if(Greenfoot.isKeyDown("f")){//move
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
    */
        setLocation(x,y);
        
    }
}
