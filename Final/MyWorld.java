// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    public static Counter SpidermanLifeCount =new Counter();
    public static Counter scoreCount =new Counter();
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
        
        addObject(new Venom(), 50, 100);
        addObject(new Venom(), 150, 100);
        addObject(new Venom(), 250, 100);
        addObject(new Venom(), 350,100);
        addObject(new Venom(), 400, 100);
        
        addObject(scoreCount, 550,25);
        scoreCount.setValue(0);
        
        addObject(SpidermanLifeCount, 50,25);
        SpidermanLifeCount.setValue(3);
      
    }
    
    
}
