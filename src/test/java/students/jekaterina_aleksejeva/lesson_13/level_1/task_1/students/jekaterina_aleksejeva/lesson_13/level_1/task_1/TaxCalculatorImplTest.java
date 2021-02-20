package students.jekaterina_aleksejeva.lesson_13.level_1.task_1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.*;

public class TaxCalculatorImplTest {
    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal(10000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("2500.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncome19999() {
        var income = new BigDecimal(19999);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("4999.75"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncome19999_99() {
        var income = new BigDecimal(19999.9);
        var taxToPay = taxCalculator.calculateTax(income).setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(taxToPay, new BigDecimal("4999.98"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal(20000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("5000.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncome20000_90() {
        var income = new BigDecimal(20000.9);
        var taxToPay = taxCalculator.calculateTax(income).setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(taxToPay, new BigDecimal("5000.36"));
    }

    @Test
    public void shouldPay40PercentTaxWhenIncomeEqualTo20001() {
        var income = new BigDecimal(20001);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("5000.40"));
    }

    @Test
    public void shouldPay40PercentTaxWhenIncomeBiggerThen20000() {
        var income = new BigDecimal(30000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("9000.00"));
    }

}