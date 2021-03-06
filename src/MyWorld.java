import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static double worldSpeed = 1; 
    int height = 115;
    int UI_top = 30;
    public static Pacer pacer = new Pacer();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 230, 1); 
    
    addObject(new Sky(), 599, height);
    addObject(new Clouds(), 599, height);
    addObject(new Mountain(), 599, height);
    addObject(new RoadBack(), 599, height);
    addObject(new Bush(), 599, height);
    addObject(new road(), 599, height);
    addObject(new RoadFront(), 599, height);
    addObject(new Bear(), 100, 170);
    addObject(new Jumper(), 245, 170);
    addObject(new Timer(), 200, 30);
    addObject(new Cactus(), 600, 185);
    addObject(new Bird(), 600, 100);
    addObject(new Soda(), 600, 180);
    addObject(new Tumbleweed(), 600, 190);
    addObject(new Left() , 490, 200);
    addObject(new Right(), 495, 200);
    addObject(new Scorpion(), 600, 190);
    addObject(new Gatorade(), 600, 180);
    addObject(new ZPizza(), 600, 190);
    addObject(new Labtop(), 600, 170);
    addObject(new ElectricBike(), 600, 180);
    addObject(new CliffBar(), 600, 170);
    addObject(new Points(), 60, 30);
    addObject(new Block(), 620, 250);
}
     public static Pacer getPacer() {
        return pacer;
        
        }   
    }
