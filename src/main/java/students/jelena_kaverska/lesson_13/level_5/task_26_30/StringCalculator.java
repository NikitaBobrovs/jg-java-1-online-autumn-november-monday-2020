package students.jelena_kaverska.lesson_13.level_5.task_26_30;

class StringCalculator {

    private boolean isBlank(String numbers) {
        return numbers.matches("\\s?");
    }

    private boolean isSingle(String numbers) {
        return numbers.matches("\\d+");
    }

    private void isNotValid(String numbers) {
        if (numbers.matches("\\d+\n")) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isSeparatedByCommaOrLine(String numbers) {
        return numbers.matches("\\d+\n\\d+,\\d+|\\d+\n\\d+\n\\d+");
    }

    private String[] extract(String numbers) {
        if (numbers.matches("\\d+\n\\d+,\\d+|\\d+\n\\d+\n\\d+")) { //multiple with n or ,
            return numbers.split(("[\n,]"));
        }
        return numbers.split("\\s?,\\s?"); //multiple with , with optional \s
    }

    int add(String numbers) {
        isNotValid(numbers);
        if (isBlank(numbers)) { //blank or empty
            return 0;
        } else if (isSingle(numbers)) { //one
            return Integer.parseInt(numbers);
        }
        String[] nums = extract(numbers);
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}