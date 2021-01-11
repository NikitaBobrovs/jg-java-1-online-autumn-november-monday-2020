package instructor.lesson_10;

class PaymentDemo {

    public static void main(String[] args) {

        Payment payment = new PayPalPayment("foo@mail.com", "bar@mail.com");
        //new BankPayment("LV1234", "LV5678");
        payment.pay(50);

    }
}

interface Payment {

    boolean pay(int amount);

}

class BankPayment implements Payment {

    private String sourceAccount;
    private String targetAccount;

    public BankPayment(String sourceAccount, String targetAccount) {
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Transferring via bank " + amount + "EUR from " + sourceAccount + " to " + targetAccount);
        return true;
    }
}

class PayPalPayment implements Payment {

    private String sourceEmail;
    private String targetEmail;

    public PayPalPayment(String sourceEmail, String targetEmail) {
        this.sourceEmail = sourceEmail;
        this.targetEmail = targetEmail;
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Transferring via PayPal " + amount + "EUR from " + sourceEmail + " to " + targetEmail);
        return true;
    }
}
