public class LastLetterCheck {
    static String CheckLastLetter(String str) {
        char lastChar = Character.toLowerCase(str.charAt(str.length() - 1));
        return (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u' || lastChar == 'ა' || lastChar == 'ე' || lastChar == 'ი' || lastChar == 'ო' || lastChar == 'უ')  ? "სტრიქონი მთავრდება ხმოვნით" : "სტრიქონი მთავრდება თანხმოვნით";

    }
}