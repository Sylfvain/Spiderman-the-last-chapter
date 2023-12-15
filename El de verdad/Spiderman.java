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

    /**
     * Act - do whatever the Spiderman wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* /El personaje se mueve tres celdas en la dirección que tenga asignada*/
        if (Greenfoot . isKeyDown ( "Right" )) {
            if (! isAtEdge ( )) {
                move ( 5 );
            }
        }
        if (Greenfoot . isKeyDown ( "Left" )) {
            if (! isAtEdge ( )) {
                move ( - 5 );
            }
        }
    }
}
