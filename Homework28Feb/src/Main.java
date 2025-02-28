import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        while (true) {
            int num = random.nextInt(51);
            numbers.add(num);
            if (num == 40)
                break;
        }

        System.out.println("List size: " + numbers.size());
        printList(numbers);

        numbers.removeIf(n -> n % 2 == 0);
        printList(numbers);

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(51);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);
        }
        int maxIndex = findMaxIndex(arrayList);
        System.out.println("Max index: " + maxIndex);


        Library library = new Library();
        library.populateList("books.txt");

        while (true) {
            System.out.println("Do you want to add a book? (yes or no)");
            String response = scanner.nextLine();
            if (!response.equals("yes")) {
                break;
            }
            System.out.println("Enter book name:");
            String name = scanner.nextLine();
            System.out.println("Enter number of pages:");
            int pages = scanner.nextInt();
            scanner.nextLine();
            library.addBook(new Book(name, pages));
        }
        System.out.println("Your Books:");
        library.printBooks();
    }

    public static void printList(List<Integer> list) {
        System.out.print("List Numbers { ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }

    public static int findMaxIndex(ArrayList<Integer> list) {
        int maxIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
