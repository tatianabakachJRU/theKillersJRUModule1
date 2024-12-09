package lecture_9;

public class DragonApp {
    public static void main(String[] args) {

        Dragon dragon1 = new Dragon("Draco", 100);
        Dragon dragon2 = new Dragon("Bru", 400);
        Dragon dragon3 = new Dragon();

        dragon1.fly();
        dragon2.fly();
        dragon3.fly();

        dragon3.setName("Kay");
        dragon3.fly();
    }
}
