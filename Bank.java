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
  
    
    Thread t1 = new Thread(new runnableThread(), "t1");
    Thread t2 = new Thread(new runnableThread(), "t2");
    System.out.println("Starting Runnable threads");
    t1.start();
    t2.start();
    System.out.println("Runnable Threads has been started");
    Thread t3 = new extendThread("t3");
    Thread t4 = new extendThread("t4");
    System.out.println("Starting MyThreads");
    t3.start();
    t4.start();
    System.out.println("MyThreads has been started");
    }
}
