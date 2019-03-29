package models;

import bicycles.Bicycle;
import bicycles.BikeRide;
import bicycles.models.Tandem;
import bicycles.rides.BikeRideOne;
import bicycles.rides.BikeRideThree;
import bicycles.rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TandemTest {

    @Test
    public void ReturnCurrentSpeedForTandemsOnNormalRide() {
        Bicycle bicycle = new Tandem();
        BikeRide bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        System.out.println("Current Speed Tandems On Normal Ride");
        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 34);
    }
    @Test
    public void ReturnCurrentSpeedForTandemsOnFastRide() {
        Bicycle bicycle = new Tandem();
        BikeRide bikeRide = new BikeRideTwo(bicycle);
        bikeRide.ride();

        System.out.println("Current Speed Tandems On Fast Ride");
        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 65);
    }
    @Test
    public void ReturnCurrentSpeedForTandemsOnSlowRide() {
        Bicycle bicycle = new Tandem();
        BikeRide bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();

        System.out.println("Current Speed Tandems On Slow Ride");
        System.out.println(bikeRide.currentSpeed());
        assertEquals(bikeRide.currentSpeed(), 35);
    }
}
