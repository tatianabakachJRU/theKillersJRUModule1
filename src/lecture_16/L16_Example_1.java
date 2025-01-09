package lecture_16;

public class L16_Example_1 {
    public static void main(String[] args) {
        methodWhereExceptionExpected(10, 0);
        System.out.println("Hello world!");
    }

    public static void methodWhereExceptionExpected(int a, int b) {
        try {
            String str = null;
            System.out.println(str.length()); //возникло исключение NullPointerException
            int abc = Integer.parseInt("abc"); // возникло исключение NumberFormatException
            System.out.println("Before exception");
            int result = a / b; // возникло исключение ArithmeticException
            System.out.println(result);
            System.out.println("After exception");
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException. You can't divide by zero!!!");
        } catch (NullPointerException ex) {
            System.out.println("Exception caught: NullPointerException");
        } catch (NumberFormatException exception) {
            System.out.println("Exception caught: NumberFormatException");
        } catch (RuntimeException e) {
            System.out.println("Exception caught: RuntimeException");

        } finally {
            System.out.println("Finally. Will be executed!!!");
        }
    }
}
