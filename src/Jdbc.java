import java.util.ArrayList;
import java.util.HashSet;

class Temp {
    public void demo() {

        ArrayList<String> demoo = new ArrayList<>();
        demoo.add("rohan");
        demoo.add("rohan");
        demoo.add("rohan");
        demoo.add("rohan");
        for (int i = 0; i < demoo.size(); i++) {
            System.out.println(demoo.get(i));

        }

        HashSet<Integer> remo = new HashSet<>();
        remo.add(6);
        remo.add(6);
        remo.add(6);
        remo.remove(6);

        System.out.println(remo);

    }
}

public class Jdbc {
    public static void main(String[] args) {

        Temp obj = new Temp();
        obj.demo();

    }
}
