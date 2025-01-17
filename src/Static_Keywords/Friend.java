package Static_Keywords;

import java.util.ArrayList;


public class Friend {
    static String name ;
    static int count;
    static   ArrayList<String> fun = new ArrayList<>() ;
    Friend(String name ) {
        this.name = name;
        count++;
        fun.add(name);

    }
    static void display(){

        System.out.println("You have "+count);
        System.out.println("Name : "+fun);
    }

}

