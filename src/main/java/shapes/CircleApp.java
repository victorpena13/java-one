package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        boolean yesNo = true;
        int count = 0;
            do {
                count++;
                    System.out.print("enter the radius of your circle: ");
                    double userRadius = input.getDouble();
                    Shape circleOne = new Circle(userRadius);
                    System.out.println("area of circle: " + circleOne.getArea());
                    System.out.println("circumference of circle: " + circleOne.getPerimeter());
                    System.out.println("circle count: " + count);
                    input.getString();
                    yesNo = input.yesNo();
            } while(yesNo);
    }
}
