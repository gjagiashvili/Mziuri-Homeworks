public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("01656");
        account1.setPassword("პაროლი123");

        account1.deposit(1000);
        account1.withdraw(200, "პაროლი12");
        account1.printTransactionHistory();

        BankAccount account2 = new BankAccount("67890");
        account1.transferMoney(account2, 500);
        account1.printTransactionHistory();

        double percentagedAmountWallet = account1.calculateWallet(1000, 12);
        System.out.println(percentagedAmountWallet);
    }
}
