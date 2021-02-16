package students.polina_ivashkevich.lesson_10.level_1.task_3;

public interface MyList {

        void add();                               // add new element to list at the end.
        void remove();                            // removes requested element.
        void removeAllOf(/*insert parameter */);  //removes all occurrences of set element.
        void clear();                             // delete all elements.
        void sort();                              // sort elements in some way?.

        boolean find();                           // look for specific element.
        boolean isEmpty();                        // check if list is empty.

        int size();                               // how many elements are in the list.

        Object[] arrayOfList();                   // return array with element from list.
}
