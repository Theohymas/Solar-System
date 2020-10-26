public class SolarThing{

    // double distance;
    double diameter;
    String colour;
    // double velocity;
    // private double angle;
    SolarSystem solarWorld;


    public SolarThing(double objectDiameter, String col, SolarSystem world)
    {
        diameter = objectDiameter;
        colour = col;
        // velocity = objectVelolicty;
        solarWorld = world;
    }

    // public void move()
    // {
    //     this.angle += velocity;
    //     solarWorld.drawSolarObject(distance, angle, diameter, colour);
    // }

    public void move()
    {
        System.out.println("move called from SolarThing class");
    }
}