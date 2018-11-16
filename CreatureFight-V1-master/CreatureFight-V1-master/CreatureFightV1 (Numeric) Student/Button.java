import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button class extends actor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private GreenfootImage buttonImage1 = new GreenfootImage(100, 50);
    private GreenfootImage buttonImage2 = new GreenfootImage(100, 50);
    
    private boolean justClicked = false;
    
    public int value;
    /**
     * Default constructor for objects of the Button class
     * 
     * @param There are no parameters
     * @return an object of the Button type
     */
    public Button()
    {
        GreenfootImage text1 = new GreenfootImage(100 , 50);
        GreenfootImage text2 = new GreenfootImage(100 , 50);
        
        value = 50;
        
        buttonImage1.setColor(Color.BLUE);
        buttonImage1.fillRect(0, 0, 100, 50);
        text1.setColor( Color.WHITE );
        text1.setFont( new Font( "Helvetica", true, false, 30 ) );
        text1.drawString("" + value, text1.getWidth()/3 + 1, text1.getHeight()/2 + 8);
        
        buttonImage1.drawImage( text1, 0, 0 );

        buttonImage2.setColor( Color.MAGENTA );
        buttonImage2.fillRect(0, 0, 100, 50);
        text2.setColor( Color.BLACK );
        text2.setFont( new Font( "Helvetica", true, false, 30 ) );
        text2.drawString("" + value, text2.getWidth()/3 + 1, text2.getHeight()/2 + 8);
        
        buttonImage2.drawImage( text2, 0, 0 );

        setImage( buttonImage1 );
    }

    /**
     * Button constructor that allows for customization of Button objects
     * 
     * @param c is the Color that the Button will have
     * @param v is the numerical value that is associated with the button
     * @return an object of the Button type
     */
    public Button( Color c, int v )
    {
        GreenfootImage text1 = new GreenfootImage(100 , 50);
        GreenfootImage text2 = new GreenfootImage(100 , 50);

        if( c.equals( Color.RED ) )
        {
            //TODO (49): Set value to be -v, since a red button means we are taking away health
            value = -v;
        }
        else
        {
            //TODO (50): Set value to be v because every other color means we are adding health
            value = v;
        }

        buttonImage1.setColor(c);
        buttonImage1.fillRect(0, 0, 100, 50);
        text1.setColor( Color.WHITE );
        text1.setFont( new Font( "Helvetica", true, false, 30 ) );
        text1.drawString("" + value, text1.getWidth()/3 + 1, text1.getHeight()/2 + 8);
     
        buttonImage1.drawImage( text1, 0, 0 );

        buttonImage2.setColor( Color.BLACK );
        buttonImage2.fillRect(0, 0, 100, 50);
        text2.setColor( Color.WHITE );
        text2.setFont( new Font( "Helvetica", true, false, 30 ) );
        text2.drawString("" + value, text2.getWidth()/3 + 1, text2.getHeight()/2 + 8);
        
        buttonImage2.drawImage( text2, 0, 0 );

        setImage( buttonImage1 );
    }

    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        CreatureWorld world = (CreatureWorld) getWorld();
        Creature enemy;
        if(getObjectsInRange(200, Creature.class).get(0).getPlayerOwner() == 1)
        {
            enemy = world.getPlayerTwo();
        }
        else
        {
            enemy = world.getPlayerOne();
        }
        if( Greenfoot.mousePressed(this) )
        {
            setImage( buttonImage2 );
            justClicked = true;
        }
        if( Greenfoot.mousePressed(this) )
        {
            setImage( buttonImage2 );
            justClicked = true;
        }
        else if( Greenfoot.mouseClicked(this) )
        {
            setImage( buttonImage1 );
            
            if( justClicked == true )
            {
                //TODO (53): Make a method call to the add method of the HealthBar class (accessed by using our health variable) and use value as the parameter
                enemy.getHealthBar().add(value);
                justClicked = false; 
            }
        }
    }    
}
