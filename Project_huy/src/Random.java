import java.util.Random;

public class Number {
    public static void main(String[] args) {
        Random rand = new Random();
        float random = 1 + rand.nextFloat() * (999 - 1);
        System.out.println(random);
    }
}
