package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        boolean yesNo;
        do {
            System.out.print("enter the radius of your circle: ");
            double userRadius = input.getDouble();
            Circle circleOne = new Circle(userRadius);
            System.out.println("area of circle: " + circleOne.getArea());
            System.out.println("circumference of circle: " + circleOne.getCircumference());
            input.getString();
            yesNo = input.yesNo();
        } while(yesNo);









    }
}
