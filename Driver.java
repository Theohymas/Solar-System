public class Driver{

    public static void main(String[] args)
    {
        SolarSystem world = new SolarSystem(600, 600);
        world.finishedDrawing();

        //SolarThing array

        for(double i = 0.0; i <=360; i+=1.0)
        {
            Sun sun1 = new Sun(50.0, "YELLOW", world);
            Planet earth = new Planet("Earth", 100.0, i, 15.0, "BLUE", world);

            world.drawSolarObjectAbout(40.0, 90.0 + i, 7.5, "RED", 100.0, i);
            world.finishedDrawing();

            if(i == 360)
                i = 0;
        }
    }
}