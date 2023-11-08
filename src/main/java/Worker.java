public class Worker extends Person{

    public Worker(String workerName) {
        super(workerName);
    }

    public static void main(String[] args) {
        Worker bob = new Worker("bob");
        bob.sayHello();
    }
}
