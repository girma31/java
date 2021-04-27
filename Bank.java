import java.util.Scanner;

class Bank{

   public static void main(String[] args) {
     System.out.println("-----------------------------------------------------------------");
     System.out.println("------------------------Welcome-----------------------------------");
     /*
              what do want 
              deposit 
              withdraw
              transfer
              check balance
              pay bill


     */
    /*
     Account account = new Account();
     System.out.println("Enter amount of withdraw");
     Scanner  scnr = new Scanner(System.in);
     int amount = scnr.nextInt();
     account.setAccount_balance(amount);
     account.credit(500);
     account.debit(1000);
     account.showData();
     */
    extendThread th = new extendThread();
    th.start();
    }
}
