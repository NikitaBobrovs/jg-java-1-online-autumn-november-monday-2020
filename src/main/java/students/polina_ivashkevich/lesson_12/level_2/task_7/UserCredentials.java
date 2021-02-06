package students.polina_ivashkevich.lesson_12.level_2.task_7;


import java.util.List;

public class UserCredentials {
    private final List<Role> roles;
    
    public boolean hasRole(Role role) {
        return role.contains(role);
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }
}
enum Role {
    CAN_SEARCH_CLIENT;

    public boolean contains(Role role) {
        return contains(role);
    }
}
