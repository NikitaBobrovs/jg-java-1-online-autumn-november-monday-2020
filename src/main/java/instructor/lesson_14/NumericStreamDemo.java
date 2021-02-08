package instructor.lesson_14;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamDemo {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        System.out.println(IntStream.rangeClosed(1, 100).filter(value -> value % 2 == 0).summaryStatistics());

        IntSummaryStatistics statistics = integers.stream().mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("statistics = " + statistics);

    }
}
