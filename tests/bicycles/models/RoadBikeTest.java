package bicycles.models;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RoadBikeTest {
    @Test
    public void shouldAccelerateBike() {

        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        assertEquals(roadBike.currentSpeed(), 44);

    }

    @Test
    public void shouldBrakeBike() {

        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.brake();
        roadBike.accelerate();
        roadBike.brake();
        roadBike.accelerate();
        roadBike.brake();
        roadBike.brake();
        assertEquals(roadBike.currentSpeed(), 17);

    }

    @Test
    public void shouldReturnBikeType() {

        RoadBike roadBike = new RoadBike();
        roadBike.BicycleType();
    }

}
