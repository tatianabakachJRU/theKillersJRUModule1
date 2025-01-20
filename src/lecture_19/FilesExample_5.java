package lecture_19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesExample_5 {
    public static void main(String[] args) {
        Path sourcePath = Path.of("file.txt");
        Path copyPath = Path.of("copyFile.txt");
        Path movedPath = Path.of("movedFile.txt");
        Path outputPath = Path.of("outputFile.txt");
        Path directoryPath = Path.of("newDirectory");

        try {
            if (Files.exists(sourcePath)) {
                List<String> lines = Files.readAllLines(sourcePath);
                for (String line : lines) {
                    System.out.println(line);
                    Files.write(outputPath, lines);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Files.copy(sourcePath, copyPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Files.delete(copyPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Files.createDirectory(directoryPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
