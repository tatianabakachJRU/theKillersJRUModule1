package lecture_3;

public class L3_Example_2 {
    public static void main(String[] args) {
        int temperature = 9;
        if (temperature > 20)
            System.out.println("надеть рубашку");
        else if (temperature > 10)
            System.out.println("надеть свитер");
        else if (temperature > 0)
            System.out.println("надеть плащ");
        else
            System.out.println("надеть пальто");
    }
}
