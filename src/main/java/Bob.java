import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.

       do {
           System.out.println("talk to bob: ");
           Scanner scanner = new Scanner(System.in);
           String userInput = scanner.nextLine();
           if (userInput.endsWith("?")) {
               System.out.println("sure");
           } else if (userInput.endsWith("!")) {
               System.out.println("whoa, chill out");
           } else if (userInput.startsWith("") & userInput.endsWith("")) {
               System.out.println("fine, be that way");
           } else if (userInput.equalsIgnoreCase("exit")) {
               return;
           } else {
               System.out.println("whatever");
           }
       } while (true);

    }
}
