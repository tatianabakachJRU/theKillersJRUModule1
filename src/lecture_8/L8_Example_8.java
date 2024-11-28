package lecture_8;

import java.util.Arrays;

public class L8_Example_8 {
    public static void main(String[] args) {
        String text = "This is the text";
        String emptyString = "";
        String blankString = "          ";
        System.out.println(text.length());
        System.out.println(text.isEmpty());
        System.out.println(emptyString.isEmpty());
        System.out.println(text.isBlank());
        System.out.println(blankString.isBlank());
        System.out.println(text.charAt(2));
        System.out.println(Arrays.toString(text.toCharArray()));
        System.out.println(Arrays.toString(text.split(" ")));



    }
}
