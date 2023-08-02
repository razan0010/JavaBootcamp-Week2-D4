public class Book extends Product{

    private String author;

    public Book(){}

    public Book(String name, double price, String auther) {
        super(name, price);
        this.author = auther;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        double discount = (bookDiscount * getPrice()) /100;
        double newPrice = getPrice()-discount;
        setPrice(newPrice);
        return newPrice;
    }

    @Override
    public String toString() {
        System.out.println("Product: "+ getName() + "\nPrice: "+ getPrice() + "\nAuthor: "+ author +"\nDiscount amount: "+ bookDiscount + "%\nPrice after discount: " + getDiscount());
        return "";
    }

}
