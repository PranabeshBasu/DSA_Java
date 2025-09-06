class BankAccount {
    private double balance; // Encapsulation
    private String AccountType; // Encapsulation

    public BankAccount(double _balance) {
        balance = _balance;
        AccountType = "Savings";
    }

    public BankAccount(double _balance, String _AccountType) {
        balance = _balance;
        AccountType = _AccountType;
    }

    public void printdetails() {
        System.out.println(balance);
        System.out.println(AccountType);
    }

    public void setBalance(double balance) { // setter
        this.balance = balance;
        ;
    }

    public double getBalance() { // getter
        return balance;
    }
}

class ParamConstEncap {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(100.0);
        acc1.setBalance(200);
        acc1.printdetails();
        BankAccount acc2 = new BankAccount(1000.0, "Current account");
        acc2.printdetails();

        // acc1.balance = 200.0; // this is risky so anyone can change the balance
        // that's why we need encapsulation
        // System.out.println(acc1.balance);
    }
}
