package lessons3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Object[] obj = new Object[2];
        Cat cat = new Cat();
        Dog dog = new Dog();
        obj[0] = cat;
        try {
            obj[1] = dog;
            Cat cat2 = (Cat) obj[1];
            System.out.println(dog);
        } catch (ClassCastException e) {
            System.out.println("Incorrect data type\n");
        }
        System.out.print("Dog and Cat very hungry, choose one of who do you want to feed: ");
        //cat or dog
        Scanner scnr = new Scanner(System.in);
        String selected = scnr.nextLine();

        if (selected.equals("cat")) {
            cat.eat();
        } else if (selected.equals("dog")) {
            dog.eat();
        }
        else{
            System.out.println("Incorrect data");
        }
    }
}
