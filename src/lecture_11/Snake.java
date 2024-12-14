package lecture_11;

public class Snake {
    public static int counter;

    String name;

    public Snake(String name) {
        counter++;
        this.name = name;
    }

    public Snake() {
    }

    public void eat(){
        System.out.println("Snake eat!");

    }

    public static void sleepStatic(){
        System.out.println("Snake number " + counter + " sleep");
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
