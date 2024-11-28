package lecture_8;

public class L8_Example_7 {
    public static void main(String[] args) {
        String string1 = new String("Hello"); // нету в String Pool
        String string2 = string1.intern(); // попало в String Pool
        String string3 = new String("Hello").intern(); // уже было в String Pool

        System.out.println(string1 == string2);
        System.out.println(string1 == string3);
        System.out.println(string2 == string3);
    }
}
