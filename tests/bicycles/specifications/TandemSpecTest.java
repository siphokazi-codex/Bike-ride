package bicycles.specifications;

import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.Tandem;
import static org.junit.Assert.assertEquals;

public class TandemSpecTest {

    @Test
    public void ShouldReturnBrakeSpeedForTandem() {
        bicycles.specifications.BicycleSpecification tandemSpec = new bicycles.specifications.BicycleSpecification(12, -7, Tandem);

        assertEquals (tandemSpec.getBrakeSpeed (), -7);
    }

    @Test
    public void ShouldReturnAccelerationSpeedForTandem() {
        bicycles.specifications.BicycleSpecification tandemSpec = new bicycles.specifications.BicycleSpecification(12, -7, Tandem);

        assertEquals (tandemSpec.getAccelerationSpeed (), 12);
    }

    @Test
    public void ShouldReturnBicycleType() {
        bicycles.specifications.BicycleSpecification tandemSpec = new bicycles.specifications.BicycleSpecification(12, -7, Tandem);

        assertEquals (tandemSpec.getBicycleType (), Tandem);
    }
}
