import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class NuevoEscenario extends World
{

    /**
     * Constructor for objects of class NuevoEscenario.
     */
    public NuevoEscenario()
    {
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        super(600,800, 1);
        setBackground("EmpireState.png");
        
        
        
    }
    
    public void started( ) {
        
        addObject(new Spiderman(), 200, 200);
    }
}
