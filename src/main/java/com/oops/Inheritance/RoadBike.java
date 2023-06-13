package com.oops.Inheritance;

public class RoadBike extends Bicycle {
    public String rideOnRoad() {

        return  "Riding a road bike on the road";
    }

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();

        mountainBike.ride();
        mountainBike.rideOffRoad();

        roadBike.ride();
        roadBike.rideOnRoad();

    }
}
