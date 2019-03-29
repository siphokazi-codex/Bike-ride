package models;

import bicycles.Bicycle;
import bicycles.BikeRide;
import bicycles.models.MountainBike;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MountainBikeRideTest {

    @Test
    public void ReturnCurrentSpeedForMountainBikeOnNormalRide() {
        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        System.out.println("Current Speed MountainBike On Normal Ride");
        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 14);
    }
    @Test
    public void ReturnCurrentSpeedForMountainBikeOnFastRide() {
        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();

        System.out.println("Current Speed MountainBike On Normal Ride");
        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 27);
    }
    @Test
    public void ReturnCurrentSpeedForMountainBikeOnSlowRide() {
        Bicycle bicycle = new MountainBike();
        BikeRide bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        System.out.println("Current Speed MountainBike On Normal Ride");
        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 14);
    }
}
