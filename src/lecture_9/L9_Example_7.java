package lecture_9;

public class L9_Example_7 {
    public static void main(String[] args) {
        long a = 1000L;

        int b = (int) a;
        System.out.println(b);

        byte c = (byte) a; // -128 - 127
        System.out.println(c);

        byte t = 127;
        t++; // -128
        t++;  // -127
        t++;  // -126
        System.out.println(t);

        double k = Double.MAX_VALUE;
        double v = k * 2;
        System.out.println(v);


    }
}
