package lessons3;
public class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("(Cat eat milk)");
        System.out.println("Cat say:Thanks my host");
    }
}