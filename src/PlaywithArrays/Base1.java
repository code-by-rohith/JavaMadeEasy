package PlaywithArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Base1 {
    public static void main(String[] args) {
        String name[] = {"welcome","Hello world"};
        System.out.println(name);
        ArrayList<String> dat = new ArrayList<>(Arrays.asList(name));
        ArrayList<String> data = new ArrayList<>();
        System.out.println(dat);
        data.add("temp");
        data.add("samp");
        for ( String i :data){
            for (char j : i.toCharArray() ){
                System.out.println(j);
            }

        }
    }
}
