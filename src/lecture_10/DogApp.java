package lecture_10;

public class DogApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        String string = dog.toString();
        System.out.println(string);

        Dog dog1 = new Dog("Rex", 20);
        System.out.println(dog1.hashCode());
        System.out.println(dog1.hashCode());
        dog1.setAge(10);
        System.out.println(dog1.hashCode());
        System.out.println(dog1.hashCode());

        boolean equals = dog1.equals(dog);
        System.out.println(equals);

        Dog dog2 = dog1;
        System.out.println(dog2.equals(dog1));
        System.out.println(dog1.equals(null));

        System.out.println(dog1.getClass());
    }
}
