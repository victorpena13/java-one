package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.print("yes or no: ");
        String userInput = getString();
        if(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("enter a number between " + min + "&" + max);
        String userNumber = getString();
        int userNumberConverted = Integer.parseInt(userNumber);
        if(userNumberConverted <= min & userNumberConverted >= max) {
            return userNumberConverted;
        } else {
            getInt(min,max);
        }


    }


}
