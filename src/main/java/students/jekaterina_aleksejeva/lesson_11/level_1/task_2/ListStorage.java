package students.jekaterina_aleksejeva.lesson_11.level_1.task_2;

import java.util.ArrayList;

class ListStorage {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Bender"));
        Cat cat = new Cat("Kissa");
        cats.add(cat);
        for (Cat c: cats){
            System.out.println(c.name + " ");
        }

        ArrayList list = new ArrayList();
        list.add(12);
        list.add("chairs");
        list.add("morning");
        list.add(100.15);
        System.out.println(list);
    }
//elements of ArrayList may be of different types, or of the same type
}
