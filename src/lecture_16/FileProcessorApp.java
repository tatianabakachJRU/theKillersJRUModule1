package lecture_16;

import java.io.IOException;

public class FileProcessorApp {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.processFile("data.txt");
    }
}
