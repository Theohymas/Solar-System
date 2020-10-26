public class Moon extends SolarThing{

    private String name;
    private double distance;
    private double angle;
    private Planet parentPlanet;
    private double velocity;

    public Moon(String moonID, double moonDistance,double diameter, String colour, SolarSystem solarSystem, Planet parent, double v)
    {
        super(diameter, colour, solarSystem);

        name = moonID;
        distance = moonDistance;
        parentPlanet = parent;
        velocity = v;

        solarSystem.drawSolarObjectAbout(distance, 0.0, diameter, colour, parent.getDistance(), parent.getAngle());
    }

    public void move()
    {
        angle += velocity;
        solarWorld.drawSolarObjectAbout(distance, angle, diameter, colour, parentPlanet.getDistance(), parentPlanet.getAngle());
    }
}