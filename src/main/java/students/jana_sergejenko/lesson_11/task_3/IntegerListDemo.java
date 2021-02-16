package students.jana_sergejenko.lesson_11.task_3;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> l1
                = new ArrayList<Integer>();
        // добавить в список элемент (в начало и в конец)
        l1.add(0, 1);
        l1.add(2);
        //узнать длину списка
        System.out.println(l1.size());
        //удалить элемент из списка (по интексу и без)
        l1.remove(0);
        //узнать пустой список или нет
        System.out.println(!l1.isEmpty());
        //обойти список и вывести на консоль каждый элемент
        System.out.println(l1);
    }
}
