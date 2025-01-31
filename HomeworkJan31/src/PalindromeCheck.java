public class PalindromeCheck {
    static String isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString()) ? "კი" : "არა";
    }
}
