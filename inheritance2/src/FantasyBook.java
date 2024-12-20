

class FantasyBook extends Book {
    private String mythologyCountry;

    public FantasyBook(String title, int pageCount, String author, boolean isHardcover, String mythologyCountry) {
        super(title, pageCount, author, isHardcover);
        this.mythologyCountry = mythologyCountry;
    }

    public String getMythologyCountry() {
        return mythologyCountry;
    }

    @Override
    public String toString() {
        return super.toString() + ", ქვეყანა: " + mythologyCountry;
    }
}
