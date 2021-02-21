package students.jekaterina_aleksejeva.lesson_15.level_2.task_9;

class FraudDetector {

    boolean isFraudTrader(Trader trader) {
        return isFraudNamePokemon(trader) || isFraudCitySidney(trader);
    }

    boolean isFraudNamePokemon(Trader trader) {
        return trader.getFullName().equals("Pokemon");
    }

    boolean isFraudCitySidney(Trader trader) {
        return trader.getCity().equals("Sidney");
    }

}
