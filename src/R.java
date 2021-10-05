import java.util.Random;
public class R{
    public static void main(String[] args) {
        Random r = new Random();
        int lower = 10;
        int upper = 100;
        int j = upper - lower;
        int x = r.nextInt(j);
        System.out.println(x*10);
    }
}
