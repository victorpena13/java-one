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





    }
}
