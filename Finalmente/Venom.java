import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Venom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Venom extends Actor
{
    int X_MOVE=2;
    int Min_shot_gap=150;
    int Shot_gap=5000;
    SimpleTimer shotTimer = new SimpleTimer();
    
    int randomShot=Min_shot_gap +Greenfoot.getRandomNumber(Shot_gap)
;    /**
     * Act - do whatever the Venom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage ( "venom.png" );
        setRotation(90);
        
        setLocation(getX()+X_MOVE, getY());
        if((getX() >590||(getX() <10)))
        {
        X_MOVE =X_MOVE*-1;
    }
    if (shotTimer.millisElapsed()>(Min_shot_gap+randomShot))
      {
        getWorld().addObject(new Venomshot(),getX(),getY());
        shotTimer.mark();
        Greenfoot.getRandomNumber(Shot_gap);
      }

       
        
    
    }
}

        
    
