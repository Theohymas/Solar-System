public class SolarThing{

    private double distance;
    private double angle;
    private double diameter;
    private String colour;

    public SolarThing(double orbitDistance, double orbitAngle, double objectDiameter, String col, SolarSystem world)
    {
        distance = orbitDistance;
        angle = orbitAngle;
        diameter = objectDiameter;
        colour = col;

        // world.drawSolarObject(orbitDistance, orbitAngle, objectDiameter, col);
    }
}