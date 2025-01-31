import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ სტრიქონი:");
        String input = scanner.nextLine();
        System.out.println("სტრიქონში ციფრების რაოდენობაა: " + DigitCount.countDigits(input));
        System.out.println("წინადადებების რაოდენობა: " + SentenceCount.countSentences(input));
        System.out.println("სტრიქონი პალინდრომია: " + PalindromeCheck.isPalindrome(input));
        System.out.println(LastLetterCheck.CheckLastLetter(input));

        System.out.println("შეიყვანეთ s1:");
        String s1 = scanner.nextLine();
        System.out.println("შეიყვანეთ s2:");
        String s2 = scanner.nextLine();
        System.out.println("s2 არის s1-ის ქვესტრიქონი: " + StringCheck.isSameString(s1, s2));

        System.out.println("ნიტას სიტყვა:");
        String newWord = scanner.nextLine();
        System.out.println("თავდაპირველი სიტყვა: " + NitaWordGame.restoreOriginal(newWord));

        System.out.println("შეიყვანეთ სიტყვა რომელზეც აბრივიატურა უნდა გამოვიყვანოთ:");
        String longWord = scanner.nextLine();
        System.out.println("სიტყვის აბრევიატურაა: " + LongWords.abbreviate(longWord));
    }
}