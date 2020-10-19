public class Sun extends SolarThing{

    
    public Sun(double diameter, String colour, SolarSystem solarSystem)
    {
        super(0.0, 0.0, diameter, colour, solarSystem);
        solarSystem.drawSolarObject(0.0, 0.0, diameter, colour);
    }
    
    // /**Used to draw a Sun which may not be located in the centre of the solar system*/
    // public Sun(double distance, double angle, double diameter, String colour, SolarSystem solarSystem)
    // {
    //     super(distance, angle, diameter, colour, solarSystem);
    // }









}