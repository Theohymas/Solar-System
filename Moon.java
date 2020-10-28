public class Moon extends SolarThing{

    private String name;
    private double distance;
    private double angle;
    private Planet parentPlanet;
    private double velocity;

    /**
     * @param moonID The name of the moon.
	 * @param moonDistance The distance of the moon to the planet.
	 * @param diameter The diameter of the moon in the solar system.
	 * @param colour The colour of the moon in the solar system.
	 * @param solarSystem The solar system in which the object exists.
	 */
    public Moon(String moonID, double moonDistance, double diameter, String colour, SolarSystem solarSystem, Planet parent, double v)
    {
        super(moonDistance, parent.getDistance(), diameter, colour, solarSystem);

        name = moonID;
        distance = moonDistance;
        parentPlanet = parent;
        velocity = v;
    }

    public void move()
    {
        angle += velocity;
        solarWorld.drawSolarObjectAbout(distance, angle, diameter, colour, parentPlanet.getDistance(), parentPlanet.getAngle());
    }
}