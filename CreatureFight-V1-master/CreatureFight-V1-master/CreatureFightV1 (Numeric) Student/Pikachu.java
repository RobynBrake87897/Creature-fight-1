import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class Pikachu extends Creature.
 * 
 * @author (Robyn(ramen)) 
 * @version (a version number or a date)
 */
public class Pikachu extends Creature
{
    /**
     * TODO (22): Create a constructor for Pikachu that has a World parameter called world
     * 
     * TODO (23): Use the Creature constructor to initialize the health and ownership of Pikachu.
     *            Initialize the healthNumber to 650 and the playerOwnership to 2. Use Charmander
     *            for help if you need.
     * 
     * TODO (24): Next, get the image for this class, and scale it to a width of 150 and a height of 100
     * 
     * TODO (25): Use your World parameter to add an object to the world. You will add Pikachu's health bar
     *            by using the getHealthBar() method as the first parameter and adding it at an x location 
     *            of 100 and a y location of 25
     */
    /**
     * Pikachu, uses creature constructor to initialize the health and ownership of Pikachu. sets size of 
     * Pikachu image to be 150 x 100. also adds pik
     * 
     * @param, World
     * @return nothing is returned
     */
    public Pikachu(World world)
    {
        super(650,2);
        getImage().scale(150,100);
        world.addObject(getHealthBar(),100,25);
    }
    /**
     * Act - do whatever the Pikachu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     * @param nothing is required
     * @return nothing is returned
     */
    public void act() 
    {
        
        /**
         * TODO (46): Create a CreatureWorld variable called playerWorld. Initialize it
         *            to a reference to your CreatureWorld. Use Charmander as a reference if needed
         */
        CreatureWorld playerWorld = (CreatureWorld)getWorld();
        //TODO (47): If Pikachu's health bar has a current health less than or equal to 0 (you must get the health bar and then get its current value)...
        if(getHealthBar().getCurrent() <= 0)
        {
            //TODO (48): Get the world and use it to show text that says that Pikachu has fainted at an x location of getWorld().getWidth()/2 and a y location of getWorld().getHeight()/2 + 26
            getWorld().showText("Pikachu has fainted",getWorld().getWidth()/2,getWorld().getHeight()/2 + 26);
            //TODO (49): Delay the scenario by 30 act cycles
            Greenfoot.delay(30);
        }
    }    
}
