package students.jekaterina_aleksejeva.lesson_8.level_1.task_2;

class CompanyDemo {
    public static void main(String[] args) {
        Company registered = new Company();
        System.out.println("Template: ");
        System.out.println("Company registered under " + registered.name + "name");
        System.out.println("Company registered with share capital, EUR " + registered.shareCapital);
    }
}
