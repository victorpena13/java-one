import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        int a = 5;
        while(a <= 15) {
            System.out.print(a++ + " ");
        }

        int b = 0;
        do {
            System.out.println(b+=2);
        } while(b < 100);

        int c = 100;
        do {
            System.out.println(c-=5);
        } while(c > -10);

        long d = 2;

        do {
            System.out.println(d);
            d*=d;
        } while (d<=1000000);

        for(int e = 100; e >= -10; e-=5) {
            System.out.println(e);
        }


        for(long f = 2; f < 1000000; f*=f) {
            System.out.println(f);
        }

        for(int g = 1; g<=100; g++) {
            if(g%3==0 && g%5==0) {
                System.out.println("FizzBuzz");
            } else if(g%3==0) {
                System.out.println("Fizz");
            } else if (g%5==0) {
                System.out.println("buzz");
            } else {
                System.out.println(g);
            }

        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("what would you like to go up to:  ");
        int userInt = scanner.nextInt();

        System.out.println("Here is your table!");
        System.out.printf("%15s| %15s| %15s|%n", "number", "squared", "cubed");
        for(int i = 0; i <= userInt; i++){
            System.out.printf("%15s| %15s| %15s|%n", i, i*i, i*i*i);
        }

    }
}
