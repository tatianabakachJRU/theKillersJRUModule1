package lecture_19;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamExample_6 {
    public static void main(String[] args) {
        Path path = Path.of("/Users/tatianabakach/Desktop/theKillersJRUModule1");

        try(DirectoryStream<Path> pathDirectoryStream =
                    Files.newDirectoryStream(path, "*.txt")){
            System.out.println("Text files:");
            for (Path path1 : pathDirectoryStream) {
                System.out.println(path1.getFileName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
