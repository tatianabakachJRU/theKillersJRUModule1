package lecture_9;

public class Cat extends  Animal{

    @Override
    public void eat() {
        //super.eat(); // Animal eats
        System.out.println("Cat eats!!!!"); // cat eats
    }
}
