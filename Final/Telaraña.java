import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Telaraña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Telaraña extends Actor
{
    /**
     * Act - do whatever the Telaraña wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage ( "Telarana.png" );
        setLocation(getX(), getY() -8);
        
        Venom e=(Venom) getOneIntersectingObject(Venom.class);
        if (e !=null)
        {
            getWorld().removeObject(e);
            MyWorld.scoreCount.add(100);
            if(MyWorld.scoreCount.getValue()==500)
            {
            Greenfoot.setWorld(new Win());
        }
            getWorld().removeObject(this);
        } else if(getY() <5)
        {
        getWorld().removeObject(this);
    }
    
    }
    }
    

