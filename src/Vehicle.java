
class Vehicle {
    public void Start() {
        System.out.println("Truck is starting");
    }
    public void Stop() {
        System.out.println("Truck is stopping");
    }
}

class Car extends Vehicle {
}

class Truck extends Vehicle {
}
