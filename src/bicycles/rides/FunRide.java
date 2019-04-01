package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;

public class FunRide {

    private ArrayList<Bicycle> bikes = new ArrayList<>();
    private int maxBikes = 0;
    private BicycleType bicycle;

    public FunRide(int maxBikes) {
        this.maxBikes = maxBikes;
    }

    public void accept(Bicycle bicycle){
        if (!bikes.contains(bicycle) && bikes.size() < maxBikes) {

            bikes.add(bicycle);
        }
        else{

            System.out.println("rejected");
        }
    }

    public int getNumOfBike(){
        return bikes.size();
    }

    public int getCountForType(BicycleType bikeType) {
        int bikeCount = 0;

        for (Bicycle type: bikes) {
            if (type.BicycleType() == bikeType) {
                bikeCount += 1;
            }
        }

        return bikeCount;
    }
}
