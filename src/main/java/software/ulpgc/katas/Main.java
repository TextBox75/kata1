package software.ulpgc.katas;

public class Main {
    static void main() {
        Rectangle rectangle = new Rectangle(20, 20);
        Rectangle rectangle2 = new Rectangle(-40, 20);

        if (rectangle.area() != 400) {
            System.out.println("Rectangle area is not 400");
            return;
        }
        if (rectangle2.area() != 800) {
            System.out.println("Rectangle area is not 800");
            return;
        }

        System.out.println(rectangle.area());
        System.out.println(rectangle2.area());
    }
}
