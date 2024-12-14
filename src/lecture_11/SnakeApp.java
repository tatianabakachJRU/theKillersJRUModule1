package lecture_11;

public class SnakeApp {
    public static void main(String[] args) {  // counter = 0
        Snake.counter = 4;          // counter = 4;

        Snake snake1 = new Snake("A");
        System.out.println("Snake: " + snake1 + "Counter: " + Snake.counter);
        Snake snake2 = new Snake("B");
        Snake snake3 = new Snake("C");
        Snake snake4 = new Snake();
        System.out.println("Snake: " + snake4 + "Counter: " + Snake.counter);


        System.out.println("Snake: " + snake1 + "Counter: " + Snake.counter);
        System.out.println("Snake: " + snake2 + "Counter: " + Snake.counter);
        System.out.println("Snake: " + snake3 + "Counter: " + Snake.counter);
        Snake.counter = 4;

        Snake.sleepStatic();

        snake1.eat();



    }
}
