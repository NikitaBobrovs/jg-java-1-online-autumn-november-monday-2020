package instructor.lesson_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class RandomPasswordGeneratorDemo {

    public static void main(String[] args) {

        System.out.println(" *** Random Password Generator ***");
        System.out.print("Password Length: ");

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        RandomPasswordGenerator generator = new RandomPasswordGenerator();

        String password = generator.generate(length);
        System.out.println("Your password is " + password);
    }
}

class RandomPasswordGenerator {

    public String generate(int passwordLength) {
        Random random = new Random();

        char[] password = new char[passwordLength];

        for (int i = 0; i < password.length; i++) {
            password[i] = (char) (random.nextInt(94) + 33);    // 33 - 127
        }

        return String.valueOf(password);
    }

}
