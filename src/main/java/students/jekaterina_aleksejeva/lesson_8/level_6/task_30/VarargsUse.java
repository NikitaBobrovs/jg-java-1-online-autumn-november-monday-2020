package students.jekaterina_aleksejeva.lesson_8.level_6.task_30;

class VarargsUse {

    void toDoAfterCovid (int priority, String...todos) {
        System.out.println("Post-pandemia to-do's list priority Nr " + priority);
        for (String s: todos) {
            System.out.println(s);
        }
    }
}

class VarargsUseDemo{
    public static void main(String[] args) {
        VarargsUse demo = new VarargsUse();
        demo.toDoAfterCovid(1,"go to Paris", "make movie about Paris");
        demo.toDoAfterCovid(2, "make party for family friends","show movie about Paris", "make party for their children");
        demo.toDoAfterCovid(3,"finally! buy a puppy", "introduce it to Bass cat");
    }
}
