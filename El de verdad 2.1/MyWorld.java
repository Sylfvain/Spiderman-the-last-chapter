// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 600, 1);
        setBackground("EmpireState.png");
        started();
    }
    
    public void started( ) {
         
        addObject(new Spiderman(), 200, 500);
        addObject(new Venom(), 200, 100);
        addObject(new Venom(), 400, 100);
        addObject(new Venom(), 500, 150);
        addObject(new Venom(), 100, 150);
        addObject(new Venom(), 300, 150);
        
      
    }
    
    
}
