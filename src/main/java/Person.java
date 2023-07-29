public class Person {
    public String firstName;
    public String lastName;

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

    }
}
