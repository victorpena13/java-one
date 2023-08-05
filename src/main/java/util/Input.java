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


}
