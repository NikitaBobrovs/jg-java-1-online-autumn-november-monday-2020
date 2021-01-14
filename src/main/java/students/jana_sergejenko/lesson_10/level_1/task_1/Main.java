package students.jana_sergejenko.lesson_10.level_1.task_1;

public class Main {
    public static void main(String[] args) {
        JavaStarLoginServiceImpl test=new JavaStarLoginServiceImpl();
        System.out.println(test.canLogin("javastar", "pass"));
        System.out.println(test.canLogin("lalalla", "lalala"));
    }
}
