package students.jelena_kaverska.lesson_14.level_3_6;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

public class TransactionAnalysisServiceTest {

    private final TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    private final TransactionTestData testData = new TransactionTestData();

    @Test
    public void testTransactionsInYear2011() {
        List<Transaction> exp = List.of(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        List<Transaction> act = transactionAnalysisService.getTransactionsInYear(testData.getTransactions(), 2011);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testTransactionsInYear2012() {
        List<Transaction> exp = List.of(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        List<Transaction> act = transactionAnalysisService.getTransactionsInYear(testData.getTransactions(), 2012);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testTransactionsInYear2013() {
        List<Transaction> exp = new ArrayList<>();
        List<Transaction> act = transactionAnalysisService.getTransactionsInYear(testData.getTransactions(), 2013);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testSortedTransactionListByValueAsc() {
        List<Transaction> exp = List.of(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        List<Transaction> act = transactionAnalysisService.getSortedByValueAsc(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testSortedTransactionListByValueDesc() {
        List<Transaction> exp = Arrays.asList(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        exp.sort(Comparator.comparing(Transaction::getValue).reversed());
        List<Transaction> act = transactionAnalysisService.getSortedByValueDesc(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testFilteredAndSortedTransactionsByValueAsc() {
        List<Transaction> exp = List.of(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        List<Transaction> act = transactionAnalysisService.getTransactionsInYearAndSortByValueAsc(testData.getTransactions(), 2011);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllYearsUnique() {
        List<Integer> exp = List.of(2011, 2012);
        List<Integer> act = transactionAnalysisService.getTransactionYearsUnique(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllYearsUnique_1() {
        Set<Integer> exp = Set.of(2011, 2012);
        Set<Integer> act = transactionAnalysisService.getTransactionYearsUnique_1(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllYears() {
        List<Integer> exp = List.of(2011, 2012, 2011, 2012, 2012, 2012);
        List<Integer> act = transactionAnalysisService.getTransactionYears(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllTradersNamesUnique() {
        List<String> exp = Arrays.asList("Raoul", "Mario", "Alan", "Brian");
        List<String> act = transactionAnalysisService.getTransactionTradersNamesUnique(testData.getTransactions());
        exp.sort(Comparator.naturalOrder());
        act.sort(Comparator.naturalOrder());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllTradersNamesUnique_1() {
        Set<String> exp = Set.of("Raoul", "Mario", "Alan", "Brian");
        Set<String> act = transactionAnalysisService.getTransactionTradersNamesUnique_1(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllTradersCitiesUnique() {
        List<String> exp = Arrays.asList("Cambridge", "Milan");
        List<String> act = transactionAnalysisService.getUniqueCities(testData.getTransactions());
        exp.sort(Comparator.naturalOrder());
        act.sort(Comparator.naturalOrder());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAllTradersCitiesUnique_1() {
        Set<String> exp = Set.of("Cambridge", "Milan");
        Set<String> act = transactionAnalysisService.getUniqueCities_1(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testTradersNamesFromCity() {
        Set<String> exp = Set.of("Raoul", "Alan", "Brian");
        Set<String> act = transactionAnalysisService.getTradersNamesFromCity(testData.getTransactions(), "Cambridge");
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testTradersNamesFromCity_1() {
        Set<String> exp = Set.of("Mario");
        Set<String> act = transactionAnalysisService.getTradersNamesFromCity(testData.getTransactions(), "Milan");
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testTradersNamesFromCity_2() {
        Set<String> exp = new HashSet<>();
        Set<String> act = transactionAnalysisService.getTradersNamesFromCity(testData.getTransactions(), "London");
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAnyTraderFromCity() {
        boolean exp = true;
        boolean act = transactionAnalysisService.isTraderFromCity(testData.getTransactions(), "Milan");
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testAnyTraderFromCity_1() {
        boolean exp = false;
        boolean act = transactionAnalysisService.isTraderFromCity(testData.getTransactions(), "London");
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testMaxValue() {
        Optional<Integer> exp = Optional.of(1000);
        Optional<Integer> act = transactionAnalysisService.getMaxTransactionValue(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testMinValue() {
        Optional<Integer> exp = Optional.of(300);
        Optional<Integer> act = transactionAnalysisService.getMinTransactionValue(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testTradersNames() {
        String exp = "Alan,Brian,Mario,Raoul";
        String act = transactionAnalysisService.getTradersNames(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testTradersCities() {
        String exp = "Cambridge,Milan";
        String act = transactionAnalysisService.getTradersCities(testData.getTransactions());
        assertThat(act).isEqualTo(exp);
    }
}