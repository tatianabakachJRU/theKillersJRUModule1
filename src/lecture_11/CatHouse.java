package lecture_11;

public class CatHouse {

    private static int counter;
    public String houseName;
    private int contOfWindows;

    public static class Cat {
        public void printToConsole() {
            CatHouse catHouse = new CatHouse();
            System.out.println(counter + catHouse.houseName);
        }
    }


    public class Mouse {
        public void printToConsole() {
            System.out.println(counter + houseName + contOfWindows);
        }
    }

}
