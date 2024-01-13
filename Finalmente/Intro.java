import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Intro extends World
{

    /**
     * Constructor for objects of class NuevoEscenario.
     */
    public Intro()
    {
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        super(600,600, 1);
        setBackground("Pantalla Inicial1.png");

        prepare();
    }

    public void started( ) {

        addObject(new Label("Pulse Space",50),250,450);

    }

    public void act() {
        if (Greenfoot.isKeyDown("Space"))

        // setBackground("EmpireState.png");

            Greenfoot.setWorld(new MyWorld());

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
