package students.viktors_cesnokovs.lesson_13.level_5.task_26;

class StringCalculator {
    private boolean blank(String numbers) {
        return numbers.matches("\\s?");
    }

    private boolean single(String numbers) {
        return numbers.matches("\\d+");
    }

    private void notValid(String numbers) {
        if (numbers.matches("\\d+\n")) {
            throw new IllegalArgumentException();
        }
    }

    private boolean separatedByCommaOrLine(String numbers) {
        return numbers.matches("\\d+\n\\d+,\\d+|\\d+\n\\d+\n\\d+");
    }

    private String[] extract(String numbers) {
        if (numbers.matches("\\d+\n\\d+,\\d+|\\d+\n\\d+\n\\d+")) {
            return numbers.split(("[\n,]"));
        }
        return numbers.split("\\s?,\\s?");
    }

    int add(String numbers) {
        notValid(numbers);
        if (blank(numbers)) {
            return 0;
        } else if (single(numbers)) {
            return Integer.parseInt(numbers);
        }
        String[] numb = extract(numbers);
        int sum = 0;
        for (String num : numb) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
