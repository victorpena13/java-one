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

    public static void main(String[] args) {
        System.out.println(addition(1,2)); // 3
        System.out.println(subtraction(1,2)); // -1
        System.out.println(multiplication(1,2)); //2
        division(1,2);
        division(1,0);
        System.out.println(modulus(2,1));
        System.out.println("test: ");
        System.out.println(multiplyWithLoop(2,5));
        System.out.println(multiplyWithLoop(3,5));

    }
}
