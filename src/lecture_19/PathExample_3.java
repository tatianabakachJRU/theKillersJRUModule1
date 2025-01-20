package lecture_19;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample_3
{
    public static void main(String[] args) {
        Path path = Path.of("/home/user/documents/example.txt");
        Path path2 = Path.of("lecture_19/example.txt");
        Path path1 = Paths.get("/home/user/../documents/example1.txt");

        System.out.println("File name: " + path.getFileName());
        System.out.println("Parent path: " + path.getParent());
        System.out.println("Absolute path: " + path.isAbsolute());
        System.out.println("Normalized path: " + path1.normalize());
        System.out.println("Does the file exist: " + Files.exists(path));



    }
}
