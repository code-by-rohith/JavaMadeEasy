package Sampleworkout;

import java.util.*;

public class Check {

    public static void main(String[] args) {
        int a[] = {1, 9, 6, 6, 5, 656, 523, 269, 5, 653, 5, 65};
        int b[][] = {{1, 2}, {2, 3}};
        Arrays.sort(a);
        Set<Integer> set = new LinkedHashSet<>();
        ArrayList<Integer> ds = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            ds.add(i);
        }
        for (int i = 0; i < ds.size(); i++)
            System.out.println(Arrays.deepToString(b));
        for (int num : a) {
            set.add(num);
        }

        System.out.println(ds);
        int[] uniqueArray = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Sorted Array: " + Arrays.toString(a));
        System.out.println("Unique Array: " + Arrays.toString(uniqueArray));
        int found = Arrays.binarySearch(uniqueArray, 5);
        System.out.println("Index of 5 in unique array: " + found);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit from 1 to (Your choice): ");
        int data = scanner.nextInt();
        for (int i = 1; i <= data; i++) {
            System.out.println(" ");
            for (int j = 1; j <= data; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
        ArrayList<Float> temp = new ArrayList<>();
        for (float i = 10000; i > 1; i /= 2) {
            temp.add(i);
        }
        System.out.println(temp);

        ArrayList<Float> samp = new ArrayList<>();
        samp.add(8909890F);
        samp.addAll(temp);
        System.out.println("After update addall ");
        System.out.println(samp);

        // Use Arrays.asList for Java 8 compatibility
        List<Integer> sampuy = Arrays.asList(3, 4, 5, 2);
        for (int i : sampuy) {
            System.out.println(i);
        }
        System.out.println(sampuy);
        System.out.println(Math.pow(98, Math.random()));
    }
}
