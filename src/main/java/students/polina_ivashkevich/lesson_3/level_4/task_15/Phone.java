package students.polina_ivashkevich.lesson_3.level_4.task_15;

public class Phone {
    String model;

        Phone (String newModel) {
            this.model = newModel;
        }

        String getModel() {
            return this.model;
        }


    class PhoneDemo {

        public  void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }
}
