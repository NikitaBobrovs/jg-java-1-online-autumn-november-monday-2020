package students.jekaterina_aleksejeva.lesson_11.level_1.task_3;

import java.util.LinkedList;

class IntegerListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(10);
        integers.add(19);
        integers.add(15);
        integers.add(8);
        integers.add(20);

        System.out.println("If the initial list of integers is empty? = " + integers.isEmpty());
        System.out.println("Get initial list of integers: " + integers);
        System.out.println("The size of initial list is: " + integers.size());
        integers.remove(1);
        System.out.println("Remove element indexed 1 from the list and get the updated list: " + integers);
        integers.remove(Integer.valueOf(8));
        System.out.println("Remove element 8 from the list and get the updated list: " + integers);
        integers.addFirst(5);
        System.out.println("Add element 5 as the first element of the list and get the updated list: ");
        integers.forEach(System.out::println);
        integers.addLast(25);
        System.out.println("Add element 25 as the last element of the list and print out each element: ");
        for (Integer n : integers) {
            System.out.println(n + " ");
        }
        System.out.println("Thank you!");

    }
}
