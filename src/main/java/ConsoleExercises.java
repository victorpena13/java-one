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

        System.out.println("you entered: " + userInt);






    }


}
