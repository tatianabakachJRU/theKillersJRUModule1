package lecture_7;

public class L7_Example_5 {

    public static void main(String[] args) {

        System.out.println(sum(4, 30));

        int a =6;
        int b =7;
        System.out.println(a + b);
        a =8;
        b =13;
        System.out.println(a + b);

        System.out.println(sum(6, 7));
        System.out.println(sum(8, 13));
    }
    public static int sum(int a, int b){
        return a + b + 10;
    }
}
