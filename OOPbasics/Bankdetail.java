class Bankbalance{
    double balance;
    public Bankbalance(){
        balance = 100.0;
    }
    public void printBalance(){
        System.out.println("The balance of the current account is : "+balance);
    }
}
class Bankdetail{
    public static void main(String[] args) {
        Bankbalance bb = new Bankbalance();
        bb.printBalance();
    }
}
