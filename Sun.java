public class Sun extends SolarThing{

    private double angle = 0.0;
    private double distance = 0.0;

    public Sun(double diameter, String colour, SolarSystem solarSystem)
    {
        super(diameter, colour, solarSystem);
        solarSystem.drawSolarObject(distance, angle, diameter, colour);
    }
}