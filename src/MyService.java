class MyService {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}
class Client {
    public void execute() {
        MyService service = new MyService();
        service.doSomething();
    }
}
