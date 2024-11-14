package lecture_4;

public class L4_Example_3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 30;

        while (++i < --j);

            System.out.println("i: " + i);
            System.out.println("j: " + j);
    }
}
