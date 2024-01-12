// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Level2 extends World
{
    public static Counter SpidermanLifeCount =new Counter();
    public static Counter scoreCount =new Counter();
    /**
     * Constructor for objects of class Level2.
     */
    public Level2()
    {
        super(600, 600, 1);
        setBackground("EmpireState.png");
        started();
    }
    
    public void started( ) {
         
        addObject(new Spiderman2(), 200, 500);
        
        addObject(new Venom(), 50, 100);
        addObject(new Venom(), 150, 100);
        addObject(new Venom(), 250, 100);
        addObject(new Venom(), 350,100);
        addObject(new Venom(), 450, 100);
        addObject(new Venom(), 30, 200);
        addObject(new Venom(), 130,200);
        addObject(new Venom(), 230, 200);
        addObject(new Venom(), 330, 200);
        addObject(new Venom(), 430, 200);
        
        addObject(scoreCount, 550,25);
        scoreCount.setValue(0);
        
        addObject(SpidermanLifeCount, 50,25);
        SpidermanLifeCount.setValue(3);
      
    }
    
    
}
