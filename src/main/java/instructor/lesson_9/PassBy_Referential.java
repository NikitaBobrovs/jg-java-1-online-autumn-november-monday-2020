package instructor.lesson_9;

import java.util.Arrays;

public class PassBy_Referential {

    public static void main(String[] args) {

        User user = new User();
        user.id = "12345";

        System.out.println("[before] user.id = " + user.id);

        foo(user);

        System.out.println("[after]  user.id = " + user.id);

        int[] a = {2,4,6,5,1};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    // Pass by value (reference copy value!!)
    public static void foo(User user) {
        user.id = "54321";

        user = new User();
        user.id = "98765";
    }
}

class User {

    String id;

}
