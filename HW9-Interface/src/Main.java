
public class Main {
    public static void main(String[] args) {

        MovablePoint m1 = new MovablePoint(1, 2, 2 , 2);
        m1.toString();
        m1.moveUp();
        m1.moveDown();
        m1.moveLeft();
        m1.moveRight();
        System.out.println("-------------------");
        MovablePoint m2 = new MovablePoint(1, 1, 5 , 5);
        m2.toString();
        m2.moveUp();
        m2.moveDown();
        m2.moveLeft();
        m2.moveRight();
    }
}