import java.util.Locale;

public class MethodsLesson {
    //public = visibility modifier
    //static = the presence of this keyword defines that the method belongs to the class, as opposed to an instance of it.
    //string = the return type for method
    // all methods must define the type of value they will return.
    // if method does not return anything we can use void.

    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static void sayHello(String greeting, String name) {
        System.out.printf("%s, %s!\n", greeting, name);
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

    public static void main(String[] args) {


    }
}
