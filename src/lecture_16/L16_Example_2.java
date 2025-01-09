package lecture_16;

public class L16_Example_2 {
    public static void main(String[] args) {
        try {
            methodWhereExceptionExpected(10, 0);
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException from method main");
        }
        System.out.println("Hello world!");
    }

    public static void methodWhereExceptionExpected(int a, int b) throws ArithmeticException {
            System.out.println("Before exception");
            int result = a / b; // возникло исключение ArithmeticException
            System.out.println(result);
            System.out.println("After exception");
    }
}
