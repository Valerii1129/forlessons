package lessons3;
public class Cat extends Animal{
private String name;
    @Override
    void eat() {
        System.out.println("(Cat eat milk)");
        System.out.println("Cat say:Thanks my host");
    }
    public void setName(String name) {
        this.name = name;
    }

}