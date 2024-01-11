import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Spiderman extends Actor
{

    /**
     * 
     */
    public Spiderman()
    {
        setImage ( "Spidey.png" );
    }

    SimpleTimer shotTimer = new SimpleTimer();
    int SHOT_INTERVAL=250;
    int MOVE_VAL =5;
    /**
     * Act - do whatever the Spidey wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* /El personaje se mueve tres celdas en la dirección que tenga asignada*/
        if (Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+MOVE_VAL, getY());
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX()-MOVE_VAL, getY());
        }
         if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() -MOVE_VAL);
        }
         if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() +MOVE_VAL);
        }
        // Disparos
         if (Greenfoot.isKeyDown("space")&& shotTimer.millisElapsed() >SHOT_INTERVAL)
        {
            getWorld().addObject(new Telaraña(),getX(),getY());
            shotTimer.mark();
        }
    }
}
