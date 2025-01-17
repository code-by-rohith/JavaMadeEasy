package LibBookSystem;

import Interface.Fish;
import Interface.Rabbit;
import Interface.Tiger;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        Fish fish = new Fish();
        fish.bitting();
        fish.prey();
        rabbit.prey();
        tiger.bitting();

    }
}
