package lecture_15;

public class SingletonExampleApp {
    public static void main(String[] args) {

        SingletonExample.getInstance(); // new SingletonExample
        SingletonExample.getInstance();
        SingletonExample.getInstance();
        SingletonExample.getInstance();
        SingletonExample.getInstance();
        SingletonExample.getInstance();

    }
}
