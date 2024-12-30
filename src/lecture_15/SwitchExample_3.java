package lecture_15;

public class SwitchExample_3 {
    public static void main(String[] args) {
        String fruit = "Apple";

       String color = switch (fruit){
           case "Apple" -> "Green";
           case "Banana" -> "Yellow";
           case "Cherry" -> "Red";
           default -> "Pink";
       };
        System.out.println(color);

        int number = switch (fruit){
            case "Apple" -> 1;
            case "Banana" -> 2;
            default -> 100;
        };

        System.out.println(number);
    }
}
