package lecture_12;

public class L12_Example_3 {
    public static void main(String[] args) {
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);

        System.out.println(Double.toHexString(12.12));
        System.out.println(Double.isInfinite(10.0/0.0));
        System.out.println(Double.parseDouble("15"));

        Double a = 15.0;
        double b = 15.0;

        System.out.println(a + b);
    }
}
