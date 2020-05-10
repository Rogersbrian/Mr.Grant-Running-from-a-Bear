import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends Actor
{
    /**
     * Act - do whatever the Points wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int total=0;
    private int count=0;
    public void act() 
    {
        count++;
        setImage(new GreenfootImage("Points:" + "\n"+pointTotal(), 25, Color.WHITE, new Color(0, 0, 0, 0)));
    }
    public String pointTotal(){
        if(count/100==1)
        {
        total++;
        count=0;
        }
        return Integer.toString(total);
    } 
    public static void addToTotal(){
        total+=1;
    }
    public static void reset(){
        total=0;
    }
    public static String showTotal(){
        return Integer.toString(total);
    }
}
