package students.jelena_kaverska.lesson_12.level_3.task_18;

class Task18 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.toUpperCase());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }
}