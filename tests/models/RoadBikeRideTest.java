package models;

import bicycles.Bicycle;
import bicycles.BikeRide;
import bicycles.models.RoadBike;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RoadBikeRideTest {
    @Test
    public void ReturnCurrentSpeedForRoadBikeOnNormalRide() {
        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        System.out.println("Current Speed RoadBike On Normal Ride");
        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 36);
    }

    @Test
    public void ReturnCurrentSpeedForRoadBikeOnFastRide() {
        Bicycle bicycle = new RoadBike();
        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();

        System.out.println("Current Speed RoadBike On Normal Ride");
        System.out.println(bikeRide.currentSpeed());
        assertEquals(bicycle.currentSpeed(), 62);
    }
    @Test
    public void ReturnCurrentSpeedForRoadBikeOnSlowRide() {
        Bicycle bicycle = new RoadBike ();
        BikeRide bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        System.out.println("Current Speed RoadBike On Normal Ride");
        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 49);
    }

}
