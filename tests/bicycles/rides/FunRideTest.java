package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.specifications.BicycleSpecification;
import bicycles.specifications.BicycleFromSpec;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void checkIfBikeIsAccepted() {
        RoadBike roadBikeOne = new RoadBike ();
        RoadBike roadBikeTwo = new RoadBike ();
        MountainBike mountainBikeOne = new MountainBike ();
        Tandem tandemOne = new Tandem ();

        FunRide funRide = new FunRide(4);
        funRide.accept (roadBikeOne);
        funRide.accept (roadBikeTwo);
        funRide.accept (mountainBikeOne);
        funRide.accept (mountainBikeOne);
        funRide.accept (tandemOne);
        funRide.accept (tandemOne);
        assertEquals (funRide.getNumOfBike(), 4);
    }

    @Test
    public void returnNumberOfBikes () {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBikeOne = new BicycleFromSpec(roadBikeSpec);
        Bicycle roadBikeTwo = new BicycleFromSpec(roadBikeSpec);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBikeOne = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mountainBikeTwo = new BicycleFromSpec(mountainBikeSpec);

        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);

        FunRide funRide = new FunRide(5);
        funRide.accept(mountainBikeOne);
        funRide.accept(mountainBikeTwo);
        funRide.accept(roadBikeOne);
        funRide.accept(roadBikeTwo);
        funRide.accept(tandemBike);
        assertEquals(funRide.getNumOfBike(), 5);
    }

    @Test
    public void returnNumberOfBikeTypes () {
        Bicycle tandem = new Tandem ();
        Bicycle mountainBike = new MountainBike ();
        Bicycle roadBike = new RoadBike ();

        FunRide funRide = new FunRide(9);
        funRide.accept (roadBike);
        funRide.accept (mountainBike);
        funRide.accept (tandem);
        assertEquals (funRide.getCountForType (BicycleType.Tandem), 1);
    }

}
