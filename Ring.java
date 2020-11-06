public class Ring extends SolarThing{
    
    private double distance;
    private Planet parentPlanet;
    private double velocity;

    public Ring(double ringDistance, double thickness, String colour, SolarSystem solarSystem, Planet parent, double v)
    {
        super(ringDistance, thickness, colour , solarSystem);

        distance = ringDistance;
        parentPlanet = parent;
        velocity = v;
    }

    public void move()
    {

    }
}