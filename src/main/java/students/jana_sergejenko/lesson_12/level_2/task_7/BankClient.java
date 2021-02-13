package students.jana_sergejenko.lesson_12.level_2.task_7;

class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

   BankClient(String uid, String fullName){
       this.fullName=fullName;
       this.uid=uid;
   }

    // создайте get() методы для каждого из свойств
    public String getUid() {
        return this.uid;
    }
    public String getfullName() {
        return this.fullName;
    }


}