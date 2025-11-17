public class Vet {
    private String name;

    public Vet(String name) {
        this.name = name;
    }

    public void vaccinate(Animal animal) {
        System.out.println(name + " is vaccinating.");

        if (animal instanceof Dog) {
            System.out.println("Dog has been vaccinated: " + animal.getDetails());
        } else if (animal instanceof Cat) {
            System.out.println("Cat has been vaccinated: " + animal.getDetails());
        } else {
            System.out.println("Unknown animal vaccinated: " + animal.getDetails());
        }
    }
}
