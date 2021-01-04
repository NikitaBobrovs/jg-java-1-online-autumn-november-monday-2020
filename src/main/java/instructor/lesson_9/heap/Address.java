package instructor.lesson_9.heap;

class Demo {

    public static void main(String[] args) {

        Street street = new Street("Latvia", "Riga", "Brivibas", "13", "37");
        PostCode postCode = new PostCode("LV", "1234");

        Address address = new Address(street, postCode);

        address.getStreet().country = "Lithuania";

    }
}

class Address {

    private final Street street;
    private final PostCode postCode;

    public Address(Street street, PostCode postCode) {
        this.street = street;
        this.postCode = postCode;
    }

    public Street getStreet() {
        return street;
    }

    public PostCode getPostCode() {
        return postCode;
    }
}

class PostCode {

    public String code;
    public String index;

    public PostCode(String code, String index) {
        this.code = code;
        this.index = index;
    }
}

class Street {

    public String country;
    public String city;
    public String street;
    public String building;
    public String apartment;

    public Street(String country, String city, String street, String building, String apartment) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
    }
}
