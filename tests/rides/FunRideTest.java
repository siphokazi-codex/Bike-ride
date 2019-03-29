package rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.FunRide;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.specifications.BicycleSpecification;
import bicycles.specifications.BicycleFromSpec;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void returnNumberOfBikeTypes () {
        Bicycle tandem = new Tandem ();
        Bicycle mountainBike = new MountainBike ();
        Bicycle roadBike = new RoadBike ();

        FunRide funRide = new FunRide(3);
        funRide.addBikes (roadBike);
        funRide.addBikes (mountainBike);
        funRide.addBikes (tandem);

        System.out.println ("Return how many types of Tandem Bike");
        System.out.println (BicycleType.Tandem);
        assertEquals (funRide.getBikeCountType (BicycleType.Tandem), 1);
    }

    @Test
    public void checkIfBikeIsAccepted() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(4, -2, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        FunRide funRide = new FunRide(1);
        assertEquals(funRide.addBikes(roadBike), "Accepted");

        BicycleSpecification mountBikeSpec = new BicycleSpecification(20, -10, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountBikeSpec);
        assertEquals(funRide.addBikes(mountainBike), "Rejected");

        BicycleSpecification tandemSpec = new BicycleSpecification(10, -5, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(tandemSpec);
        assertEquals(funRide.addBikes(tandemBike), "Rejected");
    }

    @Test
    public void returnNumberOfBikes () {
        Bicycle tandem = new Tandem ();
        Bicycle mountainBike = new MountainBike ();
        Bicycle roadBike = new RoadBike ();

        FunRide funRide = new FunRide(9);
        funRide.addBikes (roadBike);
        funRide.addBikes (mountainBike);
        funRide.addBikes (tandem);
        funRide.addBikes (roadBike);
        funRide.addBikes (mountainBike);
        funRide.addBikes (tandem);
        funRide.addBikes (roadBike);
        funRide.addBikes (mountainBike);
        funRide.addBikes (tandem);

        System.out.println ("Return the Number Of Bikes");
        System.out.println (funRide.getNumOfBike ());
        assertEquals (funRide.getNumOfBike (),9);
    }

}
