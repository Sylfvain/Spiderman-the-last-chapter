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
        super(600,600, 1);
         setBackground("Win.jpg");
            
        
    }
    
    public void started( ) {
        if (Greenfoot.isKeyDown("a"))
        
            setBackground("EmpireState.png");
            
        addObject(new Label("Empieza",50),250,250);
        /*
        
        addObject(new Spiderman(), 200, 500);
        addObject(new Venom(), 200, 100);
        addObject(new Venom(), 400, 100);
        addObject(new Venom(), 500, 150);
        addObject(new Venom(), 100, 150);
        addObject(new Venom(), 300, 150);*/
    }
}
