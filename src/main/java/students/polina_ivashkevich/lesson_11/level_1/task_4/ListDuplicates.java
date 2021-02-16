package students.polina_ivashkevich.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDuplicates {
    List<String> stringArrayListDuo = new ArrayList<>();
    List<String> stringLinkedList = new LinkedList<>();

    void addToList() {
        stringArrayListDuo.add("Pen");
        stringArrayListDuo.add("Pen");
        stringArrayListDuo.add("Pen");

        stringArrayListDuo.add("Notebook");
        stringArrayListDuo.add("Notebook");
        stringArrayListDuo.add("Notebook");
    }

    void printAll() {
        System.out.println("String array list duplicates :");
        stringArrayListDuo.forEach(System.out::println);
        System.out.println("String linked list duplicates :");
        stringLinkedList.forEach(System.out::println);
    }
}
    class DemoList {
        public static void main(String[] args) {
            ListDuplicates listDuplicates = new  ListDuplicates();
            listDuplicates.addToList();
            listDuplicates.printAll();
        }
}