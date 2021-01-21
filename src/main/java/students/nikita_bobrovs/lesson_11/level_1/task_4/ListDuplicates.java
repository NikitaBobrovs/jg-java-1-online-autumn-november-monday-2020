package students.nikita_bobrovs.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListDuplicates {
    List<String> stringArrayListList = new ArrayList<>();

    List<String> stringLinkedList = new LinkedList<>();

    void addToLists() {
        stringArrayListList.add("A");
        stringArrayListList.add("A");
        stringArrayListList.add("A");

        stringLinkedList.add("B");
        stringLinkedList.add("B");
        stringLinkedList.add("B");
    }

    void printAll() {
        System.out.println("String arrayList duplicates :");
        stringArrayListList.forEach(System.out::println);
        System.out.println("String linkedList duplicates : ");
        stringLinkedList.forEach(System.out::println);
    }
}

class Demo {
    public static void main(String[] args) {
        ListDuplicates demo = new ListDuplicates();
        demo.addToLists();
        demo.printAll();
    }
}
