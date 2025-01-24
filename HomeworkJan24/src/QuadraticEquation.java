public class QuadraticEquation {
    private double a, b, c;
    private Double x1, x2; //რადგან შეიძლება არ ქონდეს ამონახსნი ანუ null იყოს

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        solveEquation();
    }

    private void solveEquation() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            x1 = x2 = -b / (2 * a);
        } else {
            x1 = x2 = null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        QuadraticEquation other = (QuadraticEquation) obj;
        return (((x1 == null && other.x1 == null) || (x1 != null && x1.equals(other.x1))) &&
                ((x2 == null && other.x2 == null) || (x2 != null && x2.equals(other.x2)))) ||
                (((x1 != null && x2 != null && other.x1 != null && other.x2 != null) &&
                        (x1.equals(other.x2) && x2.equals(other.x1))));
    }

    @Override
    public int hashCode() {
        return (x1 != null ? x1.hashCode() : 0) + (x2 != null ? x2.hashCode() : 0);
    }

    @Override
    public String toString() {
        return "განტოლება: " + a + "x² + " + b + "x + " + c + " | ამონახსნებია: " + (x1 != null ? x1 + ", " + x2 : "არ აქვს ამონახსნი");
    }

    public static int countEquivalentEquations(QuadraticEquation[] equations) {
        int count = 0;
        for (int i = 0; i < equations.length; i++) {
            for (int j = i + 1; j < equations.length; j++) {
                if (equations[i].equals(equations[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}
