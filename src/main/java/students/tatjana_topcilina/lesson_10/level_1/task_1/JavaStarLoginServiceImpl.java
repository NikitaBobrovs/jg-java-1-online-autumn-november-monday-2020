package students.tatjana_topcilina.lesson_10.level_1.task_1;

public class JavaStarLoginServiceImpl  implements JavaStarLoginService{

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}

interface JavaStarLoginService {
    boolean canLogin(String login, String password);
}
