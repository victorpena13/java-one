import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;

        System.out.printf("the value of pi is approximately %.2f", pi);

        System.out.print("\nenter a integer: ");
        int userInt = scanner.nextInt(); //if input is not an integer will throw an exception


    }
}
