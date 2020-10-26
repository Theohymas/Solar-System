public class Driver{

    public static void main(String[] args)
    {
        SolarSystem world = new SolarSystem(600, 600);

        SolarThing[] solarArray = new SolarThing[9];

        Planet mercury = new Planet("Mercury", 50.0, 5.0, "ORANGE", world, 1.0);
        Planet venus = new Planet("Venus", 80.0, 7.0, "ORANGE", world, 1.7);
        Planet earth = new Planet("Earth", 105.5, 15.0, "BLUE", world, 2.0);
        Planet mars = new Planet("Mars", 120.0, 6.0, "RED", world, 1.0);
        Planet jupiter = new Planet("Jupiter", 140.0, 40.0, "ORANGE", world, 1.5);
        Planet saturn = new Planet("Saturn", 170.0, 20.0, "GREY", world, 4.0);
        Planet uranus = new Planet("Uranus", 192.0, 10.0, "BLUE", world, 4.2);
        Planet neptune = new Planet("Neptune", 280.0, 21.0, "GREY", world, 3.0);

        Moon moon = new Moon("Moon", 40.0, 7.5, "RED", world, earth, 3.0);

        solarArray[0] = mercury;
        solarArray[1] = venus;
        solarArray[2] = earth;
        solarArray[3] = mars;
        solarArray[4] = jupiter;
        solarArray[5] = saturn;
        solarArray[6] = uranus;
        solarArray[7] = neptune;

        solarArray[8] = moon;



        while(true)
        {
            Sun sun1 = new Sun(50.0, "YELLOW", world);

            for( SolarThing object: solarArray)
            {
                object.move();
            }
            world.finishedDrawing();
        }
    }
}