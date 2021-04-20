
class Bank{

   public static void main(String[] args) {
     System.out.println("-----------------------------------------------------------------");
     System.out.println("------------------------Welcome-----------------------------------");
     Account account = new Account();
     account.setAccount_balance(10000);
     account.credit(500);
     account.debit(1000);
     account.showData();
    }
}
