package instructor.lesson_10.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String text = null;

        Optional<String> optional = Optional.ofNullable(text);

        if (optional.isPresent()) {
            String str = optional.get();
        }

    }
}
