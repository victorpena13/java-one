package shapes;

public class ShapeTest {

    public static void main(String[] args) {

        Shape square1 = new Square(4);
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());

        Shape rectangle1 = new Rectangle(4,2);
        System.out.println();
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

        Shape circle1 = new Circle(4);
        circle1.getArea();
        circle1.getPerimeter();

    }
}
