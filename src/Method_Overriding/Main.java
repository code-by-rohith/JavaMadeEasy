package Method_Overriding;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();

        Animal dog = new Dog();
        dog.speak();
    }
}
