public class Product {
    private double price;
    private String expirationDate;


    public Product(double price, String expirationDate) {
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }


    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
