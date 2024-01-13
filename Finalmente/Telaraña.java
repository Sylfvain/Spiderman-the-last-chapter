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
        MyWorld m = (MyWorld) getWorld();
        if (m.level == 1) 
        {
            setImage ( "Telala.png" );
        } else if ((m.level == 2) || (m.level == 3)) {
            setImage ( "telaraña-spidermanvenom.png" );
        }
        
        setLocation(getX(), getY() -8);
        Venom e=(Venom) getOneIntersectingObject(Venom.class);
        Duende d =(Duende) getOneIntersectingObject(Duende.class);
        
        if (e !=null)
        {
            m.removeObject(e);
            m.scoreCount.add(100);
            m.removeObject(this);
        } else if (d != null) {
            m.removeObject(d);
            m.scoreCount.add(200);
            m.removeObject(this);
        } else if(getY() <5)
        {
            m.removeObject(this);
        }
        
        int nivel = m.level;
        int score = m.scoreCount.getValue();
        if ((nivel == 1) && (score == 800))
        {
            m.musica.stop();
            Greenfoot.setWorld(new Interpage());
        } else if ((nivel == 2) && (score == 1000)) {
            m.musica.stop();
            Greenfoot.setWorld(new Interpage2());
        } else if ((nivel == 3) && (score == 1200)) {
            m.musica.stop();
            Greenfoot.setWorld(new Win());
        }
    }
}
    

