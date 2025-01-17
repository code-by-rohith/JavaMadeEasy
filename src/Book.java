import java.util.ArrayList;
import java.util.Scanner;

class Bks {
    private String bookname;
    private Integer booknumber;
    private Integer available;

    public Bks(String bookname, Integer booknumber, Integer available) {
        this.bookname = bookname;
        this.booknumber = booknumber;
        this.available = available;
    }

    public String getBookname() {
        return bookname;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public void show_books() {
        System.out.printf("| Book Name : %-20s | Book Number : %-12d | Available : %-9d |\n", bookname, booknumber, available);
    }
}

class Samp {

    ArrayList<Bks> dss = new ArrayList<>();

    public Samp() {
        dss.add(new Bks("Book A", 6464, 2));
        dss.add(new Bks("Book B", 6889, 6));
        dss.add(new Bks("Book C", 81, 16));
        dss.add(new Bks("Book D", 1255, 5));
        dss.add(new Bks("Book E", 648, 2));
        dss.add(new Bks("Book F", 64, 0));
    }

    public void get_books() {
        System.out.println("--------------------------------------View Books-----------------------------------------------");
        for (Bks data : dss) {
            data.show_books();
        }
    }

    public void order_book() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book name you want to order: ");
        String bookName = scanner.nextLine();

        boolean found = false;
        for (Bks data : dss) {
            if (data.getBookname().equalsIgnoreCase(bookName)) {
                found = true;
                if (data.getAvailable() > 0) {
                    data.setAvailable(data.getAvailable() - 1);
                    System.out.println("Book ordered successfully! Remaining available copies: " + data.getAvailable());
                } else {
                    System.out.println("Sorry, the book is not available.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found in the library.");
        }
    }

    public void star_app() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            System.out.println("");
            System.out.println("|---------Library Management---------|");
            System.out.println("|-----------1.View Books-------------|");
            System.out.println("|-----------2.Order Books------------|");
            System.out.println("|--------------4.Quit----------------|");
            System.out.println("Enter your choice  : ");
            String check = scanner.nextLine();
            switch (check) {
                case "1":
                    get_books();
                    break;
                case "2":
                    order_book();
                    break;
                case "4":
                    System.out.println("Thank you for using. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class Book {
    public static void main(String[] args) {
        Samp obj = new Samp();
        obj.star_app();
    }
}
