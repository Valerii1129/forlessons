package homeworks;
import java.util.Arrays;
import java.util.Random;
public class For {
    public static void main(String[] args) {
        int[] n = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            n[i] = rnd.nextInt(10);
        }
        System.out.println(Arrays.toString(n));
    }
}
