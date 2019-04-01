package bicycles.models;

import org.junit.jupiter.api.Test;
import static bicycles.BicycleType.MountainBike;
import static org.junit.Assert.assertEquals;

public class MountainBikeTest {

    @Test
    public void shouldAccelerateBike() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        assertEquals(mountainBike.currentSpeed(), 15);
    }

    @Test
    public void shouldBrakeBike() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.accelerate();
        mountainBike.brake();
        assertEquals(mountainBike.currentSpeed(), 4);
    }

    @Test
    public void shouldReturnBikeType() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.BicycleType();
        assertEquals(mountainBike.BicycleType (), MountainBike);
    }
}
