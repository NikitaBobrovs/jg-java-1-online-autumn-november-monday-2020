package students.jelena_kaverska.lesson_13.level_5.task_26_30;

class StringCalculator {

    int add(String numbers) {
        if (numbers.matches("\\d+\n")) {
            throw new IllegalArgumentException();
        } else if (numbers.matches("\\s?")) { //blank or empty
            return 0;
        } else if (numbers.matches("\\d+")) { //one
            return Integer.parseInt(numbers);
        } else if (numbers.matches("\\d+\n\\d+,\\d+|\\d+\n\\d+\n\\d+")) {
            String[] nums = numbers.split(("[\n,]")); //multiple with n
            int sum = 0;
            for (String num : nums) {
                sum += Integer.parseInt(num);
            }
            return sum;
        }
        String[] nums = numbers.split("\\s?,\\s?"); //multiple
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}