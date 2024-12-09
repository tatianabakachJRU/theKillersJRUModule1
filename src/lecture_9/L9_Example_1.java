package lecture_9;

public class L9_Example_1 {
    public static void main(String[] args) {
        counter( -2);
    }

    public static byte counter(byte a) {
        return (byte) (a * 2);
    }

    public static short counter(short a) {
        return (short) (a * 2);
    }

    public static int counter(int a) {
        return a * 2;
    }

    public static long counter(long a) {
        return a * 2;
    }
}
