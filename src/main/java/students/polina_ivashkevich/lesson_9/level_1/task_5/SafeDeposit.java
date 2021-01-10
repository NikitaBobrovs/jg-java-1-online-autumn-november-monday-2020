package students.polina_ivashkevich.lesson_9.level_1.task_5;

 class SafeDeposit {

     private String pinCode;
     private double amount;

     public SafeDeposit(String pinCode, double amount) {
         this.pinCode = pinCode;
         this.amount = amount;
     }

     public boolean getMoney(String pinCode, double amount) {
         if (this.pinCode.equalsIgnoreCase(pinCode) && amount <= this.amount) {
             this.amount -= amount;
             return true;
         }
         return false;
     }

     public boolean putMoney(String pinCode, double amount) {
         if (this.pinCode.equalsIgnoreCase(pinCode)) {
             this.amount += amount;
             return true;
         }
            return false;

     }
     public double getAmount() {
         return amount;

     }
 }
 class SafeDepositDemo {
     public static void main(String[] args) {
         SafeDeposit safe = new SafeDeposit("945pe32", 132);
         System.out.println("Amount available: " + safe.getAmount());
         System.out.println("Wrong pin code: " + safe.getMoney("5fgdjjt6",3432));
         System.out.println("Correct pin code and withdraw: " + safe.getMoney("5fgdjjt6", 3432));
         System.out.println("............download");
         System.out.println("Correct pin code and deposit:" + safe.putMoney("4534kdfs" , 3390));
         System.out.println("Current amount available: " + safe.getAmount());
         System.out.println("Un correct pin code and deposit: " + safe.putMoney("fr53hg" , 545));
         System.out.println(("Current amount unchanged: " + safe.getAmount()));
         System.out.println("download............");
         System.out.println("Correct pin code but not enought amount: " + safe.getMoney("534jjku" , 88765));
         System.out.println("Current amount unchanged: " + safe.getAmount());
      }
 }