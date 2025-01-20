package lecture_19;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileCopyNIOExample_2 {
    public static void main(String[] args) {
        Path sourcePath = Path.of("file.txt");
        Path destPath = Path.of("file_3.txt");

        try (FileChannel sourceChannel = FileChannel.open(sourcePath,
                StandardOpenOption.READ);
             FileChannel destChannel = FileChannel.open(destPath,
                     StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (sourceChannel.read(buffer) > 0){
                buffer.flip();
                destChannel.write(buffer);
                buffer.clear();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
