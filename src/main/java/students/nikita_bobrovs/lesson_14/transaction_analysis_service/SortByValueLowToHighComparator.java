package students.nikita_bobrovs.lesson_14.transaction_analysis_service;

import java.util.Comparator;

public class SortByValueLowToHighComparator implements Comparator<Transaction> {
    @Override
    public int compare(Transaction value1, Transaction value2) {
        return value1.getValue() - value2.getValue();
    }
}
