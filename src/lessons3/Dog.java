package lessons3;
public class Dog extends Animal{
    private String name;
    @Override
    void eat() {
        System.out.println("(Dog eat maet)");
        System.out.println("Dog say: Thanks my host!");
    }
    public void setName(String name) {
        this.name = name;
    }

}
