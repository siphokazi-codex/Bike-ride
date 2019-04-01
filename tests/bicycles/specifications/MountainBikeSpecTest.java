package bicycles.specifications;

import org.junit.jupiter.api.Test;
import static bicycles.BicycleType.MountainBike;
import static org.junit.Assert.assertEquals;

public class MountainBikeSpecTest {

    @Test
    public void ShouldReturnMountainBikeAccelerationSpeed () {
        bicycles.specifications.BicycleSpecification mountainBikeSpec = new bicycles.specifications.BicycleSpecification(5, -3, MountainBike);
        assertEquals(mountainBikeSpec.getAccelerationSpeed (), 5);
    }
    @Test
    public void ShouldReturnMountainBikeBrakeSpeed () {
        bicycles.specifications.BicycleSpecification mountainBikeSpec = new bicycles.specifications.BicycleSpecification(5, -3, MountainBike);
        assertEquals(mountainBikeSpec.getBrakeSpeed (), -3);
    }
    @Test
    public void ShouldReturnBicycleTypeForMountainBike () {
        bicycles.specifications.BicycleSpecification mountainBikeSpec = new bicycles.specifications.BicycleSpecification(5, -3, MountainBike);
        assertEquals(mountainBikeSpec.getBicycleType (),MountainBike);
    }
}
