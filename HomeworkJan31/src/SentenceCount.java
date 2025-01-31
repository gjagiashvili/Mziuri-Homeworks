public class SentenceCount {
    static int countSentences(String str) {
        return str.split("[.!?;]").length;
    }
}