package students.nikita_bobrovs.lesson_15.level_2.task_9;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return isTraderNamePokemon(trader) || (isTraderCitySidney(trader));
    }

    private boolean isTraderNamePokemon(Trader trader) {
        return trader.getFullName().equals("Pokemon");
    }

    private boolean isTraderCitySidney(Trader trader) {
        return trader.getCity().equals("Sidney");
    }
}
