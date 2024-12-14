package lecture_11;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    class Engine{
        void start(){
            System.out.println("Engine start: " + "Car: " + model);
        }
    }
}
