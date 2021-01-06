package students.jelena_kaverska.lesson_9.level_4.task_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class FraudDetector {

    boolean isFraud(Transaction t) {
        return isWrongTraderName(t) || isWrongAmount(t) || isWrongCity(t) || isWrongCountry(t) || isWrongCountryAndWrongAmount(t);
    }

    // Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.
    boolean isWrongTraderName(Transaction t) {
        return t.getTrader().getFullName().equalsIgnoreCase("Pokemon");
    }

    // Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.
    boolean isWrongAmount(Transaction t) {
        return t.getAmount() > 1000000;
    }

    // Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.
    boolean isWrongCity(Transaction t) {
        return t.getTrader().getCity().equalsIgnoreCase("Sydney");
    }

    // Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
    boolean isWrongCountry(Transaction t) {
        return t.getTrader().getCountry().equalsIgnoreCase("Jamaica");
    }

    Predicate<Transaction> isFraudCountry() {
        return t -> t.getTrader().getCountry().equalsIgnoreCase("Jamaica");
    }

    // Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.
    boolean isWrongCountryAndWrongAmount(Transaction t) {
        return t.getTrader().getCountry().equalsIgnoreCase("Germany")
                && t.getAmount() > 1000;
    }

    Predicate<Transaction> isWrongCountryAndWrongAmount2() {
        return t -> t.getTrader().getCountry().equalsIgnoreCase("Germany") &&
                t.getAmount() > 1000;
    }
}

class MyPrivateTest {
    public static void main(String[] args) {

        List<Transaction> trs = new ArrayList<>(List.of(
                new Transaction(new Trader("aaa", "Paris", "FR"), 500),
                new Transaction(new Trader("bbb", "QQQ", "Jamaica"), 1500000),
                new Transaction(new Trader("ddd", "Berlin", "Germany"), 10),
                new Transaction(new Trader("rrr", "Munich", "Germany"), 999)));
        boolean isAnyFraud = trs.stream()
                .anyMatch(new FraudDetector().isFraudCountry());
        System.out.println(isAnyFraud);

        boolean areAllFraud = trs.stream()
                .allMatch(new FraudDetector().isFraudCountry());
        System.out.println(areAllFraud);

        boolean isAnyFraud2 = trs.stream()
                .anyMatch(new FraudDetector().isWrongCountryAndWrongAmount2());
        System.out.println(isAnyFraud2);

        System.out.println(trs.stream().filter(new FraudDetector().isFraudCountry())
                .collect(Collectors.toList()));

        Transaction[] trs2 = {new Transaction(new Trader("aaa", "Paris", "FR"), 500),
                new Transaction(new Trader("bbb", "Oranjestad", "Aruba"), 15000),
                new Transaction(new Trader("ddd", "Berlin", "Germany"), 10),
                new Transaction(new Trader("rrr", "Munich", "Germany"), 999)};
        System.out.println(Arrays.toString(trs2));

        MyPrivateTest t = new MyPrivateTest();
        System.out.println(t.isAnyFraud(trs2));
    }

    boolean isAnyFraud(Transaction[] trs) {
        FraudDetector fd = new FraudDetector();
        for (Transaction tr : trs) {
            if (fd.isFraud(tr)) {
                return true;
            }
        }
        return false;
    }
}