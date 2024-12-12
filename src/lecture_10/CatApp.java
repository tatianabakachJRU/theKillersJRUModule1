package lecture_10;

import java.util.Scanner;

public class CatApp {
    public static void main(String[] args) {

        Cat cat = new Cat();

        Cat cat1 = new Cat("Boris");

        Cat cat2 = new Cat("Barsik", 10);

        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat1);
        System.out.println(cat2);
        cat.eat();

        System.out.println(cat1.getName());
        cat1.setName("Frank");
        System.out.println(cat1);
    }
}
