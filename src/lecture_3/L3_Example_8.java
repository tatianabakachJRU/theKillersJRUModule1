package lecture_3;

public class L3_Example_8 {
    public static void main(String[] args) {
        String str1 = "Dog";
        String str2 = new String("Dog");
        String intern = str2.intern();

        System.out.println(str1 == str2);
        System.out.println(str1 == intern);
        System.out.println(str2 == intern);


    }
}
