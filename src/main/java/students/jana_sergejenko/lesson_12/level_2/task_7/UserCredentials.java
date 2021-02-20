package students.jana_sergejenko.lesson_12.level_2.task_7;

import java.util.List;

class UserCredentials {

    private List<Role> roles;
    // созжайте конструктор класса, в котором вы получаете список ролей

    UserCredentials(List<Role> roles) {
        this.roles = roles;

    }

    public List<Role> getRoles() {
        return roles;
    }
    public boolean isRole(Role role){
        return roles.contains(role);
    }
}
