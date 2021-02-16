package students.viktors_cesnokovs.lesson_12.level_3.task_18;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.getBytes());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}
