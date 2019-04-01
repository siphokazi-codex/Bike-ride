package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;


public class MountainBike  extends BicycleBase {
    @Override
    public BicycleType BicycleType() {
        return BicycleType.MountainBike;
    }

    public void accelerate () {
        changeSpeed(5);
    }

    public void brake () {

        changeSpeed(-3);
    }

}
