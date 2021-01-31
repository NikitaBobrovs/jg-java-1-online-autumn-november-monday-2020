package students.jelena_kaverska.lesson_12.level_3.task_20;

class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {
            System.out.println("arithmetic");

        } catch (Exception e) {
            System.out.println("exception");
        }

    }
}

//первым должен обрабатываться catch блок с дочерним классом исключения(конкретное исключение),
// потом catch блок с parent классом (более общей тип исключения)