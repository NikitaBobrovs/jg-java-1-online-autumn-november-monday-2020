package students.nikita_bobrovs.lesson_14.transaction_analysis_service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    List<Transaction> sortTransactions(List<Transaction> transactions, Comparator<Transaction> comparator) {
        return transactions.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    List<Transaction> sortTransactionsLowToHighOfSetYear(List<Transaction> transactions, int year) {
        return sortTransactions(findTransactionsByYear(transactions, year), new SortByValueLowToHighComparator());
    }

    List<Integer> getAllTransactionYears(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    List<Integer> getAllUniqueTransactionYears(List<Transaction> transactions){
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    List<String> getAllUniqueTraderNames(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.toList());
    }

    List<String> getAllUniqueTraderCities(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    List<String> getAllTraderNamesFromSetCity(List<Transaction> transactions,String city){
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.toList());
    }

    boolean isAnyTraderBasedOnCity(List<Transaction> transactions,String city){
        return transactions.stream().anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

    Optional<Integer> getHighestValueOfAll(List<Transaction> transactions){
        Optional<Transaction> t = transactions.stream().max(Comparator.comparingInt(Transaction::getValue));
        return t.map(Transaction::getValue).or(Optional::empty);
    }

    Optional<Integer> getLowestValueOfAll(List<Transaction> transactions){
        Optional<Transaction> t = transactions.stream().min(Comparator.comparingInt(Transaction::getValue));
        return t.map(Transaction::getValue).or(Optional::empty);
    }

    String getAllTraderNamesInString(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

    String getAllTraderCitiesInString(List<Transaction> transactions){
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }
}
