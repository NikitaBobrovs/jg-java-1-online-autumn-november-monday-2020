package students.jelena_kaverska.lesson_11.level_4.task_27;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class UniqueWordFinderTests {
    private final UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testUnique() {
        String cities = "Male, NY, Tokyo, Male, London, NY";
        Set<String> act = uniqueWordFinder.find(cities);
        Set<String> exp = new TreeSet<>(Arrays.asList("Male", "NY", "Tokyo", "London"));
        System.out.println("Test unique set: " + printResults(exp.equals(act)));
    }

    void testUnique1() {
        String cities = "Male, NY, Tokyo, London";
        Set<String> act = uniqueWordFinder.find(cities);
        Set<String> exp = new TreeSet<>(Arrays.asList("Male", "NY", "Tokyo", "London"));
        System.out.println("Test unique set: " + printResults(exp.equals(act)));
    }

    public static void main(String[] args) {
        UniqueWordFinderTests tests = new UniqueWordFinderTests();
        tests.testUnique();
        tests.testUnique1();
    }
}