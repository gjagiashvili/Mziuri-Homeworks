public class BankAccount {
    private final String accountNumber;
    private String password;
    private double balance;

    private boolean accountLock;
    private String transactionHistory;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.accountLock = true;
        this.transactionHistory = "";
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (!accountLock) {
            System.out.println("თანხას ვერ შეიტანთ, ეს ექაუნთი დაბლოკილია");
            return;
        }
        if (amount > 0 && amount <= 10_000) {
            this.balance += amount;
            addTransactionHistory("შეტანილია: " + amount);
        } else {
            System.out.println("თანხას ვერ შეიტანთ");
        }
    }

    public void withdraw(double amount, String password) {
        if (!accountLock) {
            System.out.println("თანხას ვერ გამოიტანთ, ეს ექაუნთი დაბლოკილია");
            return;
        }
        if (this.password.equals(password)) {
            if (amount > 0 && amount <= balance) {
                this.balance -= amount;
                addTransactionHistory("გამოიტანეთ: " + amount);
            } else {
                System.out.println("არასწორი თანხა");
            }
        } else {
            System.out.println("არასწორი პაროლი");
        }
    }


    public void printTransactionHistory() {
        if (!accountLock) {
            System.out.println("ექაუნთი დაბლოკილია");
            return;
        }
        if (transactionHistory.isEmpty()) {
            System.out.println("არ არის ტრანზაქცია");
        } else {
            System.out.println("ტრანზაქციის ისტორია (ექაუნთის ნომერი) " + accountNumber);
            System.out.println(transactionHistory);
        }
    }

    private void addTransactionHistory(String transaction) {
        if (transactionHistory.isEmpty()) {
            transactionHistory = transaction;
        } else {
            transactionHistory += ", " + transaction;
        }
    }

    public void transferMoney(BankAccount recipient, double amount) {
        if (!accountLock) {
            System.out.println("ექაუნთი დაბლოკილია");
            return;
        }
        if (amount > 1000) {
            System.out.println("არ შეიძლება გადაირიცხოს 1000-ზე მეტი");
            return;
        }
        if (balance >= amount) {
            this.balance -= amount;
            recipient.receiveMoney(amount);
            addTransactionHistory("გადაირიცხა " + amount + " დოლარი ექაუნთის ნომერთან " +recipient.getAccountNumber());
            System.out.println("თანხა გადაირიცხა");
        } else {
            System.out.println("არ გაქვთ საკმარისი თანხა გადასარიცხად, თქვენი ბალანსი:" + balance);
        }
    }

    private void receiveMoney(double amount) {
        this.balance += amount;
        addTransactionHistory("Received $" + amount);
    }

    public double calculateWallet(double amount, int months) {
        if (!accountLock) {
            System.out.println("ეს ექაუნთი დაბლოკილია");
            return 0;
        }
        double finalAmount = amount;
        for (int i = 0; i < months; i++) {
            finalAmount += finalAmount * 0.01;
        }
        return finalAmount;
    }
}
