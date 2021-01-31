package students.eugene_trambovich.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task_1 {
    List<String> arrayList = new ArrayList<>(); // больше годиться, если цель просто работать с целом списком
    // ( проийтись и найти что-то )
    List<String> linkedList = new LinkedList<>(); //больше годиться, если цель работать с отдельными элеметами списка

    Task_1(List<String> arrayList, List<String> linkedList) {
        this.arrayList = arrayList;
        this.linkedList = linkedList;
    }
}
