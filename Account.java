public class Account {
   private int account_number =868776;
   private int account_balance =200;
    
    public int getAccount_number() {
        return account_number;
    }
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
    public int getAccount_balance() {
        return account_balance;
    }
    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }
    public int  credit( int deposit) {
        this.account_balance += deposit;
        return this.account_balance;
    }
    public int  debit( int debit) {
        this.account_balance -= debit;
        return this.account_balance;
    }
    public void showData() {
        System.out.println("Acoount number "+getAccount_number());
        System.out.println("Account balance "+getAccount_balance());
    }
    
}
