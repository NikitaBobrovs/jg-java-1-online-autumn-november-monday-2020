package students.jekaterina_aleksejeva.lesson_13.level_1.task_1;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            var incomeBiggerThen20000 = income.subtract(new BigDecimal("20000"));
            var taxAfter20000 = incomeBiggerThen20000.multiply(new BigDecimal("0.40"));
            var taxBefore20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            return taxBefore20000.add(taxAfter20000);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        TaxCalculator demo = new TaxCalculatorImpl();
        BigDecimal tax25 = demo.calculateTax(BigDecimal.valueOf(18000));
        System.out.println("Tax for income 18000 = " + tax25);
        BigDecimal tax40 = demo.calculateTax(BigDecimal.valueOf(20100));
        System.out.println("Tax for income 20100 = " + tax40);
    }

}

