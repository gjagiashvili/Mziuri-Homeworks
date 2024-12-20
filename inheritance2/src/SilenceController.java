public class SilenceController extends Employee {
    private double strictness;

    public SilenceController(String firstName, String lastName, int id, double strictness) {
        super(firstName, lastName, id);
        this.strictness = strictness;
    }

    public double getStrictness() {
        return strictness;
    }

    @Override
    public String toString() {
        return super.toString() + ", სიმკაცრე 10 დან " + strictness;
    }
}


