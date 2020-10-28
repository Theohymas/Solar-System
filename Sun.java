public class Sun extends SolarThing{

    private double angle = 0.0;
    private double distance = 0.0;

        
    /**
     * @param diameter The diameter of the object in the solar system.
	 * @param colour The colour of the object in the solar system.
	 * @param solarSystem The solar system in which the object exists.
	 */
    public Sun(double diameter, String colour, SolarSystem solarSystem)
    {
        super(0.0, diameter, colour, solarSystem);
    }

    public void move()
    {
        angle = angle;
    }
}