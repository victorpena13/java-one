public class Person {

    private String name;

    public Person() {
        System.out.println("a new person is being created!");
    }

    public Person(String name) {
        this.name =name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.setName("john");
        Person person2 = new Person("john");
        System.out.println(person1.getName());

        System.out.println(person1.getName().equals(person2.getName())); // true
        System.out.println(person1 == person2); // false
        Person person3 = person1;
        System.out.println(person1 == person3); // true
        System.out.println(person1.getName() + " is the same as person3: " +  person3.getName());

    }

}
