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


//        String userWordOne = scanner.next();
//        String userWordTwo = scanner.next();
//        String userWordThree = scanner.next(); // will only capture first three words and ignore all others. you must enter three words to continue or else stuck in loop.
//        System.out.printf("you entered %s %s %s", userWordOne, userWordTwo, userWordThree);
        String[] splited = userString.split("//s+");
        for(String word :splited) {
            System.out.println(word);
        }



    }
}
