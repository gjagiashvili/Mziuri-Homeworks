import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
        int sum = numbers
                .stream()
                .filter(nums -> nums >= 10)
                .map(nums -> nums * nums)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squared nums: " + sum);

        List<String> words = Arrays.asList("Gio", "Jagiashvili", "Ana", "Jina", "GioJag");
        List<String> filteredWords = words
                .stream()
                .filter(w -> w.startsWith("J"))
                .map(String::toUpperCase)
                .toList();
        System.out.println("New words: " + filteredWords);

        Set<String> sortedWords = words
                .stream()
                .sorted()
                .collect(Collectors.toSet());
        System.out.println("Sorted words: " + sortedWords);

        List<Human> people = Arrays
                .asList(
                new Human("Levan", 20),
                new Human("Gio", 16),
                new Human("Ana", 11),
                new Human("Niko", 12)
        );
        boolean isThereLevan = people.stream()
                .filter(list -> list.age >= 15)
                .map(list -> list.name)
                .collect(Collectors.toSet())
                .contains("Levan");
        System.out.println("Is there Levan? " + isThereLevan);

        List<Integer> nums = Arrays.asList(5, 10, 15, 20, 25, 30);
        List<Integer> sortedNumSmall = nums
                .stream()
                .distinct()
                .sorted()
                .toList();
        int second = sortedNumSmall.size() > 1 ? sortedNumSmall.get(1) : -1;
        System.out.println("Second smallest number: " + second);

        List<Integer> sortedNumBig = nums
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        int secondMax = sortedNumBig.size() > 1 ? sortedNumBig.get(1) : -1;
        System.out.println("Second largest number: " + secondMax);
    }
}
