public class Sun extends SolarThing{

    private double angle = 0.0;
    private double distance = 0.0;

    public Sun(double diameter, String colour, SolarSystem solarSystem)
    {
        super(0.0, diameter, colour, solarSystem);
        solarSystem.drawSolarObject(distance, angle, diameter, colour);
    }
}