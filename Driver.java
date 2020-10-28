import java.util.ArrayList;

public class Driver{

    public static void main(String[] args)
    {
        SolarSystem world = new SolarSystem(690, 690);

        Planet mercury = new Planet("Mercury", 38.0, 8.0, "YELLOW", world, 1.0);
        Planet venus = new Planet("Venus", 71.0, 10.0, "PINK", world, 1.7);
        Planet earth = new Planet("Earth", 114.0, 15.0, "BLUE", world, 2.0);
        Planet mars = new Planet("Mars", 157.0, 6.0, "RED", world, 1.0);
        Planet jupiter = new Planet("Jupiter", 200.0, 40.0, "ORANGE", world, 1.5);
        Planet saturn = new Planet("Saturn", 253, 20.0, "GREEN", world, 1.2);
        Planet uranus = new Planet("Uranus", 286, 10.0, "CYAN", world, 3.7);
        Planet neptune = new Planet("Neptune", 319.0, 21.0, "GREY", world, 0.4);

        Moon moon = new Moon("Moon", 15, 4.0, "LIGHT_GREY", world, earth, 3.0);
        Moon europa = new Moon("Europa", 25, 2.0, "LIGHT_GREY", world, jupiter, 1.0);
        Moon lo = new Moon("Lo", 28, 2.0, "LIGHT_GREY", world, jupiter, 1.4);
        Moon callisto = new Moon("Callisto", 31, 2.0, "LIGHT_GREY", world, jupiter, 1.9);
        Moon ganymede = new Moon("Ganymede", 34, 2.0, "LIGHT_GREY", world, jupiter, 1.5);

        Moon uranusMoon = new Moon("Uranus moon", 28, 2.0, "LIGHT_GREY", world, uranus, 1.5);

        Moon neptuneMoon= new Moon("Neptune moon", 20, 4.0, "LIGHT_GREY", world, neptune, 1.5);

        ArrayList<SolarThing> solarList = new ArrayList<SolarThing>();

        solarList.add(mercury);
        solarList.add(venus);
        solarList.add(earth);
        solarList.add(mars);
        solarList.add(jupiter);
        solarList.add(saturn);
        solarList.add(uranus);
        solarList.add(neptune);

        solarList.add(moon);
        solarList.add(europa);
        solarList.add(lo);
        solarList.add(callisto);
        solarList.add(ganymede);

        solarList.add(uranusMoon);

        solarList.add(neptuneMoon);


        while(true)
        {
            Sun sun = new Sun(50.0, "YELLOW", world);
            solarList.add(sun);

            for( SolarThing object: solarList)
            {
                object.move();
            }
            world.finishedDrawing();
        }
    }
}