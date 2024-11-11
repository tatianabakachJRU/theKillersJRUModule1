package lecture_3;

public class L3_Example_7 {
    public static void main(String[] args) {
        String str1 = "Cat"; // a5
        String str2 = "Cat";  // a5
        String str21 = "Cat";  // a5
        String str22 = "Cat";  // a5
        String str23 = "Cat";  // a5
        String str3 = new String("Cat");  // t18
        String str4 = new String("Cat");  // e5
        String str5 = new String("Cat");  // g68
        String str6 = new String("Cat");  // o1
        String intern = str5.intern();
        System.out.println(str1 == intern);

        boolean result = str1 == str2;
        boolean resultEquals = str1.equals(str2);

        boolean result2 = str1 == str3;
        boolean resultEquals2 = str1.equals(str3);


        System.out.println(result);
        System.out.println(result2);
        System.out.println("***********");
        System.out.println(resultEquals);
        System.out.println(resultEquals2);

    }
}
