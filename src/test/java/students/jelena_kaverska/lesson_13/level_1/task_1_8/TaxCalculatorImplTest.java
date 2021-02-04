package students.jelena_kaverska.lesson_13.level_1.task_1_8;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Assertions.*;

public class TaxCalculatorImplTest {

    private final TaxCalculator calculator = new TaxCalculatorImpl();

    @Test
    public void calculateTaxUnder20000Income() {
        BigDecimal exp = BigDecimal.valueOf(10000 * 0.25).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal act = calculator.calculateTax(new BigDecimal(10000)).setScale(2, RoundingMode.HALF_EVEN);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void calculateTaxUnder20000Income_1() {
        BigDecimal exp = BigDecimal.valueOf(100.55 * 0.25).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal act = calculator.calculateTax(new BigDecimal("100.55")).setScale(2, RoundingMode.HALF_EVEN);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void calculateTaxZeroIncome() {
        BigDecimal exp = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal act = calculator.calculateTax(new BigDecimal(0)).setScale(2, RoundingMode.HALF_EVEN);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void calculateTax20000Income() {
        BigDecimal exp = BigDecimal.valueOf(20000 * 0.25).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal act = calculator.calculateTax(new BigDecimal(20000)).setScale(2, RoundingMode.HALF_EVEN);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void calculateTaxOver20000() {
        BigDecimal exp = new BigDecimal("9000").setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal act = calculator.calculateTax(new BigDecimal("30000")).setScale(2, RoundingMode.HALF_EVEN);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void calculateTaxOver20000_1() {
        BigDecimal exp = new BigDecimal("33000").setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal act = calculator.calculateTax(new BigDecimal("90000")).setScale(2, RoundingMode.HALF_EVEN);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void calculateTaxOver20000_2() {
        BigDecimal exp = new BigDecimal("37080.22").setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal act = calculator.calculateTax(new BigDecimal("100200.55")).setScale(2, RoundingMode.HALF_EVEN);
        assertThat(act).isEqualTo(exp);
    }
}