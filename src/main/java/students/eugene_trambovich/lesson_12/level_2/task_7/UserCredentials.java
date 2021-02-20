package students.eugene_trambovich.lesson_12.level_2.task_7;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    boolean hasRole(Role role) {
        return roles.contains(role);
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

}
