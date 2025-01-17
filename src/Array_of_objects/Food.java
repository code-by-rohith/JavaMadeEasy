package Array_of_objects;

public class Food {
    public static void main(String[] args) {
       Pizza[] pizza = new Pizza[3];
       Pizza data = new Pizza("humoi");
        Pizza data1 = new Pizza("3r");
        Pizza data2 = new Pizza("tntntg");

        pizza[0] = data;
        pizza[1] = data1;
        pizza[2] = data2;
        System.out.println(pizza[0].name1);


    }
}
