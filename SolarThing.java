abstract  class SolarThing{

    double diameter;
    String colour;
    SolarSystem solarWorld;

	/**
	 * @param distance The distance of the object to the sun.
	 * @param objectDiameter The diameter of the object in the solar system.
	 * @param col The colour of the object in the solar system.
	 * @param world The solar system in which the object exists.
	 */
    public SolarThing(double distance, double objectDiameter, String col, SolarSystem world)
    {
        diameter = objectDiameter;
        colour = col;
        solarWorld = world;

        world.drawSolarObject(distance, 0.0, diameter, colour);
    }

    /**
     * @param moonDistance the distance of the object to its planet.
	 * @param planetDistance The distance of the object to the sun.
	 * @param objectDiameter The diameter of the object in the solar system.
	 * @param col the colour of the object in the solar system.
	 * @param world the solar system in which the object exists.
	 */
    public SolarThing(double moonDistance, double planetDistance, double objectDiameter, String col, SolarSystem world)
    {
        diameter = objectDiameter;
        colour = col;
        solarWorld = world;

        world.drawSolarObjectAbout(moonDistance, 0.0, diameter, colour, planetDistance, 0.0);
    }

    abstract protected void move();
}