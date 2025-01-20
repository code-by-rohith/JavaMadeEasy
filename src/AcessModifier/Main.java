package AcessModifier;


public class Main extends Sub {
    public static void main(String[] args) {

        Main data = new Main();
        System.out.println(data.name);
        System.out.println(data.name1);
        System.out.println(data.name3);
        throw new RuntimeException("Exception message: " + data.name3);


    }
}
