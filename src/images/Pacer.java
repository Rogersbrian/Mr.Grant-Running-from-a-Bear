/**
 * Write a description of class pacer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacer extends SimpleTimer 
{

    private double speed = 0;
    /*footVal is a flag with 3 states.  
     * 2 means that the player has not taken their first step.
     * 1 means that it is the Right foot's turn to step
     * 0 means that it is the Left foot's turn to step
     */ 
    private int footVal = 2;
    
    public Pacer()
    {
        speed = 0;
    }
    
    
 
    
    //accessors
    public double getSpeed() {
    return speed;
    }
    public int getFootVal() {
    return footVal;
    }
    //mutators
    public void setFootVal(int val) {
        footVal = val;
    }
    public void increaseSpeed(double val) {
    speed += val;
    }
    //@override
    public void reduceSpeed() {
    if(speed > 1) speed *=0.7;
    else speed -= 0.7;
    }
    public void mark() {
      speed = (speed + ((1200-millisElapsed())/650.0))/2;
      super.mark();
      //System.out.println(speed);
    }
    public void beginRun() {
    super.mark();
    speed = 1;
    }
    
}
