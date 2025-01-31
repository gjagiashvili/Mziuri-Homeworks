public class LongWords {
    static String abbreviate(String word) {
        if (word.length() > 10) {
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            int middleCount = word.length() - 2;
            return first + Integer.toString(middleCount) + last;
        } else {
            return "სიტყვა უზარმაზარი არ არის.";
        }
    }
}