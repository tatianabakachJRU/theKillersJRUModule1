package lecture_9;

public class L9_Example_6 {
    public static void main(String[] args) {
        byte a = 10;
        short b = a;
        int c = b;
        long d = c;

        System.out.println(d);

        long p = 10;
        int s = (int) p;
        short f = (short) s;
        byte h = (byte) f;

        System.out.println(h);

        double k = 9.78;
        long g = (long) k;
        System.out.println(g);
    }
}
