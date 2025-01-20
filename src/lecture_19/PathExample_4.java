package lecture_19;

import java.nio.file.Path;

public class PathExample_4 {
    public static void main(String[] args) {
        Path absolutePath = Path.of("/home/user/documents/example.txt");
        Path relativePath = Path.of("lecture_18/example.txt");

        System.out.println("Absolute path: " + absolutePath.toAbsolutePath());
        System.out.println("Absolute path: " + relativePath.toAbsolutePath());
        System.out.println("Is absolute path: " + absolutePath.isAbsolute());
        System.out.println("Is absolute path: " + relativePath.isAbsolute());
    }
}
