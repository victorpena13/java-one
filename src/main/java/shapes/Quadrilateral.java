package shapes;

public class Quadrilateral extends Shape implements Measurable{
    protected double width;
    protected double length;

    public Quadrilateral(double length, double width) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (this.width*2) + (this.length*2);
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}
