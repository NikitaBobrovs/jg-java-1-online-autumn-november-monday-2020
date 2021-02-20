package students.jekaterina_aleksejeva.lesson_12.level_4.task_26;

class SOF_Example {

    public void callStackOverflowError(int i){
        callStackOverflowError(i);
        System.out.println("SOF example" + i);
    }

    public static void main(String[] args) {
        SOF_Example demo = new SOF_Example();
        demo.callStackOverflowError(100);
    }

}
