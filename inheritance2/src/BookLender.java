public class BookLender extends Employee {
    private String startWork;
    private String endWork;

    public BookLender(String firstName, String lastName, int id, String shiftStart, String shiftEnd) {
        super(firstName, lastName, id);
        this.startWork = shiftStart;
        this.endWork = shiftEnd;
    }

    public String getStartWork() {
        return startWork;
    }

    public String getEndWork() {
        return endWork;
    }

    @Override
    public String toString() {
        return super.toString() + "იწყებს მუშაობას " + startWork + "-ზე და ამთავრებს " + endWork;
    }
}