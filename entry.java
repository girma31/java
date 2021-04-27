public class entry {
    static final String ACCOUNTS_HEADING = "Account No|Owner|Balance";
    static final String TRANSACTIONS_HEADING = "Date|Time|D/W|Amount|Balance";
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
     
       /*
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
       */
      //Create test accounts
    Bank bank = new Bank();
    bank.addAccount("101", "Alison");
    bank.addAccount("202", "Bill");
    bank.addAccount("303", "Carol");
    bank.addAccount("404", "Alison");
        
    //1. Print out the total account list.
    System.out.println("1. Print out the total account list.");
    Account[] accounts = bank.getAccounts();
    int totalAccount = bank.getTotalAccount();
    System.out.println(ACCOUNTS_HEADING);
    for (int i = 0; i < totalAccount; i++) {
      System.out.println(accounts[i]);
    }

    System.out.println();
                
    //2. Deposit $ 10 into 101 account.
    System.out.println("2. Deposit $ 10 into 101 account.");        
    Account alison = bank.getAccount("101");
    alison.deposit(10);
    System.out.println(ACCOUNTS_HEADING);
    System.out.println(alison);

    System.out.println();
                
    //3. Withdraw $ 5 from 101 account.
    System.out.println("3. Withdraw $ 5 from 101 account.");        
    alison.withdraw(5);
    System.out.println(ACCOUNTS_HEADING);
    System.out.println(alison);

    System.out.println();
                
    //4. Print transaction history of the 101 account.
    System.out.println("4. Print transaction history of the 101 account.");        
    Transaction[] transactions = alison.getTransactions();
    int totalTransaction = alison.getTotalTransaction();
    System.out.println(TRANSACTIONS_HEADING);
    for (int i = 0; i < totalTransaction; i++) {
      System.out.println(transactions[i]);
    }

    System.out.println();
        
    //5. Find your account by customer name.
    System.out.println("5. Find Alison's Account.");
    Account[] matched = bank.findAccountByName("Alison");
    System.out.println(ACCOUNTS_HEADING);
    for (Account account : matched) {
      System.out.println(account);
    }
    }
}
