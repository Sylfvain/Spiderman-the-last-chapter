import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Telaraña3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Telaraña3 extends Actor
{
    /**
     * Act - do whatever the Telaraña3 wants to do. This method is called whenever
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
            Final_boss.scoreCount.add(100);
            if(Final_boss.scoreCount.getValue()==1000)
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
    

