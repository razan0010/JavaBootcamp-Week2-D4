public abstract class Product {

    private String name;
    private double price;
    final int bookDiscount = 10;
    final int movieDiscount = 15;

    public Product(){};

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getDiscount();

    public abstract String toString();
}
