import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duende here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duende extends Actor
{
    int X_MOVE=3;
    int Min_shot_gap=1000;
    int Shot_gap=4000;
    SimpleTimer shotTimer = new SimpleTimer();
    
    int randomShot = Min_shot_gap + Greenfoot.getRandomNumber(Shot_gap);
    
    /**
     * Act - do whatever the Duende wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage ( "Green Goblin.png" );
        
        
        setLocation(getX()+X_MOVE, getY());
        if((getX() >590||(getX() <10)))
        {
            X_MOVE = X_MOVE * -1;
        }
        if (shotTimer.millisElapsed()>(Min_shot_gap+randomShot))
        {
            getWorld().addObject(new Duendeshot(),getX(),getY());
            shotTimer.mark();
            Greenfoot.getRandomNumber(Shot_gap);
        }

       
        
    
    }
}

        
    
