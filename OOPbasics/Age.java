class Test{
    int age;
    public void Ageassign(int num){
        age = num;
    }
}
class Age {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.Ageassign(10);
        System.out.println(t1.age);
        t2.Ageassign(18);
        System.out.println(t2.age);

    }
}
