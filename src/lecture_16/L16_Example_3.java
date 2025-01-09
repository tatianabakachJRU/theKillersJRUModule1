package lecture_16;

public class L16_Example_3 {
    public static void main(String[] args) {
        methodWhereExceptionExpected(10, 0);
        System.out.println("Hello world!!!");
    }

    public static void methodWhereExceptionExpected(int a, int b) {
        System.out.println("Before exception");
        if (b < 0) {
            throw new IllegalArgumentException("IllegalArgumentException where b < 0");
        }
        int result = a / b; // возникло исключение ArithmeticException
        System.out.println(result);
        System.out.println("After exception");
    }
}
