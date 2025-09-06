abstract class Bank{
    double balance;
    abstract void addMoney(double amount);
    abstract void CanwithdrawMoney(double amount);
    void updateBalance(double _balance){
        balance = _balance;
    }
    public double getBalance(){
        return balance;
    }
}
class SavingsAcc extends Bank{
    public void addMoney(double amount){
        super.updateBalance(super.getBalance()+amount);
    }
    public void CanwithdrawMoney(double amount){
        if(amount <= super.getBalance()){
            System.out.println("Yes the user can withdraw money");
        }
        else{
            System.out.println("No the user can not withdraw money");
        }
    }
}
class CurrentAcc extends Bank{
    double minamount = 1000.0;
    public void addMoney(double amount){
        super.updateBalance(super.getBalance()+amount);
    }
    public void CanwithdrawMoney(double amount){
        if(super.getBalance()-amount >= minamount){
            System.out.println("Yes the user can withdraw money");
        }
        else{
            System.out.println("No the user can not withdraw money");
        }
    }
}
public class BankAbstract {
    public static void main(String[] args) {
        // Bank ba = new Bank(); abstract class can not be instantiated
        SavingsAcc sa = new SavingsAcc();
        sa.addMoney(15000.0);
        sa.CanwithdrawMoney(500.0);
    }
}
