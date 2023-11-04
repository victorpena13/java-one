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

    public static int multiplyWithOutStarSymbol(int x, int y) {
        int result=0;
        for(int i = 0; i < y; i++) {
            result = result + x;
        }
        return result;
    }

    public static int multiplicationRecursion(int x, int y) {
        if(x == 0 | y== 0) {
            return 0;
        } else {
            return x + multiplicationRecursion(x,y-1);
        }
    }

    public static String division(int x, int y) {
        if(y==0) {
            return "undefined";
        }
        return Integer.toString(x/y);
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
        System.out.println(division(2,0));
        System.out.println(multiplyWithOutStarSymbol(5,5));
        System.out.println(multiplyWithOutStarSymbol(2,2));
        System.out.println(multiplicationRecursion(2,2));
        System.out.println(multiplicationRecursion(5,5));
        System.out.println(multiplicationRecursion(5,0));
        System.out.println(multiplicationRecursion(1,5));
        System.out.println(multiplicationRecursion(2,1));

    }
}
