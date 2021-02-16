package instructor.lesson_13;

public class Strings {

    public String sanitize(String text) {
        return text.replaceAll("[,.!@#$%^&*()?]", "");
    }
}
