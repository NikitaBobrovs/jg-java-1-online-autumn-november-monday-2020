package students.nikita_bobrovs.lesson_14.transaction_analysis_service;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class TransactionAnalysisServiceTest {
    TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    List<Transaction> testData = new TransactionTestData().getTransactions();

    @Test
    void shouldFindTransactionsByYear() {
        List<Transaction> transactions = List.of(
                new Transaction(new Trader("Brian","Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        assertThat(transactions).isEqualTo(transactionAnalysisService.findTransactionsByYear(testData,2011));
    }

    @Test
    void shouldFindTransactionsByYearEmpty(){
        assertThat(transactionAnalysisService.findTransactionsByYear(testData,2010)).isEmpty();
    }

    @Test
    void shouldSortByLowToHighPredicate(){
        List<Transaction> transactions = List.of(
                new Transaction(new Trader("Brian","Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario","Milan"), 2012, 700),
                new Transaction(new Trader("Mario","Milan"), 2012, 710),
                new Transaction(new Trader("Alan","Cambridge"), 2013, 950),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        assertThat(transactions)
                .isEqualTo(transactionAnalysisService.sortTransactions(testData,new SortByValueLowToHighComparator()));
    }

    @Test
    void shouldSortByHighToLowPredicate(){
        List<Transaction> transactions = List.of(
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Alan","Cambridge"), 2013, 950),
                new Transaction(new Trader("Mario","Milan"), 2012, 710),
                new Transaction(new Trader("Mario","Milan"), 2012, 700),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Brian","Cambridge"), 2011, 300));
        assertThat(transactions)
                .isEqualTo(transactionAnalysisService.sortTransactions(testData,new SortByValueHighToLowComparator()));
    }

    @Test
    void shouldSortByLowToHighPredicateOfSetYear(){
        List<Transaction> transactions = List.of(
                new Transaction(new Trader("Brian","Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        assertThat(transactions)
                .isEqualTo(transactionAnalysisService.sortTransactionsLowToHighOfSetYear(transactions,2011));
    }

    @Test
    void shouldFindAllTransactionYears(){
        List<Integer> years = List.of(2011,2012,2011,2012,2012,2013);
        assertThat(years)
                .isEqualTo(transactionAnalysisService.getAllTransactionYears(testData));
    }

    @Test
    void shouldFindAllUniqueTransactionYears(){
        List<Integer> years = List.of(2011,2012,2013);
        assertThat(years)
                .isEqualTo(transactionAnalysisService.getAllUniqueTransactionYears(testData));
    }

    @Test
    void shouldFindAllUniqueTraderNames(){
        List<String> names = List.of("Brian","Raoul","Mario","Alan");
        assertThat(names)
                .isEqualTo(transactionAnalysisService.getAllUniqueTraderNames(testData));
    }

    @Test
    void shouldFindAllUniqueTraderCities(){
        List<String> cities = List.of("Cambridge","Milan");
        assertThat(cities)
                .isEqualTo(transactionAnalysisService.getAllUniqueTraderCities(testData));
    }

    @Test
    void shouldFindAllTradersFromSetCity(){
        List<String> namesFromCambridge = List.of("Brian","Raoul","Alan");
        assertThat(namesFromCambridge)
                .isEqualTo(transactionAnalysisService.getAllTraderNamesFromSetCity(testData,"Cambridge"));
    }

    @Test
    void shouldTrueIfAnyTraderBasedOnSetCity(){
        assertThat(transactionAnalysisService.isAnyTraderBasedOnCity(testData,"Milan")).isTrue();
    }

    @Test
    void shouldFalseIfNoTraderBasedOnSetCity(){
        assertThat(transactionAnalysisService.isAnyTraderBasedOnCity(testData,"London")).isFalse();
    }

    @Test
    void shouldGetHighestValueTransaction(){
        assertThat(Optional.of(1000)).isEqualTo(transactionAnalysisService.getHighestValueOfAll(testData));
    }

    @Test
    void shouldGetHighestValueTransactionEmptyList(){
        List<Transaction> emptyList= new ArrayList<>();
        assertThat(Optional.empty()).isEqualTo(transactionAnalysisService.getHighestValueOfAll(emptyList));

    }

    @Test
    void shouldGetLowestValueTransaction(){
        assertThat(Optional.of(300)).isEqualTo(transactionAnalysisService.getLowestValueOfAll(testData));
    }

    @Test
    void shouldGetLowestValueTransactionEmptyList(){
        List<Transaction> emptyList= new ArrayList<>();
        assertThat(Optional.empty()).isEqualTo(transactionAnalysisService.getLowestValueOfAll(emptyList));

    }

    @Test
    void shouldGetAllTradersUniqueNamesInString(){
        String names = "Alan,Brian,Mario,Raoul";
        assertThat(names).isEqualTo(transactionAnalysisService.getAllTraderNamesInString(testData));
    }

    @Test
    void shouldGetAllTradersUniqueCitiesInString(){
        String names = "Cambridge,Milan";
        assertThat(names).isEqualTo(transactionAnalysisService.getAllTraderCitiesInString(testData));
    }
}