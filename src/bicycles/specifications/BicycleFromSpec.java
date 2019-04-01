package bicycles.specifications;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class BicycleFromSpec extends BicycleBase {

    public BicycleSpecification bicycle;
    private BicycleType bicycleType;
    public BicycleFromSpec(BicycleSpecification BicycleType) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        changeSpeed(this.bicycle.getAccelerationSpeed());
    }

    @Override
    public void brake() {
        changeSpeed(this.bicycle.getBrakeSpeed());
    }

    @Override
    public BicycleType BicycleType() {
        return bicycle.getBicycleType();
    }
}
