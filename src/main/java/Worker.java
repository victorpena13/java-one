public class Worker extends Person{
    private double salary;
    public void doWork() {
        System.out.println("Work, work...");
    }

    public Worker(String workerName) {
        super(workerName);
    }

    //overriding
    public void sayHello() {
        System.out.println("how can i help you");
    }

    public static void main(String[] args) {
        Worker bob = new Worker("bob");
        bob.sayHello();
    }
}
