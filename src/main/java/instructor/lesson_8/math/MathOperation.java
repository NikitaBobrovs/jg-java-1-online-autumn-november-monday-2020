package instructor.lesson_8.math;

class MathOperationDemo {

    public static void main(String[] args) {

        MathOperation[] operations = {
          new Addition(),
          new Addition(),
          new Subtraction(),
        };

        MathOperationPrinter printer = new MathOperationPrinter();
        printer.print(operations);

    }
}

class MathOperationPrinter {

    void print(MathOperation[] operations) {
        for (MathOperation operation : operations) {
            System.out.println(operation.getName() + ": " + operation.execute(2, 2));
        }
    }
}

abstract class MathOperation {

    private String name;

    public MathOperation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double execute(double a, double b);
}

class Addition extends MathOperation {

    public Addition() {
        super("+");
    }

    @Override
    double execute(double a, double b) {
        return a + b;
    }
}

class Subtraction extends MathOperation {

    public Subtraction() {
        super("-");
    }

    @Override
    double execute(double a, double b) {
        return a - b;
    }
}

