package specifications;

import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.RoadBike;
import static org.junit.Assert.assertEquals;

public class RoadBikeSpecTest {
    @Test
    public void shouldReturnAccelerationSpeed() {
        bicycles.specifications.BicycleSpecification roadBikeSpec = new bicycles.specifications.BicycleSpecification(11, -4, RoadBike);

        System.out.println ("RoadBike Acceleration Speed " + roadBikeSpec.getAccelerationSpeed ());
        assertEquals(roadBikeSpec.getAccelerationSpeed (), 11);
    }
    @Test
    public void shouldReturnRoadBikeBrakeSpeed() {
        bicycles.specifications.BicycleSpecification roadBikeSpec = new bicycles.specifications.BicycleSpecification(11, -4, RoadBike);

        System.out.println ("RoadBike Brake Speed " + roadBikeSpec.getBrakeSpeed ());
        assertEquals (roadBikeSpec.getBrakeSpeed (), -4);
    }
    @Test
    public void shouldReturnBicycleTypeForRoadBike() {
        bicycles.specifications.BicycleSpecification roadBikeSpec = new bicycles.specifications.BicycleSpecification(11, -4, RoadBike);

        System.out.println ("Bicycle Type " + roadBikeSpec.getBicycleType ());
        assertEquals (roadBikeSpec.getBicycleType (), RoadBike);
    }
}
