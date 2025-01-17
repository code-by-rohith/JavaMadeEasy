package LibBookSystem;

import Interface.Prey;
import Interface.Rabbit;
import Interface.Tiger;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        rabbit.prey();
        tiger.bitting();
    }
}
