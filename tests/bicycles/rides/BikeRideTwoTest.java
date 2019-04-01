package bicycles.rides;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {

    @Test
    public void shouldTakeMountainBikeOnBikeRide() {
        MountainBike bicycle = new MountainBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(), 27);
    }
    @Test
    public void shouldTakeRoadBikeOnBikeRide() {
        RoadBike bicycle = new RoadBike();
        BikeRideTwo bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();
        assertEquals(bikeRide.currentSpeed(), 62);
    }
}
