import java.util.Locale;

public class MethodsLesson {
    //public = visibility modifier
    //static = the presence of this keyword defines that the method belongs to the class, as opposed to an instance of it.
    //string = the return type for method
    // all methods must define the type of value they will return.
    // if method does not return anything we can use void.


    // method overloading - defining multiple methods with the same name.
    // but with different parameter type, parameter order, number of parameters.
    // can call other versions of themselves.

    // parameters are passed by value.
    // a copy of the value passed is crated inside of a method,
    // and that reassigning a value inside of a method will not change it outside of the method.


    public static void changeString(String s) {
        s = "wub a lub a dub dub";
    }
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static void sayHello(String greeting, String name) {
        System.out.printf("%s, %s!\n", greeting, name);
    }

    public static void sayHello(int times) {
        for(int i = 0; i < times; i += 1) {
            sayHello("jumbo", "victor" );
        }
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

    public static void main(String[] args) {

        String changeMe = "Hello!!!";

        changeString(changeMe);
        System.out.println(changeMe);

    }
}
