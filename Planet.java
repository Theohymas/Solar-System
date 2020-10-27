public class Planet extends SolarThing{

    private String name;
    private double angle;
    private double distance;
    private double velocity;

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

    public double getDistance()
    {
        return this.distance;
    }

    public double getAngle()
    {
        return this.angle;
    }
}