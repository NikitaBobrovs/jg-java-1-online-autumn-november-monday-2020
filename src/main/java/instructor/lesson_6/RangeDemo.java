package instructor.lesson_6;

public class RangeDemo {

    public static void main(String[] args) {

        Range range1 = new Range(0, 10);
        range1.printInfo();

        Range range2 = Range.ofLeftBound(-7);
        range2.printInfo();

        Range range3 = Range.ofRightBound(7);
        range3.printInfo();

    }

}

class Range {

    int leftBound;
    int rightBound;

    public Range(int leftBound, int rightBound) {
        this.leftBound = leftBound;
        this.rightBound = rightBound;
    }

    public static Range ofLeftBound(int leftBound) {
        return new Range(leftBound, 0);
    }

    public static Range ofRightBound(int rightBound) {
        return new Range(0, rightBound);
    }

 /*   public Range(int leftBound) {
        this.leftBound = leftBound;
        this.rightBound = 0;
    }

    public Range(int rightBound) {
        this.leftBound = 0;
        this.rightBound = rightBound;
    }
*/
    public void printInfo() {
        System.out.println("[" + leftBound + ":" + rightBound + "]");
    }

}
