package lecture_8;

public class L8_Example_9 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Word";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("*".repeat(30));

        String str4 = "Ponapo";
        String str5 = "Banana";

        System.out.println(str4.compareTo(str5));
        System.out.println(str5.compareTo(str4));
        System.out.println(str4.compareTo("Apple"));
        System.out.println(str5.regionMatches(2, str4, 2, 2));
        System.out.println(str5.lastIndexOf("na"));
        System.out.println(str5.substring(2, 4));
        System.out.println(str5.replace('a', 'o'));
    }
}
