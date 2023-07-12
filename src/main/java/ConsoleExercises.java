import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;

        System.out.printf("the value of pi is approximately %.2f", pi);

        System.out.print("\nenter a integer: ");
        int userInt = scanner.nextInt(); //if input is not an integer will throw an exception

        System.out.print("enter 3 words: ");
        scanner.nextLine();
        String userString = scanner.nextLine();
        /*
       String userWordOne = scanner.next();
       String userWordTwo = scanner.next();
       String userWordThree = scanner.next(); // will only capture first three words and ignore all others. you must enter three words to continue or else stuck in loop.
       System.out.printf("you entered %s %s %s", userWordOne, userWordTwo, userWordThree);
        */
        String[] split = userString.split("//s+");
        for(String word :split) {
            System.out.println(word);
        }

        System.out.println("enter length & width: ");
        String userLength = scanner.nextLine();
        String userWidth = scanner.nextLine();
        int userArea = Integer.parseInt(userLength) * Integer.parseInt(userWidth);
        int userPerimeter = Integer.parseInt(userLength) + Integer.parseInt(userLength) + Integer.parseInt(userWidth) + Integer.parseInt(userWidth);
        System.out.println("area: " + userArea);
        System.out.println("perimeter: " + userPerimeter);

    }
}
