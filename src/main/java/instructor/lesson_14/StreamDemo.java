package instructor.lesson_14;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamDemo {

    public static void main(String[] args) {

        Stream.of("A", "B", "C", "D").forEach(System.out::println);

        List<String> strings = List.of("hello", "world", "lorem", "ipsum", "foobar", "world", "bazqux", "ipsum");

        System.out.println();

        strings.forEach(System.out::println);

        System.out.println();

        List<String> collect = strings.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .filter(text -> text.contains("O"))
                .distinct()
                .limit(3)
                .collect(toList());

        System.out.println(collect);

        System.out.println();

        System.out.println("strings.stream().anyMatch(text -> text.contains(\"o\")) = " + strings.stream().anyMatch(text -> text.contains("o")));
        System.out.println("strings.stream().allMatch(text -> text.contains(\"o\")) = " + strings.stream().allMatch(text -> text.contains("o")));

        System.out.println();

        Optional<String> any = strings.stream()
                .filter(text -> text.startsWith("he"))
                .findAny();

        String text = any
                .map(String::toUpperCase)
                .orElseThrow(() -> new RuntimeException("Can't happen"));

//                .forEach(text -> {
//                    System.out.println(text);
//                });

    }
}
