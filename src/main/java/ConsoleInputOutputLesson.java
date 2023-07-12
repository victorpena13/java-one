import java.util.Scanner;

public class ConsoleInputOutputLesson {

    public static void main(String[] args) {
        String name = "victor";
        System.out.printf("hello there, %s. Nice to see you", name);

        String greeting = "Salutations";

        System.out.printf("%s, %s!", greeting, name);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nenter something: ");
        //scanner.next() - only captures first word.
        //scanner.nextLine() - captures sentences.
        String userInput = scanner.next();

        System.out.println("you entered --> \"" + userInput + "\" <--");


    }
}
