public class Movie extends Product{

    private String director;


    public Movie(){};

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        double discount = (movieDiscount * getPrice()) /100;
        double newPrice = getPrice()-discount;
        setPrice(newPrice);
        return newPrice;
    }

    @Override
    public String toString() {
        System.out.println("Product: "+ getName() + "\nPrice: "+ getPrice() + "\nDirector: "+ director +"\nDiscount amount: "+ movieDiscount + "%\nPrice after discount: " + getDiscount());
        return "";
    }
}
