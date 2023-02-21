public class YourFirstAccount {
    public static void main(String[] args) {
        // Do not touch the code in Account.java

        // create a new account object with the name "Volkan" and an initial balance of
        // 100.00
        Account testVolkanAccount = new Account("Volkan", 100.00);

        // deposit 20.00 into the account
        testVolkanAccount.deposit(20.00);

        // print out the account information (name and balance)
        System.out.println(testVolkanAccount);
    }
}