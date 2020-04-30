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
    private static boolean game = false;
    int height = 115;
    int UI_top = 30;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 230, 1); 
    }
    
    public void started() {
    while (game == false)
    {
    if (Greenfoot.isKeyDown("space"))
    {
        game = true;
    }
}
    if (game == true){
    addObject(new Sky(), 599, height);
    addObject(new Clouds(), 599, height);
    addObject(new Mountain(), 599, height);
    addObject(new RoadBack(), 599, height);
    addObject(new Bush(), 599, height);
    addObject(new road(), 599, height);
    addObject(new RoadFront(), 599, height);
 
    addObject(new Bear(), 100, 300);
    addObject(new Jumper(), 245, 330);
    addObject(new Healthbar(), 500, UI_top);
    addObject(new Heart(), 455, UI_top);
    addObject(new Heart2(), 478, UI_top);
    addObject(new Heart3(), 501, UI_top);
    addObject(new Heart4(), 524, UI_top);
    addObject(new Heart5(), 547, UI_top);
    addObject(new Timer(), 200, 30);
    addObject(new Cactus(), 600, 300);
    addObject(new Bird(), 600, 100);
    addObject(new Soda(), 600, 350);
    addObject(new Tumbleweed(), 600, 350);
    addObject(new Scorpion(), 600, 365);

}
    }
}
