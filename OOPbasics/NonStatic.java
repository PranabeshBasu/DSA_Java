class Test{
    public void printhello(){
        System.out.println("Hello i am learning java");
    }
}

public class NonStatic {
    public static void main(String[] args){
        Test t = new Test();
        t.printhello();
    }
}
