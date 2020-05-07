import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Right extends Actor
{
    private Pacer pacer;
    public Right() {
    pacer = MyWorld.getPacer();
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("j") && !Greenfoot.isKeyDown("f")) {
            this.setImage("RightPress.png");
            if(pacer.getFootVal() == 2) pacer.beginRun(); 
            if(pacer.getFootVal() != 0) {
                pacer.setFootVal(0);
                pacer.mark();
            }
            
        }
        else this.setImage("Right.png");
    }    
}
