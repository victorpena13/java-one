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

    public static int division(int a, int b) {
        return a/b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println(addition(1,2)); // 3
        System.out.println(subtraction(1,2)); // -1
        System.out.println(multiplication(1,2)); //2
        System.out.println(division(1,2));
        System.out.println(modulus(2,1));
    }
}
