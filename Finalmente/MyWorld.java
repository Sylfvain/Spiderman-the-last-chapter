// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    public Counter SpidermanLifeCount;
    public Counter scoreCount;
    public int level;
    public GreenfootSound musica;
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 600, 1);
        setBackground("EmpireState.png");
        SpidermanLifeCount = new Counter();
        scoreCount = new Counter();
        level = 1;
        musica = null;
        started();
    }
    
    public MyWorld(int nivel)
    {
        super(600, 600, 1);
        SpidermanLifeCount = new Counter();
        scoreCount = new Counter();
        level = nivel;
        musica = null;
        if ((level == 1) || (level == 2))
        {
            setBackground("EmpireState.png");    
        } else 
        {
            setBackground("Pantalla 3.png");
        }
        started();   
    }
    
    public void started( ) {
         
        addObject(new Spiderman(level), 200, 500);
        if (musica != null) 
        {
            musica.stop();
        }
        if (level == 1) 
        {
            addObject(new Venom(), 50, 100);
            addObject(new Venom(), 150, 100);
            addObject(new Venom(), 250, 100);
            addObject(new Venom(), 350,100);
            addObject(new Venom(), 30, 200);
            addObject(new Venom(), 150, 200); 
            addObject(new Venom(), 250, 200);
            addObject(new Venom(), 350, 200);
            musica = new GreenfootSound("Kirby.mp3");
        } else if (level == 2) {
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
            musica = new GreenfootSound("Kirby.mp3");
        } else if (level == 3) {
            addObject(new Venom(), 50, 150);
            addObject(new Venom(), 150, 150);
            addObject(new Venom(), 250, 150);
            addObject(new Venom(), 350,150);
            addObject(new Venom(), 450, 150);
            addObject(new Venom(), 30, 250);
            addObject(new Venom(), 130,250);
            addObject(new Venom(), 230, 250);
            addObject(new Venom(), 330, 250);
            addObject(new Venom(), 430, 250);
            addObject(new Duende(), 300, 80);
            musica = new GreenfootSound("MegaMan2.mp3");
        }
        
        addObject(scoreCount, 550,25);
        scoreCount.setValue(0);
        
        addObject(SpidermanLifeCount, 50,25);
        SpidermanLifeCount.setValue(3);
        
        musica.play();
      
    }
    
    
}
