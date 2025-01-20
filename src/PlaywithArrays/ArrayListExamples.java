package PlaywithArrays;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListExamples {
    public static void main(String[] args) {
        // Basic Usage
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // Add elements
        numbers.add(20);
        numbers.set(1, 30);  // Update element
        numbers.remove(1);  // Remove by index
        numbers.remove(Integer.valueOf(10));  // Remove by value
        System.out.println("Contains 10: " + numbers.contains(10));
        System.out.println("Size: " + numbers.size());

        for (int num : numbers)
            System.out.println(num);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));}

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Alice"));
        Collections.sort(names);  // Sort
        Collections.sort(names, Collections.reverseOrder());  // Reverse sort
        names.stream().forEach(System.out::println);  // Stream

        names.add("Dave");
        System.out.println("Sublist: " + names.subList(1, 3));  // Sublist
        names.removeIf(name -> name.startsWith("A"));  // Remove by Predicate
        System.out.println("Cloned List: " + new ArrayList<>(names));  // Clone
        String[] array = names.toArray(new String[0]);  // To Array
        List<String> fromArray = new ArrayList<>(Arrays.asList(array));
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", 25));
        people.sort(Comparator.comparing(Person::getName));  // Custom Sort
        List<Person> filtered = people.stream().filter(p -> p.age > 20).collect(Collectors.toList());

        ArrayList<Map<String, Object>> jsonData = new ArrayList<>();  // JSON-like data
        Map<String, Object> record = new HashMap<>();
        record.put("name", "Example");
        record.put("age", 30);
        jsonData.add(record);
        names.ensureCapacity(50);
        names.trimToSize();  // Trim size
        List<String> syncList = Collections.synchronizedList(names);

        // Batch Processing and Pagination
        int batchSize = 2;
        for (int i = 0; i < names.size(); i += batchSize) {
            List<String> batch = names.subList(i, Math.min(i + batchSize, names.size()));
            System.out.println("Batch: " + batch);
        }

        // Pagination
        int page = 1, size = 2;
        List<String> pageData = names.subList((page - 1) * size, Math.min(page * size, names.size()));
        System.out.println("Page Data: " + pageData);

        // Integration Example
        ArrayList<String> apiResponse = new ArrayList<>(List.of("Item1", "Item2", "Item3"));
        apiResponse.stream().parallel().forEach(System.out::println);
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }
    }
}
