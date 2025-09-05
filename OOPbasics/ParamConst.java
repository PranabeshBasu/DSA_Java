class BankAccount{
    double balance;
    String AccountType;
    public BankAccount(double _balance){
        balance = _balance;
        AccountType = "Savings";
    }
    public BankAccount(double _balance,String _AccountType){
        balance = _balance;
        AccountType = _AccountType;
    }
    public void printdetails(){
        System.out.println(balance);
        System.out.println(AccountType);
    }
}
class ParamConst {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount(100.0);
        acc1.printdetails();
        BankAccount acc2 = new BankAccount(1000.0,"Current account");
        acc2.printdetails();
    }
}
