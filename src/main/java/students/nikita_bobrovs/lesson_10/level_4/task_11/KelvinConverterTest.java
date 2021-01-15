package students.nikita_bobrovs.lesson_10.level_4.task_11;

class KelvinConverterTest {
    public static void main(String[] args) {
        KelvinConverterTest subject = new KelvinConverterTest();
        subject.convertTest();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    KelvinConverter kelvinConverter = new KelvinConverter();

    void convertTest() {
        System.out.println("Convert to kelvin test : " + testResult
                (323.15 == kelvinConverter.convert(50)));
    }
}
