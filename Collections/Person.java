class Data {
    public Integer num;
    public String name;
    Data(int _num, String _name) { // Parameterized Constructor
        this.num = _num;
        this.name = _name;
    }
}
public class Person{
    public static void main(String[] args) {
        Data dataobj1 = new Data(1, "Pranabesh Basu");
        Data dataobj2 = new Data(2, "Rajbir Dey");
        System.out.println(dataobj1.name);
        dataobj1.name = "Pritam Karak";
        System.out.println(dataobj1.name);
    }
}