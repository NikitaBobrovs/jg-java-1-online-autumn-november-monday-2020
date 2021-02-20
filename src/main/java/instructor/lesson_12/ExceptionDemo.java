package instructor.lesson_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class ExceptionDemo {

    public static void main(String[] args) {

        Optional<String> text = readText("/Users/konstantins/Desktop/bar.txt");

        if (text.isPresent()) {
            System.out.println("Text = " + text.get());
        } else {
            System.out.println("Could not read text from file");
        }

    }

    public static Optional<String> readText(String path) {
        try {
            return Optional.of(Files.readString(Path.of(path)));
        } catch (IOException ex) {
//            throw new RuntimeException(ex);
            ex.printStackTrace();
            return Optional.empty();
        } finally {
            System.out.println("FINALLY BLOCK");
        }
    }
}
