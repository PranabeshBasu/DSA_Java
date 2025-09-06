interface Animal{
    void Sound();
    default void sleep(){
        System.out.println("The animal is sleeping");
    }
}
interface Owner{
    void ownerName();
}
class Dog implements Animal,Owner{
    public void Sound(){
        System.out.println("Bark!!");
    }
    public void sleep(){
        System.out.println("The dog is sleeping");
    }
    public void ownerName(){
        System.out.println("Owner name is Pranabesh");
    }
}
class Cat implements Animal,Owner{
    public void Sound(){
        System.out.println("Mewooo!!");
    }
    public void sleep(){
        System.out.println("The cat is sleeping");
    }
    public void ownerName(){
        System.out.println("Owner name is Rajashree");
    }
}
public class AnimalInterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Sound();
        dog.sleep();
        dog.ownerName();
        Cat cat = new Cat();
        cat.Sound();
        cat.sleep();
        cat.ownerName();
    }
}
