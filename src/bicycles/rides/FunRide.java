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

    public String addBikes(Bicycle bicycle){

        if (bikes.size() < maxBikes) {

            bikes.add(bicycle);

            return "Accepted";
        }
        else{

            return "Rejected";
        }
    }

    public int getNumOfBike(){

        return this.bikes.size();
    }

    public int getBikeCountType(BicycleType bike) {
        int getBikeCount = 0;


        for (Bicycle type: bikes) {
            if (type.BicycleType() == bike) {
                getBikeCount += 1;
            }
        }

        return getBikeCount;
    }

}
