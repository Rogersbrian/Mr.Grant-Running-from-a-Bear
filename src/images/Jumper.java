import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Jumper extends Actor
{
    private Pacer pacer;
    private final double GRAVITY=1;
    private int velocity;
    private static boolean key = false;
    private int keyTime = 251;
    private int i = 0;
    private int k = 0;
    public Jumper(){
        velocity=0;
        pacer = MyWorld.getPacer();
    }
    public void act() 
    {
        if (isTouching(Scorpion.class)||isTouching(Bear.class)||isTouching(Bird.class)||isTouching(Cactus.class)||isTouching(Cactus.class)||isTouching(Soda.class)||isTouching(Tumbleweed.class))
        Greenfoot.setWorld(new GameOver());
        fall();
        cycleRun();
        if(Greenfoot.isKeyDown("space")&&getY()>getWorld().getHeight()-70)
        jump();
        move();
        changeKey();
    }    
    public void changeKey() {
       k++;
       
       
       if(k>=50+(int)(pacer.getSpeed()*-10)){
            k=0;
           this.setImage("Mr.Grant3.png");
        }
        else if(k>=40+(int)(pacer.getSpeed()*-10)) {
        this.setImage("Mr.Grant2.png");
        }
        else if(k>=30+(int)(pacer.getSpeed()*-10)) {
        this.setImage("Mr.Grant1.png");
        }
        else if(k>=20+(int)(pacer.getSpeed()*-10)) {
        this.setImage("Mr.Grant.png");
        }
        
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
        pacer.increaseSpeed(0.5);
    }
    public void cycleRun() {
    
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
      
        setLocation(x,y);
        
    }
    public boolean isOnGround() {
        if(this.getY()>getWorld().getHeight()-70) return true;
        return false;
    }
}
