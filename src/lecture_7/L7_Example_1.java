package lecture_7;

public class L7_Example_1 {
    public static void main(String[] args) {
        System.out.println("Meow");
        System.out.println("Meeeoooow");
        System.out.println("Meow");
        System.out.println("Meeeoooow");
        System.out.println("Meow");
        System.out.println("Meeeoooow");
        System.out.println("Meow");
        System.out.println("Meeeoooow");
        System.out.println("Meow");
        System.out.println("Meeeoooow");

        System.out.println("*".repeat(25));
        meow();
        meow();
        meow();
        meow();
        meow();

        System.out.println("*".repeat(25));
        for (int i = 0; i < 5; i++) {
            meow();
        }
        System.out.println(sum(2, 3));
        System.out.println(sum(21, 300));
        System.out.println(sum(-2, 3));
        System.out.println(sum(-22, 999));

    }

    public static void meow(){
        System.out.println("Meow");
        System.out.println("Meeeoooow");
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
