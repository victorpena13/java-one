// defined a class named Person. with 2 instance variables (firstname & lastname). the class also defines an instance method, sayHello.
public class Person {
    //static instance:
    public static long wordPopulation = 7_500_000_000L;
    public String firstName;
    public String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);

    }
    public static void main(String[] args) {
        //inside main method, created an instance of the Person class'

        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());



    }
}
