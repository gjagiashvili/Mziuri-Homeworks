public class Sum {
    int n;

    Sum(int n) {
        this.n = n;
    }

    int addNumber(int number) {
        if (number == 1) {
            return 1;
        }
        return number + addNumber(number - 1);
    }

    int calculateSum() {
        return addNumber(n);
    }
}