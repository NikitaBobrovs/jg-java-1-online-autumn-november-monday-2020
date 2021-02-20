package students.jelena_kaverska.lesson_14.level_3_6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static java.util.stream.Collectors.*;

class TransactionAnalysisService {

    List<Transaction> getTransactionsInYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(tr -> tr.getYear() == year)
                .collect(toList());
    }

    List<Transaction> getSortedByValueAsc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(toList());
    }

    List<Transaction> getSortedByValueDesc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(toList());
    }

    List<Transaction> getTransactionsInYearAndSortByValueAsc(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(toList());
    }

    List<Integer> getTransactionYearsUnique(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(toList());
    }

    Set<Integer> getTransactionYearsUnique_1(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(toSet());
    }


    List<Integer> getTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(toList());
    }

    List<String> getTransactionTradersNamesUnique(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .collect(toList());
    }

    Set<String> getTransactionTradersNamesUnique_1(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(toSet());
    }


    List<String> getUniqueCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(toList());
    }

    Set<String> getUniqueCities_1(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(toSet());
    }

    Set<String> getTradersNamesFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(t -> t.getCity().equals(city))
                .map(Trader::getName)
                .collect(toSet());
    }

    boolean isTraderFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .anyMatch(tr -> tr.getTrader().getCity().equals(city));
    }

    boolean isTraderFromCity_1(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(t -> t.getCity().equals(city));
    }

    Optional<Integer> getMaxTransactionValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .max(Comparator.comparing(Integer::intValue));
    }

    Optional<Integer> getMinTransactionValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .min(Comparator.comparing(Integer::intValue));
    }

    Optional<Integer> getMinTransactionValue_1(List<Transaction> transactions) {
        return transactions.stream()
                .min(Comparator.comparingInt(Transaction::getValue))
                .map(Transaction::getValue);
    }

    String getTradersNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(joining(","));
    }

    String getTradersCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(joining(","));
    }
}