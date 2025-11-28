public class HGV extends RoadVehicle implements ImportDuty {
    private int load;

    public HGV(int weight, int load) {
        super(6, weight);
        this.load = load;
    }

    
    public double calculateDuty() {
        return weight * HGVTAXRATE;
    }

    public String toString() {
        return "HGV weight:" + weight + ", load: " + load;
    }
}
