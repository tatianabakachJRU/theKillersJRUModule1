package lecture_11;

public class MainApp {
    public static void main(String[] args) {
        Company.Employee ivan = new Company.Employee(1, "IVAN"); // 1 объект
        System.out.println(ivan);


        Car bmw = new Car("BMW"); // 1 объект
        Car.Engine engine = bmw.new Engine(); // еще 1 объект
        engine.start();



    }
}
