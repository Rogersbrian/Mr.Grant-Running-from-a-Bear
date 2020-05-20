import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Mountain extends Background
{
    private Pacer pacer = MyWorld.getPacer();
    int i=0;
    public void act() 
    {
        if(i/3.0>=(int)(pacer.getSpeed()*-3.33+7.6)) {
        i=0;
        this.setLocation(this.getX()-1, this.getY());
        if(this.isAtEdge()) this.setLocation(600, this.getY());
        }
        i++;
        
    }    
}
