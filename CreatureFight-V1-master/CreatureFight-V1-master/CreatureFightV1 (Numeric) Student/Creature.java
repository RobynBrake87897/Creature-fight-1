import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creature class extends actor.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature extends Actor
{
    //TODO (5): Declare a HealthBar instance variable called creatureBar. Do not initialize it
    public HealthBar creatureBar;
    //TODO (6): Declare an integer variable called healthNumber. Do not initialize it
    public int healthNumber;
    //TODO (7): Declare an integer variable called playerOwnership. Do not initialize it
    public int playerOwnership;
    
    /**
     * Default constructor for objects of the Creature class
     * 
     * @param There are no parameters
     * @return an object of the Creature class
     */
    public Creature()
    {
        //TODO (8): Initialize the healthNumber variable to 500.
        healthNumber = 500;
        //TODO (9): Initialize the playerOwnership variable to 0.
        playerOwnership = 0;
        //TODO (10): Initialize the creatureBar variable to a new HealthBar object with parameters healthNumber, healthNumber, and 10
        creatureBar = new HealthBar(healthNumber,  healthNumber, 10);
    }

    /**
     * Constructor that allows customization of objects of the Creature class
     * 
     * @param health is the amount of health the Creature object will have
     * @param whichPlayer discusses whether the creature belongs to player 1 or player 2
     * @return an object of the Creature class
     */
    public Creature( int health, int whichPlayer )
    {
        //TODO (11): Initialize the healthNumber variable to  the health parameter
        healthNumber = health;
        //TODO (12): Initialize the playerOwnership variable to the whichPlayer parameter
        playerOwnership = whichPlayer;
        //TODO (13): Initialize the creatureBar variable to a new HealthBar object with parameters healthNumber, healthNumber, and 10
        creatureBar = new HealthBar(healthNumber,healthNumber,10);
    }
    
    /**
     * attack is the code that is run when the Creature attacks its enemy
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void attack()
    {
        //empty method that will get overriden in subclasses
    }

    /**
     * act will complete actions that the Creature object should
     * accomplish while the scenario is running
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        //empty method that will get overriden in subclasses
    } 
    
    /**
     * TODO (14): Declare a protected method called getHealthBar that returns a HealthBar object and has no parameters
     * 
     * TODO (15): This method will simply return the creatureBar variable
     */
    protected HealthBar getHealthBar()
    {
        return creatureBar;
    }
    
    /**
     * TODO (16): Declare a public method called getPlayerOwner that returns an integer and has no parameters
     * 
     * TODO (17): This method returns the playerOwnership variable
     */
    public int getPlayerOwner()
    {
        return playerOwnership;
    }
}
