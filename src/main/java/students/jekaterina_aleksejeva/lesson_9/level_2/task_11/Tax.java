package students.jekaterina_aleksejeva.lesson_9.level_2.task_11;

class Tax {
    String name;
    double percentage;
    String country;

    protected Tax(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public Tax(String name, double percentage, String country) {
        this(name, percentage);
        this.country = country;
    }

    String taxPayment() {
        return name + " at current rate: " + percentage + " %" + " in " + country;
    }

}

class CorporationTax extends Tax {
    private boolean paid;

    public CorporationTax(String name, double percentage, String country) {
        super(name, percentage, country);
        this.paid = true;
    }

    String taxPayment() {

        return super.taxPayment() + " is paid" + " = " + paid;
    }

}

class VatTax extends Tax {
    private boolean indirect;

    public VatTax(String name, double percentage, String country) {
        super(name, percentage, country);
        this.indirect = true;
    }

    String taxPayment() {

        return super.taxPayment() + " is charged in the invoice" + " = " + indirect;
    }

}

class Demo {
    public static void main(String[] args) {
        CorporationTax ct = new CorporationTax("Corporation tax", 19, " the UK");
        VatTax vt = new VatTax("VAT", 16, "Germany");
        System.out.println(ct.taxPayment());
        System.out.println(vt.taxPayment());

    }
}
