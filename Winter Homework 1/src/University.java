public class University {
    private boolean UniversityStatus;
    private String UniversityName;
    private int MajorAmount;

    public University(boolean universityStatus, String universityName, int majorAmount) {
        this.UniversityStatus = universityStatus;
        this.UniversityName = universityName;
        this.MajorAmount = majorAmount;
    }

    public void printUniversityInfo() {
        System.out.println("სტატუსი: " + (UniversityStatus ? "საჯარო" : "კერძო"));
        System.out.println("უნივერსიტეტის სახელი: " + UniversityName);
        System.out.println("ფაკულტერის რაოდენობა: " + MajorAmount);
    }

    public boolean isUniversityStatus() {
        return UniversityStatus;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public int getMajorAmount() {
        return MajorAmount;
    }

    class Student {

        private String name;
        private String lastName;
        private int age;
        private String personalId;
        private double averageGrade;
        private int course;

        public Student(String name, String lastName, int age, String personalId, double averageGrade, int course) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.personalId = personalId;
            this.averageGrade = averageGrade;
            this.course = course;
        }

        public void printStudentInfo() {
            System.out.println("მოსწავლის სახელი და გვარი: " + name + " " + lastName);
            System.out.println("ასაკი: " + age);
            System.out.println("პირადი ნომერი: " + personalId);
            System.out.println("საშუალო ნიშანი: " + averageGrade);
            System.out.println("კურსი: " + course);

        }

    }
}
