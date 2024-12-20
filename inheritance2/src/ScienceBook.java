class ScienceBook extends Book {
    private String scienceField;

    public ScienceBook(String title, int pageCount, String author, boolean isHardcover, String scienceField) {
        super(title, pageCount, author, isHardcover);
        this.scienceField = scienceField;
    }

    public String getScienceField() {
        return scienceField;
    }

    @Override
    public String toString() {
        return super.toString() + ", მეცნიერება: " + scienceField;
    }
}