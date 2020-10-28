public class Planet extends SolarThing{

    private String name;
    private double angle;
    private double distance;
    private double velocity;

    
    /**
     * @param planetID The name of the planet.
	 * @param planetDistance The distance of the object to the sun.
	 * @param diameter The diameter of the object in the solar system.
	 * @param colour The colour of the object in the solar system.
	 * @param solarSystem The solar system in which the object exists.
	 */
    public Planet(String planetID, double planetDistance, double diameter, String colour, SolarSystem solarSystem, double v)
    {
        super(planetDistance, diameter, colour, solarSystem);

        name = planetID;
        distance = planetDistance;
        velocity = v;
    }

    public void move()
    {
        angle += velocity;
        solarWorld.drawSolarObject(distance, angle, diameter, colour);
    }

    
    /**
     * @return distance The distance of the planet to the sun.
	 */
    public double getDistance()
    {
        return distance;
    }

    
    /**
     * @return angle The angle (in degrees) that represents how far the planet is around its orbit of the sun.
	 */
    public double getAngle()
    {
        return angle;
    }


}