
public class Main {
    public static void main(String[] args) {

        Book b1 =new Book("Alice in Wonderland", 70, "Lewis Carroll");
        b1.toString();
        System.out.println("------------------------------");
        Book b2 =new Book("Heidi", 85, "Johanna Spyri");
        b2.toString();
        System.out.println("------------------------------");
        Movie m1 =new Movie("Toy Story 3", 90, "Lee Unkrich");
        m1.toString();
        System.out.println("------------------------------");
        Movie m2 =new Movie("Mulan", 100, "Tony Banroft");
        m2.toString();
    }
}