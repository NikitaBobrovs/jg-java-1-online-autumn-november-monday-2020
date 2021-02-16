package instructor.lesson_14;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> todaySupplier = new CurrentDaySupplier();
        System.out.println(todaySupplier.get());

    }
}

class CurrentDaySupplier implements Supplier<String> {

    @Override
    public String get() {
        return "Monday";
    }
}
