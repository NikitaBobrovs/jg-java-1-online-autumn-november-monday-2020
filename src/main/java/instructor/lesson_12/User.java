package instructor.lesson_12;

import java.util.Objects;

class UserDemo {

    public static void main(String[] args) {

        User user = new User(null, "qwerty123");
        System.out.println("The user '" + user.getUsername() + "' with password '" + user.getPassword() + "' tried to login");

    }
}

class User {

    private final String username;
    private final String password;

    public User(String username, String password) {
//        Objects.requireNonNull(username, "Username parameter cannot be null!"); // offensive
//        Objects.requireNonNullElse(username, "n/a"); // defensive

        if (username == null) {
            throw new IllegalUsernameException();
        }

        if (password == null) {
            throw new IllegalArgumentException("Password parameter cannot be null!");
        }

        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMaskedPassword() {
        return password.replaceAll("[0-9]", "*");
    }
}

class IllegalUsernameException extends RuntimeException {

    public IllegalUsernameException() {
        super("Username cannot be null!");
    }
}
