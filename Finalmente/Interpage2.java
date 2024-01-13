import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Interpage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interpage2 extends World
{

    /**
     * Constructor for objects of class Interpage2.
     * 
     */
    public Interpage2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        setBackground("Fondo Casas.jpg");
        started();
    }
    public void started( ) {
           
        addObject(new Label("Pulse Space para continuar",30),300,420);
        addObject(new Label("FINAL BOSS",30),300,50);

    }
     public void act() {
        if (Greenfoot.isKeyDown("Space"))
            Greenfoot.setWorld(new MyWorld(3));
        }
         
    }
    
