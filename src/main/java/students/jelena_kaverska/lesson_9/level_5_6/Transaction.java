package students.jelena_kaverska.lesson_9.level_5_6;

class Transaction {
    private Trader trader;
    private int amount;

    public Trader getTrader() {
        return trader;
    }

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }

    public int getAmount() {
        return amount;
    }
}