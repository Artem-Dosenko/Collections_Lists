import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Orange", "Apple", "Banana", "Banana", "Orange", "Banana", "Apple", "Orange", "Orange");
        ListsUsageExample.countOccurance(fruits, "Apple");

        int[] array = {5, 4, 3, 2, 1};
        ListsUsageExample.toList(array);

        List<Integer> numbers = List.of(1, 1, 2, 3, 5, 5, 6, 3);
        System.out.println(numbers);
        List<Integer> changedNumbers = ListsUsageExample.findUnique(numbers);
        System.out.println(changedNumbers);

        List<String> animals = List.of("Cat", "Bird", "Bird", "Fox", "Cat", "Fox", "Fox", "Cat", "Bird", "Fox");
        ListsUsageExample.calcOccurance(animals);
    }
}
