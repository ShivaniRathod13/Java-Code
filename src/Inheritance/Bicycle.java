package Inheritance;
// hierarchical inheritance
public class Bicycle {


        public void ride() {
            System.out.println("Riding a bicycle.");
        }
    }

    class MountainBike extends Bicycle {
        public void rideOffRoad() {
            System.out.println("Riding a mountain bike off-road.");
        }
    }

    class RoadBike extends Bicycle {
        public void rideOnRoad() {
            System.out.println("Riding a road bike on the road.");
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
