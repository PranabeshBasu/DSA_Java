public class Exp {
    public static void main(String[] args) {
        try{
            int num1 = 10;
            int num2 = 0;
            int num3 = num1/num2;
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("Done");
        }
    }
}
