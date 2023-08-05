public class Person {

    public static long worldPopulation = 7_500_000_000L;
    public String firstName;
    public String lastName;

    // constructor:
    // is a special method that is called when an object is created.
    // has same name as the class and does not define a return type.
    // constructors, like methods, can accept arguments and be overloaded.
    public Person(String firstname, String lastname) {
        firstName = firstname;
        lastName = lastname;
    }

    public Person() {
        System.out.println("a new person is being created without a name");
    }

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }
    public static void main(String[] args) {
        // instance of the Person object:
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());

        // instance of the person object:
        Person ada = new Person();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";

        // instance of the person object:
        Person grace = new Person();
        grace.firstName = "Grace";
        grace.lastName = "Hopper";

        // referencing a static field;
        System.out.println(Math.PI);

        Person newHire = new Person("Victor", "Pena");
        System.out.println(newHire);

    }
}
