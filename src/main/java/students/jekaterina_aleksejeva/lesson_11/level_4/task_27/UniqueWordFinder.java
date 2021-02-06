package students.jekaterina_aleksejeva.lesson_11.level_4.task_27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {
        return new HashSet<>(Arrays.asList(text.toLowerCase().split("[-.,:;?!~\\s]+")));
    }

}

class UniqueWordFinderDemo {
    public static void main(String[] args) {
        UniqueWordFinder demo = new UniqueWordFinder();
        String numeric = "one! one Two; three three, four Five? five:";
        System.out.println(demo.find(numeric));

    }
}