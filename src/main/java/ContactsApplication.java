import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactsApplication {

    public static void addContact(String firstName, String lastName, String phoneNumber) throws IOException {

        Files.write(
                Paths.get("data", "contacts.txt"),
                Arrays.asList(firstName + " " + lastName + " | " + phoneNumber),
                StandardOpenOption.APPEND
        );

    }

    public static void viewContacts() throws IOException {
        Path contactsPath = Paths.get("data", "contacts.txt");
        List<String> contactList = Files.readAllLines(contactsPath);

        for(int i = 0; i < contactList.size(); i += 1) {
            System.out.println((i + 1) + ": " + contactList.get(i));
        }
    }

    public static void searchContact() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("search contact.");
        System.out.print("enter first name: ");
        String userSearchFirstName = scanner.next();
        System.out.print("enter last name: ");
        String userSearchLastName = scanner.next();
        Path contactsPath = Paths.get("data", "contacts.txt");
        List<String> contactList = Files.readAllLines(contactsPath);

        for (int i =0; i < contactList.size(); i +=1) {
            if (contactList.get(i).contains(userSearchFirstName) && contactList.get(i).contains(userSearchLastName)) {
                System.out.println(contactList.get(i));
            }
        }






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

        if(userInt == 1){
            System.out.println("contacts");
            viewContacts();
        } else if(userInt == 2) {
            System.out.print("\nenter first name: ");
            String newContactFirstName = scanner.next();
            System.out.print("\nenter last name: ");
            String newContactLastName = scanner.next();
            System.out.print("\nenter number: ");
            String newContactNumber = scanner.next();
            addContact(newContactFirstName, newContactLastName, newContactNumber);

        } else if(userInt == 3) {
            searchContact();
        }


    }
}
