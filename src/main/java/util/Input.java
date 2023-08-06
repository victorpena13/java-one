package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.print("yes or no: ");
        String userInput = getString();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("enter a number between " + min + " & " + max + ": ");
        int userNumber = getInt();
        if (userNumber >= min & userNumber <= max) {
            System.out.println("correct");

        } else {
            getInt(min, max);
        }
        return userNumber;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(int min, int max) {
        System.out.print("enter a number between " + min + " & " + max + ": ");
        String userNumber = getString();
        double userNumberConverted = Integer.parseInt(userNumber);
        if (userNumberConverted >= min & userNumberConverted <= max) {
            System.out.println("correct");
        } else {
            getInt(min, max);
        }
        return userNumberConverted;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public static void main(String[] args) {

        Input input = new Input();

        input.getInt(10,20);

    }






}
