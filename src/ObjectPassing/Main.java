package ObjectPassing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car = new Car("tesla");
        Car car1 = new Car("Bmw");

        garage.park(car);
        garage.park(car1);
    }


}
