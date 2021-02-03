package students.jelena_kaverska.lesson_13.level_1.task_1_8;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    //доход до 20000 облагается 25% налогом
    //доход свыше 20000 облагается 40% налогом

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal(20000)) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        }
        BigDecimal taxOver = income.subtract(new BigDecimal("20000")).multiply(new BigDecimal("0.40"));
        BigDecimal taxUnder = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
        return taxOver.add(taxUnder);
    }
}

class My {
    public static void main(String[] args) {
        BigDecimal income = new BigDecimal("100.55");
        TaxCalculator calculator = new TaxCalculatorImpl();
        BigDecimal tax = calculator.calculateTax(income);
        System.out.println(tax);
    }
}