public class Planet extends SolarThing{

    private String name;

    public Planet(String planetID, double distance, double angle, double diameter, String colour, SolarSystem solarSystem)
    {
        super(distance, angle, diameter, colour, solarSystem);

        name = planetID;
        solarSystem.drawSolarObject(distance, angle, diameter, colour);
    }
}