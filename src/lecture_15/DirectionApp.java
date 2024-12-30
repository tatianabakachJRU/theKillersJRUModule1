package lecture_15;

import java.net.ServerSocket;

public class DirectionApp {
    public static void main(String[] args) {
        Direction direction = null;
        switch (direction){
            case NORTH -> System.out.println("Going north");
            case EAST -> System.out.println("Going east");
            case WEST -> System.out.println("Going west");
            case SOUTH -> System.out.println("Going south");
            case null -> System.out.println("Going null");
            default -> System.out.println("Stay here!!!");
        }
    }
}
