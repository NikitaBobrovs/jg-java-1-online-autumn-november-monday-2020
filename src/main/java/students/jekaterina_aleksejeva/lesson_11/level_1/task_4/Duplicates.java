package students.jekaterina_aleksejeva.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Duplicates {
    public static void main(String[] args) {
        List<String> seasons = new ArrayList<>();
        seasons.add("winter");
        seasons.add("winter");
        seasons.add("spring");
        seasons.add("spring");
        seasons.add("summer");
        seasons.add("autumn");

        System.out.println("ArrayList of seasons having duplicates: " + seasons);
        HashSet<String> clear = new HashSet<>(seasons);
        List<String> fourSeasons = new ArrayList<>(clear);
        System.out.println("List of seasons cleared from the duplicates: " + fourSeasons);
        fourSeasons.set(0,"winter");
        fourSeasons.set(1,"spring");
        fourSeasons.set(2,"summer");
        fourSeasons.set(3,"autumn");
        System.out.println("List of seasons sorted chronologically: ");
        fourSeasons.forEach(System.out::println);
        System.out.println("-----------------------------");

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);

        System.out.println("LinkedList of numbers having duplicates: " + numbers);
        numbers.remove(2);
        numbers.removeLast();
        System.out.println("List of numbers cleared from the duplicates: ");
        numbers.forEach(System.out::println);
        System.out.println("-----------------------------");
    }

}
