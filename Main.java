public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "White");

        Vet vet = new Vet("Dr. Smith");

        vet.vaccinate(dog);
        System.out.println();
        vet.vaccinate(cat);
    }
}
