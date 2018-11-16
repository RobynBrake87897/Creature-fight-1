import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * charmander class extends Creature.
 * 
 * @author (Robyn) 
 * @version (a version number or a date)
 */
public class Charmander extends Creature
{
    /**
     * TODO (18): Create a constructor for Charmander that has a World parameter called world
     * 
     * TODO (19): Use the Creature constructor to initialize the health and ownership of Charmander.
     *            To do this, use the following line: super(700, 1); (super as in "superclass"). This
     *            uses the Creature(int health, int whichPlayer) constructor to set the healthNumber for
     *            Charmander to 700 and the playerOwnership to 1
     * 
     * TODO (20): Next, get the image for this class, and scale it to a width of 150 and a height of 100
     * 
     * TODO (21): Use your World parameter to add an object to the world. You will add Charmander's health bar
     *            by using the getHealthBar() method as the first parameter and adding it at an x location 
     *            of 300 and a y location of the height of the world - 50
     */
    /**
     * Charmander, uses creature constructor to initialize the health and ownership of Charmander. sets size of 
     * Charmander image to be 150 x 100. also adds pik
     * 
     * @param World, which is a constructor for Charmander
     * @return nothing is returned
     */
    public Charmander(World world)
    {
        super(700, 1);
        getImage().scale(150,100);
        world.addObject(getHealthBar(),300, world.getHeight() - 50);
    }
    /**
     * Act - do whatever the Charmander wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param nothing is required
     * @return nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
        
        /**
         * TODO (42): Create a CreatureWorld variable called playerWorld. Initialize it
         *            to a reference to your CreatureWorld. To do this, you must use the getWorld()
         *            method and CAST that result to the CreatureWorld type
         */
        
        //TODO (43): If Charmander's health bar has a current health less than or equal to 0 (you must get the health bar and then get its current value)...
        if(getHealthBar().getCurrent() <= 0)
        {
            //TODO (44): Get the world and use it to show text that says that Charmander has fainted at an x location of getWorld().getWidth()/2 and a y location of getWorld().getHeight()/2 + 26
            getWorld().showText("Charmander has fainted",getWorld().getWidth()/2,getWorld().getHeight()/2 + 26);
            //TODO (45): Delay the scenario by 30 act cycles
            Greenfoot.delay(30);
        }
    }    
}
