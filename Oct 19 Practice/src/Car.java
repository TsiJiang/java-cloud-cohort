public class Car extends Vehicle {
    private Engine engine;
    void honk(){
        System.out.println("Car Honks");
    }
    Car(){
        engine = new Engine();
    }
    Car(Engine engine){
        this.engine = engine;
    }
    void setEngine(Engine engine){
        this.engine = engine;
    }
    @Override
    void start() {
        engine.start();
        System.out.println("Car is running");
    }
}
