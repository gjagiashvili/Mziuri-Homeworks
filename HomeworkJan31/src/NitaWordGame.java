public class NitaWordGame  {
    static String restoreOriginal(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}