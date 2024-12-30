import java.util.ArrayList;
import java.util.List;

public class ListsUsageExample {

    public static void countOccurance(List<String> words, String target){
        System.out.println(words);
        int counter = 0;
        for(int i = 0; i < words.toArray().length; i++){
            if(target.equals(words.get(i))){
                counter++;
            }
        }
        System.out.println("words " + target + " were counted " + counter + " times");
    }

    public static void toList(int[] array){
        List <Integer> numbers = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            numbers.add(array[i]);
        }

        System.out.print("Array: ");
        for(Object i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("List: " + numbers);
    }

    public static List<Integer> findUnique(List<Integer> numbers){
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.toArray().length; i++) {
            if(!uniqueNumbers.contains(numbers.get(i))){
                uniqueNumbers.add(numbers.get(i));
            }
        }
        return uniqueNumbers;
    }

    public static void calcOccurance(List<String> words){
        List<String> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i < words.toArray().length; i++) {
            if(!uniqueNumbers.contains(words.get(i))){
                uniqueNumbers.add(words.get(i));
            }
        }
        for (int i = 0; i < uniqueNumbers.toArray().length; i++) {
            int counter = 0;
            for (int j = 0; j < words.toArray().length; j++) {
                if(uniqueNumbers.get(i).contains(words.get(j))){
                    counter++;
                }
            }
            System.out.println(uniqueNumbers.get(i) + ": " + counter);
        }
    }
}
