public class Elf extends WorkshopMember implements ChristmasCelebrator {
    private int skillLevel;
    private String elfType;

    public Elf(String name, String nickName, int age, int skillLevel, String elfType) {
        super(name, nickName, age);
        this.skillLevel = skillLevel;
        this.elfType = elfType;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getElfType() {
        return elfType;
    }

    public void setElfType(String elfType) {
        this.elfType = elfType;
    }

    public void makeToy() {
        System.out.println(getNickName() + " აკეთებს სათამაშოს");
        increaseExperience();
    }

    public void wrapGifts() {
        System.out.println(getNickName() + " ფუთავს საჩუქრებს");
        increaseExperience();
    }

    private void increaseExperience() {
        skillLevel++;
    }

    @Override
    public void celebrateChristmas() {
        System.out.println(getNickName() + " აღნიშნავს შობას");
    }

    @Override
    public void hostChristmasParty() {
        System.out.println(getNickName() + " აქვს საახალწლო წვეულება");
    }

    @Override
    public String toString() {
        return super.toString() + "ელფი: Skill Level:" + skillLevel + " ელფის ტიპი: " + elfType;
    }
}
