package lecture_15;

public class SwitchExample_4 {
    public static void main(String[] args) {
        int number = 10;

        switch (number){
            case 1 -> System.out.println("One");
            case 10 ->
            {
                System.out.println("Ten");
                double newNumber = number * Math.PI;
                System.out.println(newNumber);
            }
            default -> System.out.println("Unknown number");
        }
    }
}
