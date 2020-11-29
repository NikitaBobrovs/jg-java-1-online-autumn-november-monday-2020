package students.anna_tim.lesson_3.level_2.task_10;

class CompareStrings {
    public static void main(String[] args) {
     // equals() method
        //boolean equals (Object str)
        //It compares the content of the strings.
     //  == operator
        //The double equal (==) operator compares two object references to check whether they refer to same instance.
     // CompareTo() method


        // equals() method
        String s = "Hell";
        String s1 = "Hello";
        String s2 = "Hello";
        boolean b = s1.equals(s2);    //true
        System.out.println(b);
        b =	s.equals(s1) ;   //false
        System.out.println(b);

        //  == operator
        String s3 = "Java";
        String s4 = "Java";
        String s5 = new String ("Java");
        boolean c = (s3 == s4);     //true
        System.out.println(c);
        c =	(s3 == s5);      //false
        System.out.println(c);

    }
}

