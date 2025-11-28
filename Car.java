public class Car extends RoadVehicle implements ImportDuty {
    private int passengers;

    public Car(int weight, int passengers) {
        super(4, weight);
        this.passengers = passengers;
    }

    @Override
    public double calculateDuty() {
        return weight * CARTAXRATE;
    }

    public String toString() {
        return "Car weight: " + weight + ", passengers: " + passengers;
    }
}

