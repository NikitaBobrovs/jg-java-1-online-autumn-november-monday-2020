package students.polina_ivashkevich.lesson_7.level_1.task_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WordService {


        public String findMostFrequentWord(String text) {
            String[] words = text.split(",\\s*| ");
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            String frequentWord = " ";
            Integer fr = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > fr) {
                    fr = entry.getValue();
                    frequentWord = entry.getKey();
                }
            }
            return frequentWord;
        }

        public String findMostFrequentWord1(String text) {
            Map<String, Long> map = Arrays.stream(text.split(",\\s*| "))
                    .collect(groupingBy(Function.identity(), counting()));
            return map.entrySet().stream()
                    .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                    .map(entry -> entry.getKey())
                    .get();
        }
    }

    class My {
        public static void main(String[] args) {
            WordService w = new WordService();
            System.out.println(w.findMostFrequentWord("Lorem, text,Ipsum,is,simply,dummy,text,Lorem,industry,text, Lorem, text"));
            System.out.println(w.findMostFrequentWord1("Lorem, text,Ipsum,is,simply,dummy,text,Lorem,industry,text, Lorem, text"));
        }
    }









