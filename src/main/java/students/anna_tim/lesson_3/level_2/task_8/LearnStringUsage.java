package students.anna_tim.lesson_3.level_2.task_8;

class LearnStringUsage {
    public static void main(String[] args) {

        String myName = "Anya";
        System.out.println("Hi "+myName+"! ;)");


        //trying also concat()
        String s1 = "Hello ";
        String s2 = "World ";
        String s3 = s1.concat(s2);
        System.out.println(s3);

        String s4 = s2.concat(s1);
        System.out.println(s4);
        }
}

