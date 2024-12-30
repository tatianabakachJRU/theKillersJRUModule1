package lecture_15;

public class SwitchExample_5 {
    public static void main(String[] args) {
        String catName = null;

        switch (catName){
            case "Rex" -> System.out.println("Cat Rex");
            case "Fex" -> System.out.println("Cat Fex");
            case "Pex" -> System.out.println("Cat Pex");
            case null -> System.out.println("No cat selected");
            default -> System.out.println("Unknown cat");
        }
    }
}
