
package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class RoadBike  extends BicycleBase {

    @Override
    public BicycleType BicycleType() {
        return BicycleType.RoadBike;
    }

    public void accelerate () {
        changeSpeed(11);
    }

    public void brake () {
        changeSpeed(-4);
    }

}
