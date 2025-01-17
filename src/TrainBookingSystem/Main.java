package TrainBookingSystem;

import java.util.ArrayList;
import java.util.Scanner;

class Train {
    private int trainNumber;
    private String trainName;
    private int availableSeats;
    private double ticketPrice;

    public Train(int trainNumber, String trainName, int availableSeats, double ticketPrice) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public boolean bookSeats(int seats) {
        if (availableSeats >= seats) {
            availableSeats -= seats;
            return true;
        }
        return false;
    }
    public void displayTrainDetails() {
        System.out.printf("TrainBookingSystem.Train Number: %d | TrainBookingSystem.Train Name: %s | Available Seats: %d | Ticket Price: %.2f\n",
                trainNumber, trainName, availableSeats, ticketPrice);
    }
}

class TicketBookingApp {
    private ArrayList<Train> trainList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public TicketBookingApp() {
        trainList.add(new Train(101, "Express Line", 50, 150.00));
        trainList.add(new Train(102, "City Runner", 30, 100.00));
        trainList.add(new Train(103, "Mountain Pass", 20, 200.00));
    }

    public void displayAvailableTrains() {
        System.out.println("\nAvailable Trains:");
        for (Train train : trainList) {
            train.displayTrainDetails();
        }
    }

    public Train findTrainByNumber(int trainNumber) {
        for (Train train : trainList) {
            if (train.getTrainNumber() == trainNumber) {
                return train;
            }
        }
        return null;
    }
    public void bookTickets() {
        System.out.print("Enter TrainBookingSystem.Train Number: ");
        int trainNumber = scanner.nextInt();
        Train train = findTrainByNumber(trainNumber);

        if (train == null) {
            System.out.println("Invalid TrainBookingSystem.Train Number! Please try again.");
            return;
        }
        System.out.print("Enter Number of Seats to LibBookSystem.Book: ");
        int seats = scanner.nextInt();

        if (train.bookSeats(seats)) {
            System.out.printf("Booking successful! Total Cost: %.2f\n", seats * train.getTicketPrice());
        } else {
            System.out.println("Booking failed! Not enough available seats.");
        }
    }
    public void startApp() {
        while (true) {
            System.out.println("\n--- TrainBookingSystem.Train Ticket Booking System ---");
            System.out.println("1. View Available Trains");
            System.out.println("2. LibBookSystem.Book Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");


            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayAvailableTrains();
                    break;
                case 2:
                    bookTickets();
                    break;
                case 3:
                    System.out.println("Thank you for using the TrainBookingSystem.Train Ticket Booking System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again:");
            }
        }
    }
}
public class Main{
    public static void main(String[] args) {
        TicketBookingApp app = new TicketBookingApp();
        app.startApp();
    }
}
