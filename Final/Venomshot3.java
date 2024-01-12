import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Venomshot3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Venomshot3 extends Actor
{
    int MOVE_VAL=6;
    int BULL_SIZE =12;
    // Disparos creador
    public Venomshot3()
    {
        getImage().scale(BULL_SIZE,BULL_SIZE);
    }
    /**
     * Act - do whatever the Venomshot3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
         setImage ( "Telavenom.png" );
        setLocation(getX(), getY()+MOVE_VAL);
        
           Spiderman h=(Spiderman) getOneIntersectingObject(Spiderman.class);
        if (h!=null)
        {
            Final_boss.SpidermanLifeCount.add(-1);
            if(Final_boss.SpidermanLifeCount.getValue()==0)
            {
                getWorld().removeObject(h);
                Greenfoot.setWorld(new Lost());
            }
                getWorld().removeObject(this);
            
        } else if(getY()> 590)
        {
        getWorld().removeObject(this);
    }
    }
}
