public class ControlFlowExercises {

    public static void main(String[] args) {

        int a = 5;
        while (a <= 15) {
            System.out.print(a + " ");
            a++;
        }

        int b = 0;

        do {
            System.out.println(b);
            b+=2;
        } while (b <= 100);

        int c = 100;

        do{
            System.out.println(c);
            c-=5;
        } while(c>=-10);


        // must use long to perform following loop:
        long d = 2;
        do {
            System.out.println(d);
            d*=d;
        } while(d <= 1000000);

        for (int e = 100; e >= -10; e-=5) {
            System.out.println(e);
        }

    }
}
