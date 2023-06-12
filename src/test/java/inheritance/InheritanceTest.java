package inheritance;

import Inheritance.Bicycle;
import Inheritance.MountainBike;
import Inheritance.RoadBike;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceTest {
    RoadBike roadBike = new RoadBike();

    @Test
    public void testBicycle(){
        Bicycle bicycle = new Bicycle();
        assertEquals(  "Riding a bicycle.",bicycle.ride() );


    }
    @Test
    public  void testMountainBike(){
        MountainBike mountainBike = new MountainBike();
        assertEquals("Riding a mountain bike off-road",mountainBike.rideOffRoad());
    }

    @Test
    public void setRoadBike(){
        assertEquals("Riding a road bike on the road",roadBike.rideOnRoad());
    }




}
