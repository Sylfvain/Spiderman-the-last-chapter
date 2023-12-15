import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Venom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Venom extends Actor
{
    /**
     * Act - do whatever the Venom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage ( "venom.png" );
        move (1);
        setRotation(90);
        if (Greenfoot.getRandomNumber(100)<10){
            turn(5);
        }
}
}

        
    
