package lecture_16;

public class L16_Example_5 {
    public static void main(String[] args) {
        methodWhereExceptionExpected(10, 0);
        System.out.println("Hello world!!!");
    }

    public static void methodWhereExceptionExpected(int a, int b) {
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
