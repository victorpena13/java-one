package shapes;

public class Ellipse extends Shape implements Measurable{
    protected double radius;
    public Ellipse(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI*(Math.pow(this.radius, 2));    }
}
