import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Interpage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interpage extends World
{

    /**
     * Constructor for objects of class Interpage.
     * 
     */
    public Interpage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        setBackground("Fondo Casas.jpg");
        started();
    }
    public void started( ) {
           
        addObject(new Label("Pulse Space para continuar",30),300,420);
        addObject(new Label("NEXT LEVEL",30),300,50);

    }
     public void act() {
        if (Greenfoot.isKeyDown("Space"))

            
            Greenfoot.setWorld(new Level2());
        }
         
    }
    
