public class Methods {

    public static int addition(int x, int y) {
        return x+y;
    }

    public static int subtraction(int x, int y) {
        return x-y;
    }

    public static int multiplication(int x, int y) {
        return x*y;
    }

    public static int division(int x, int y) {
        return x/y;
    }

    public static int modulus(int x, int y) {
        return x%y;
    }


    public static void main(String[] args) {
        System.out.println(addition(2,2)); //4
        System.out.println(subtraction(2,2)); //0
        System.out.println(multiplication(2,2)); //4
        System.out.println(division(2,2)); //1
        System.out.println(modulus(2,2)); //0
    }
}
