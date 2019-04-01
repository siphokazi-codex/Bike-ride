package bicycles.models;

import org.junit.jupiter.api.Test;
import static bicycles.BicycleType.Tandem;
import static org.junit.Assert.assertEquals;

public class TandemTest {

    @Test
    public void shouldAccelerateBike() {
        Tandem tandemBike = new Tandem();
        tandemBike.accelerate();
        tandemBike.accelerate();
        tandemBike.accelerate();
        tandemBike.accelerate();
        assertEquals(tandemBike.currentSpeed(), 48);
    }

    @Test
    public void shouldBrakeBike() {
        Tandem tandemBike = new Tandem();
        tandemBike.accelerate();
        tandemBike.accelerate();
        tandemBike.brake();
        tandemBike.brake();
        tandemBike.accelerate();
        tandemBike.brake();
        tandemBike.brake();
        assertEquals(tandemBike.currentSpeed(), 8);
    }

    @Test
    public void shouldReturnBikeType() {
        Tandem tandemBike = new Tandem();
        tandemBike.BicycleType();
        assertEquals(tandemBike.BicycleType (), Tandem);
    }
}
