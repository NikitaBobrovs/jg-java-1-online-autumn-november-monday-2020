package students.jana_sergejenko.lesson_9.level_5.task_22;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount){
        this.trader=trader;
        this.amount=amount;
    }
    public Trader gettrader(){
        return trader;
    }
    public int getamount(){
        return amount;
    }
    @Override
    public String toString() {
        return "trader:" + this.trader + ", "
                + "amount:" + this.amount;
    }
}
