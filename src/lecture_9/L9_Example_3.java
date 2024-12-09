package lecture_9;

public class L9_Example_3 {
    public static void main(String[] args) {
        double inf = 10/0.0;
        System.out.println(inf);

        System.out.println("*".repeat(20));

        System.out.println(inf + inf);
        System.out.println(inf - inf);
        System.out.println(inf * inf);
        System.out.println(inf / inf);
        System.out.println("*".repeat(20));

        System.out.println(0.0 / 0.0 + 2);
    }
}
