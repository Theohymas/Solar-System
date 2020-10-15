public class Driver{

    public static void main(String[] args)
    {

        SolarSystem world = new SolarSystem(600, 600);
        world.finishedDrawing();

        for(double i = 0.0; i <=360; i+=1.0)
        {
            world.drawSolarObject(0.0, 0.0, 50.0, "YELLOW");
            world.drawSolarObject(100.0, i, 15.0, "BLUE");
            world.drawSolarObjectAbout(40.0, 90.0 + i, 7.5, "RED", 100.0, i);
            world.finishedDrawing();
            if(i == 360) i = 0;
        }
        
    }
}