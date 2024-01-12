import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Telaraña2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Telaraña2 extends Actor
{
    /**
     * Act - do whatever the Telaraña2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage ( "telaraña-spidermanvenom.png" );
        setLocation(getX(), getY() -8);
        
        Venom e=(Venom) getOneIntersectingObject(Venom.class);
        if (e !=null)
        {
            getWorld().removeObject(e);
            Level2.scoreCount.add(100);
            if(Level2.scoreCount.getValue()==1000)
            {
            Greenfoot.setWorld(new Interpage2());
        }
            getWorld().removeObject(this);
        } else if(getY() <5)
        {
        getWorld().removeObject(this);
    }
    
    }
    }
    

