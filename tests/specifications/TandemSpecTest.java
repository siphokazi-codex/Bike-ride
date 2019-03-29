package specifications;

import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.Tandem;
import static org.junit.Assert.assertEquals;

public class TandemSpecTest {

    @Test
    public void ShouldReturnBrakeSpeedForTandem() {
        bicycles.specifications.BicycleSpecification tandemSpec = new bicycles.specifications.BicycleSpecification(12, -7, Tandem);

        System.out.println ("Tandem Brake Speed " + tandemSpec.getBrakeSpeed ());
        assertEquals (tandemSpec.getBrakeSpeed (), -7);
    }

    @Test
    public void ShouldReturnAccelerationSpeedForTandem() {
        bicycles.specifications.BicycleSpecification tandemSpec = new bicycles.specifications.BicycleSpecification(12, -7, Tandem);

        System.out.println ("Tandem Acceleration Speed " + tandemSpec.getAccelerationSpeed ());
        assertEquals (tandemSpec.getAccelerationSpeed (), 12);
    }

    @Test
    public void ShouldReturnBicycleType() {
        bicycles.specifications.BicycleSpecification tandemSpec = new bicycles.specifications.BicycleSpecification(12, -7, Tandem);

        System.out.println ("Bicycle Type " + tandemSpec.getBicycleType ());
        assertEquals (tandemSpec.getBicycleType (), Tandem);
    }
}
