package instructor.lesson_7.debit;

class DebitCardDemo {

    public static void main(String[] args) {

        DebitCard masterCard = new DebitCard();

        System.out.println("masterCard.balance() = " + masterCard.balance());

        System.out.println("masterCard.deposit(100) = " + masterCard.deposit(100));
        System.out.println("masterCard.withdraw(50) = " + masterCard.withdraw(50));

        System.out.println("masterCard.withdraw(200) = " + masterCard.withdraw(200));

        System.out.println("masterCard.deposit(-5) = " + masterCard.deposit(-5));
        System.out.println("masterCard.withdraw(-5) = " + masterCard.withdraw(-5));

        System.out.println("masterCard.balance() = " + masterCard.balance());
    }
}
