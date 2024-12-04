public class KNumberSum {
    int a, b, k;

    KNumberSum(int a, int b, int k) {
        this.a = a;
        this.b = b;
        this.k = k;
    }

    int sumCalculator(int current) {
        if (current > b) {
            return 0;
        }
        if (current % k == 0) {
            return current + sumCalculator(current + k);
        }
        return sumCalculator(current + 1);
    }

    int calculateSum() {
        return sumCalculator(a);
    }
}
