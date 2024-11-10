package lecture_1;

public class Example_2 {
    public static void main(String[] args) {
        int a  = 2;
        int b  = 3;

        int result = a++ * b++; // 6
        System.out.println(a);  // 3
        System.out.println(b);  // 4
        System.out.println(result);
        System.out.println(a * b) ; // 12
        System.out.println(a-- * b--); // 3 * 4, =>> a = 2, b = 3;
        System.out.println(--a * --b); // 1 * 2
    }
}
