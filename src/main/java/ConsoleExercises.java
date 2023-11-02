import util.Input;

import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.printf("the value of pi is approximately %2.4s\n", pi);
        System.out.printf("the value of pi is approximately %.2f\n", pi);

        System.out.print("enter a integer and i will store that value: ");
        int userInt = scanner.nextInt();

        System.out.println("you entered: " + userInt); // throws an exception error if anything but a number is entered

        System.out.print("enter 3 words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.printf("%s %s %s\n", thirdWord, secondWord, firstWord);
        // three words must be entered or you will not be able to continue.
        scanner.nextLine(); // this line is necessary to grab the users next input.
        System.out.print("\nenter your original statement: ");
        String fullStatement = scanner.nextLine();

        System.out.println(fullStatement);

        System.out.print("first enter width and then length: ");
        String userWidth = scanner.next();
        String userLength = scanner.next();
        int parsedWidth = Integer.parseInt(userWidth);
        int parsedLength = Integer.parseInt(userLength);
        int userArea = parsedWidth * parsedLength;
        int userPerimeter = (parsedWidth*2) + (parsedLength * 2);

        System.out.println("area: " + userArea);
        System.out.println("perimeter: " + userPerimeter);













    }


}
