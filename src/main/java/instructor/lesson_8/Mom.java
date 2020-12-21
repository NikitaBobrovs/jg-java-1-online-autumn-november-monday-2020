package instructor.lesson_8;

class InheritanceDemo {

    public static void main(String[] args) {

        Mom mom = new Mom("Black");
        Daughter daughter = new Daughter("Pink");
        GrandDaughter grandDaughter = new GrandDaughter("Blue");

        daughter.hasPiercing = true;

        System.out.println("mom.hairColor = " + mom.hairColor);
        System.out.println("daughter.hairColor = " + daughter.hairColor);

        mom.cookBorsch();
        System.out.println("---");
        daughter.cookBorsch();
        System.out.println("---");
        grandDaughter.cookBorsch();

    }
}

public class Mom {

    protected String hairColor;

    public Mom(String hairColor) {
        this.hairColor = hairColor;
    }

    protected void cookBorsch() {
        System.out.println("Mom: I'm cooking delicious borsch!");
    }
}

class Daughter extends Mom {

    boolean hasPiercing;

    public Daughter(String hairColor) {
        super(hairColor);
        this.hasPiercing = true;
    }

    @Override
    protected void cookBorsch() {
        super.cookBorsch();
        System.out.println("Daughter: I'm cooking delicious borsch!");
        super.cookBorsch();
    }
}

class GrandDaughter extends Daughter {

    public GrandDaughter(String hairColor) {
        super(hairColor);
    }


}
