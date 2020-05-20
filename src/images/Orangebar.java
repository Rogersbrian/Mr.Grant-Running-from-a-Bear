import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Orangebar extends Actor
{
    private int i =0;
    private int j=0;  
    private int k=0;
    private Pacer pacer;
   public Orangebar() {
    pacer = MyWorld.getPacer();
    }
    public void act() 
    {
        if (pacer.getSpeed() > 1.4) {
           i++;
           if(i==5) {
            i=0;
            this.setLocation(this.getX() -1,this.getY());
            }
        }
        else if(pacer.getSpeed() < 0.9) {
        j++;
        if(j==15) {
        j=0;
        this.setLocation(this.getX() +1, this.getY());
        }
        }
        if(this.getX()<335) {
      
        k++;
        if(k==4) {
            k=0;
        pacer.increaseSpeed(-0.9);
    }
        }
    }    
}
