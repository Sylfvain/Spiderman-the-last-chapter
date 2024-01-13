import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lost extends World
{

    /**
     * Constructor for objects of class Lost.
     * 
     */
    public Lost()
    {    
    
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        super(600,600, 1);
        setBackground("Lost.jpg");
        started();
        
    }
    
    public void started( ) {
           
        addObject(new Label("YOU LOST",50),150,200);
    }
        
}
