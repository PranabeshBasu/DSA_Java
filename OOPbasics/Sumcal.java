class Calsum{
    public int sum(int num1, int num2){
        return num1+num2;
    }
}
public class Sumcal {
    public static void main(String[] args){
        Calsum s = new Calsum();
        System.out.println("The sum of two numbers are = "+s.sum(4, 5));
    }
}
