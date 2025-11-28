public class VehicleDriver {
    public static void main(String[] args) {
        Car car = new Car(1200, 4);
        HGV hgv = new HGV(5000, 2000);

        System.out.println(car);
        System.out.println("Import Duty: " + car.calculateDuty() + " euro ");

        System.out.println();

        System.out.println(hgv);
        System.out.println("Import Duty: " + hgv.calculateDuty() + " euro ");
    }
}

