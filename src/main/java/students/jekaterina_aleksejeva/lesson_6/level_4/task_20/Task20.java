package students.jekaterina_aleksejeva.lesson_6.level_4.task_20;

class WhileLoopContinue {
    public static void main(String[] args) {

        int i= 1;
        while (i < 10) {
            int quadratic = i*i;
            if (i == 6) {
                continue;

            }

            System.out.println("Quadratic degree of " + i + " = " + quadratic);
            i++;

        }

    }

}

class ForLoopContinue {
    public static void main(String[] args) {

        for (int i = 0; i <=10; i++) {
            int sum = i + 10;
                if (i >= 8) {
                    continue;

                }
            System.out.println("Sum of 10 and " + i + " = " + sum);
        }

    }

}