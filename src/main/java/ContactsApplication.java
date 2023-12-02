import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class ContactsApplication {

    public static void addContact(String firstName, String lastName, String phoneNumber) throws IOException {

        Files.write(
                Paths.get("data", "contacts.txt"),
                Arrays.asList(firstName + " " + lastName + " | " + phoneNumber),
                StandardOpenOption.APPEND
        );

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String directory = "data";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if(Files.notExists(dataDirectory)) {
            Files.createDirectories((dataDirectory));
        }

        if(! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        System.out.println("1. view contacts." +
                        "\n2. add a new contact." +
                        "\n3. search a contact by name." +
                        "\n4. delete an existing contact." +
                        "\n5. exit.");
        System.out.print("\nEnter an option (1,2,3,4,5): ");
        int userInt = scanner.nextInt();

        if(userInt == 2) {
            System.out.print("\nenter first name: ");
            String newContactFirstName = scanner.next();
            System.out.print("\nenter last name: ");
            String newContactLastName = scanner.next();
            System.out.print("\nenter number: ");
            String newContactNumber = scanner.next();
            addContact(newContactFirstName, newContactLastName, newContactNumber);

        }


    }
}
