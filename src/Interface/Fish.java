package Interface;

public class Fish implements  Prey , Predator {
    @Override
    public void bitting() {
        System.out.println("Some of the wish will bite ");
    }

    @Override
    public void prey() {
        System.out.println("some of the fish are preys !! ");

    }
}
