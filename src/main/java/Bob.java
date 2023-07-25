import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        Scanner scanner = new Scanner(System.in);
        System.out.println("talk to bob: ");
        String userInput = scanner.nextLine();

        switch(userInput) {
            case "?":
                System.out.println("Sure!");
                break;
        }




    }
}
