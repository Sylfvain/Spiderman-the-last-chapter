import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Venomshot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Venomshot extends Actor
{
    int MOVE_VAL=6;
    int BULL_SIZE =12;
    // Disparos creador
    public Venomshot()
    {
        getImage().scale(BULL_SIZE,BULL_SIZE);
    }
    /**
     * Act - do whatever the Venomshot wants to do. This method is called whenever
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
            getWorldOfType(MyWorld.class).SpidermanLifeCount.add(-1);
            if(getWorldOfType(MyWorld.class).SpidermanLifeCount.getValue()==0)
            {
                getWorldOfType(MyWorld.class).removeObject(h);
                getWorldOfType(MyWorld.class).musica.stop();
                Greenfoot.setWorld(new Lost());
            }
                getWorldOfType(MyWorld.class).removeObject(this);
        } else if(getY() > 590)
        {
            getWorldOfType(MyWorld.class).removeObject(this);
        }
    }
}
