package bicycles.specifications;

import org.junit.jupiter.api.Test;

import static bicycles.BicycleType.RoadBike;
import static org.junit.Assert.assertEquals;

public class RoadBikeSpecTest {
    @Test
    public void shouldReturnAccelerationSpeed() {
        bicycles.specifications.BicycleSpecification roadBikeSpec = new bicycles.specifications.BicycleSpecification(11, -4, RoadBike);

        assertEquals(roadBikeSpec.getAccelerationSpeed (), 11);
    }
    @Test
    public void shouldReturnRoadBikeBrakeSpeed() {
        bicycles.specifications.BicycleSpecification roadBikeSpec = new bicycles.specifications.BicycleSpecification(11, -4, RoadBike);

        assertEquals (roadBikeSpec.getBrakeSpeed (), -4);
    }
    @Test
    public void shouldReturnBicycleTypeForRoadBike() {
        bicycles.specifications.BicycleSpecification roadBikeSpec = new bicycles.specifications.BicycleSpecification(11, -4, RoadBike);

        assertEquals (roadBikeSpec.getBicycleType (), RoadBike);
    }
}
