package students.polina_ivashkevich.lesson_8.level_3.task_11;

public class LoanSystemCreate {
}
 abstract class LoanSystem{

        private String bank;
        private int sum;
        private String card;

        private  void bankPay(){

        }

        private void sumPay(){

        }
        public String getCard(){
            return card;
        }
        public String getBank(){
            return bank;
        }
        public int getSum(){
            return sum;
        }
        public String setCard(String card){
            return this.card = card;
        }

        public String setBank(String bank){
            return this.bank = bank;
        }

        public int setSum(int sum){
            return this.sum = sum;
        }

        public static class myLoanSystem extends LoanSystem{
            public void bankPay(){
                System.out.println("Я иду в банк");
            }
            public void sumPay(){
                System.out.println("Нужно заплатить $50");
            }
        }
}



