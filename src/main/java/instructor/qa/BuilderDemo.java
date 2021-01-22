package instructor.qa;

class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("123", "xx", null, "zz", null, "A");

        new BankAccountBuilder().build();

        BankAccount a2 = new BankAccount.Builder()
                .id("123")
                .owner("xx")
                .number("zz")
                .rating("A")
                .build();

        /*
        {
          "id": "123",
          "owner": "xx",
          "number": "zz",
          "rating": "A"
        }
         */

        new Foo()
                .setId("11")
                .setName("Bar");

        new StringBuilder()
                .append("")
                .toString();
    }
}

class Foo {

    private String id;
    private String name;

    public Foo setId(String id) {
        this.id = id;
        return this;
    }

    public Foo setName(String name) {
        this.name = name;
        return this;
    }
}

class BankAccount {

    private final String id;
    private final String owner;
    private final String currency;
    private final String number;
    private final String rate;
    private final String rating;

    public BankAccount(String id, String owner, String currency, String number, String rate, String rating) {
        this.id = id;
        this.owner = owner;
        this.currency = currency;
        this.number = number;
        this.rate = rate;
        this.rating = rating;
    }

    static class Builder {

        private String id;
        private String owner;
        private String currency;
        private String number;
        private String rate;
        private String rating;

        Builder id(String id) {
            this.id = id;
            return this;
        }

        Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        Builder number(String number) {
            this.number = number;
            return this;
        }

        Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        Builder rating(String rating) {
            this.rating = rating;
            return this;
        }

        BankAccount build() {
            return new BankAccount(id, owner, currency, number, rate, rating);
        }
    }
}

class BankAccountBuilder {

    private String id;
    private String owner;
    private String currency;
    private String number;
    private String rate;
    private String rating;

    BankAccountBuilder id(String id) {
        this.id = id;
        return this;
    }

    BankAccountBuilder owner(String owner) {
        this.owner = owner;
        return this;
    }

    BankAccountBuilder currency(String currency) {
        this.currency = currency;
        return this;
    }

    BankAccountBuilder number(String number) {
        this.number = number;
        return this;
    }

    BankAccountBuilder rate(String rate) {
        this.rate = rate;
        return this;
    }

    BankAccountBuilder rating(String rating) {
        this.rating = rating;
        return this;
    }

    BankAccount build() {
        return new BankAccount(id, owner, currency, number, rate, rating);
    }

}
