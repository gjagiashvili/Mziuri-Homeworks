public class Reindeer extends WorkshopMember {
    private int flyingSpeed;
    private String noseColor;

    public Reindeer(String name, int age, int flyingSpeed, String noseColor) {
        super(name, "Reindeer", age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public String getNoseColor() {
        return noseColor;
    }

    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }

    public void fly() {
        System.out.println(getName() + " დაფრინავს " + flyingSpeed + " კმ/სთ სიჩქარით!");
    }

    public String checkFitnessLevel() {
        int fitnessScore = flyingSpeed - getAge();
        if (fitnessScore >= 25) {
            return "A";
        } else if (fitnessScore >= 20) {
            return "B";
        } else if (fitnessScore >= 15) {
            return "C";
        } else if (fitnessScore >= 10) {
            return "D";
        } else if (fitnessScore >= 5) {
            return "E";
        } else {
            return "F";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Reindeer: დაფრინავს: " + flyingSpeed + " ცხვრიის ფერი:" + noseColor;
    }
    @Override
    public int hashCode() {
        return noseColor.hashCode() + flyingSpeed;
    }
}
