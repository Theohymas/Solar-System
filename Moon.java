public class Moon extends SolarThing{

    private String name;
    private double orbitalDistance;
    private double orbitalAngle;

    public Moon(String moonID, double orbitalDistance, double orbitalAngle, double distance, double angle, double diameter, String colour, SolarSystem solarSystem)
    {
        super(distance, angle, diameter, colour, solarSystem);

        name = moonID;
        orbitalDistance = orbitalDistance;
        orbitalAngle = orbitalAngle;

        solarSystem.drawSolarObjectAbout(orbitalDistance, orbitalAngle, diameter, colour, distance, angle);
        // solarSystem.drawSolarObject(distance, angle, diameter, colour);
    }
}