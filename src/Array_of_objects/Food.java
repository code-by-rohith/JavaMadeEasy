package Array_of_objects;

public class Food {
    public static void main(String[] args) {
       Pizza[] pizza ;
       Pizza data = new Pizza("humoi");
        Pizza data1 = new Pizza("3r");
        Pizza data2 = new Pizza("tntntg");
        pizza = new Pizza[]{data, data1, data2};
        System.out.println(pizza[1].name1);


    }
}
