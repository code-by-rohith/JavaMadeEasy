package ObjectPassing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the name of the car to be parked : ");
            String data = scanner.nextLine();
            Car car = new Car(data);
            garage.park(car);

        }
    }


}
