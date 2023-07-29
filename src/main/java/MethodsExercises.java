import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int multiplyWithLoop(int a, int b) {
        int result = 0;
        for(int r = 1; r <= b; r++) {
            result += a;
        }
        return result;
    }

    public static int multiplyRecursion(int a, int b) {
        int result = 0;
        if(a == 0 | b == 0) {
            result += 0;
        } else if (a == 1) {
            result += b;
        } else if (b == 1) {
            result += a;
        } else {
            result += a + multiplyRecursion(a, b-1);
        }
        return result;
    }

    public static void division(int a, int b) {
        if(a == 0) {
           System.out.println("undefined");
        } else if(b == 0) {
            System.out.println("undefined");
        } else {
            System.out.println(a/b);

        }
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    //recursion:
    public static int getInteger(int min, int max) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("guess a number between " + min + " & " + max + ": ");
        int userInt = scanner.nextInt();
        if(userInt<min) {
            System.out.println("higher");
            getInteger(min,max);
        } else if (userInt > max) {
            System.out.println("lower");
            getInteger(min,max);
        } else if (userInt >= min & userInt <= max) {
            System.out.println("you got it");
            result += userInt;
        }
        return result;
    }

    public static void factorial() {
        int factorial = 1;
        int userInteger = getInteger(1, 10);
        for (int i = 1; i <= userInteger; i++) {
            factorial *= i;
            System.out.println(i);
        }

    }




    public static void main(String[] args) {
        System.out.println(addition(1,2)); // 3
        System.out.println(subtraction(1,2)); // -1
        System.out.println(multiplication(1,2)); //2
        division(1,2);
        division(1,0);
        System.out.println(modulus(2,1));
        System.out.println("multiply with loop:  ");
        System.out.println(multiplyWithLoop(2,5));
        System.out.println(multiplyWithLoop(3,5));
        System.out.println("recursion: ");
        System.out.println(multiplyRecursion(2,5)); // 10
        System.out.println(multiplyRecursion(0,2)); // 0
        System.out.println(multiplyRecursion(3,0)); // 0
        System.out.println(multiplyRecursion(1,2)); // 2
        System.out.println(multiplyRecursion(5,1)); // 5

        getInteger(4,10);
        factorial();


    }
}
