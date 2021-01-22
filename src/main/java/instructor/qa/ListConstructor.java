package instructor.qa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListConstructorDemo {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");

        new ListConstructor(list);

    }
}

class ListConstructor {

    private List<String> strings;

    public ListConstructor(List<String> strings) {
        this.strings = strings;
    }
}
