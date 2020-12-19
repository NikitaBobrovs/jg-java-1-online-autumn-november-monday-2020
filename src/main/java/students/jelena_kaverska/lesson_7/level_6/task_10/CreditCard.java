package students.jelena_kaverska.lesson_7.level_6.task_10;

class CreditCard {
    private String number;
    private String pin;
    private double balance;
    private double limit;
    private double debt;

    CreditCard(String number, String pin) {
        this.number = number;
        this.pin = pin;
        balance = 0;
        debt = 0;
    }

    public boolean deposit(String pin, double amount) {
        if (this.pin.equals(pin)) {
            //В первую очередь зачисление покрывает задолженность по кредиту;
            if (debt > 0) {
                debt -= amount;
                if (debt < 0) {
                    balance += -debt;
                    debt = 0;
                }
                //case: no debt
            } else {
                balance += amount;
                return true;
            }
        }
        return false;
    }

    public boolean withdraw(String pin, double amount) {
        //Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
        if (this.pin.equals(pin)) {
            if (amount <= balance) {
                balance -= amount;
                return true;
                //В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту
            } else if (debt <= limit) {
                debt += -(balance - amount);
                balance = 0;
                return true;
                //Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean changeLimit(String pin, double amount) {
        if (this.pin.equals(pin)) {
            limit = amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public double getDebt() {
        return debt;
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                ", limit=" + limit +
                ", debt=" + debt +
                '}';
    }

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("123454", "8888");
        System.out.println(creditCard.toString());
        creditCard.changeLimit("8888", 1000);
        System.out.println(creditCard.toString());
        System.out.println(creditCard.deposit("8888", 3000));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.withdraw("8888", 4500));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.withdraw("8888", 875));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.deposit("8888", 2000));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.withdraw("8888", 875));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.deposit("8888", 300));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.deposit("8888", 80));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.deposit("8888", 10));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.withdraw("8888", 1500));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.withdraw("8888", 1));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.changeLimit("8888", 1485));
        System.out.println("upd limit: " + creditCard.toString());
        System.out.println(creditCard.withdraw("8888", 1));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.withdraw("8888", 1));
        System.out.println(creditCard.toString());

        System.out.println(creditCard.deposit("8899", 100));

    }
}