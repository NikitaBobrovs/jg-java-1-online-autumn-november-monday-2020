package students.polina_ivashkevich.lesson_10.level_1.task_1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javaStar")
                && (password != null)
                && password.equals("pass");
    }
}
