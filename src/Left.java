import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Left extends Actor
{
    private Pacer pacer;
    
    public Left() {
    pacer = MyWorld.getPacer();
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("j")) {
            this.setImage("LeftPress.png");
          
            if(pacer.getFootVal() == 2) pacer.beginRun(); 
            if(pacer.getFootVal() != 1) {
                pacer.setFootVal(1);
                pacer.mark();
            }
 
        }
        else this.setImage("Left.png");
              if(pacer.millisElapsed() > 350) {
            if(pacer.getFootVal() == 2) pacer.beginRun();
            else {
                
                pacer.mark();
                pacer.reduceSpeed();
            }
        }
    
    }
    }  

