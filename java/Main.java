import dp.Kadane;
import dp.RodCutting;

public class Main {
    public static void main(String[] args) {
        Kadane kad = new Kadane();

        int[] n = {1,2,-2, 3,4};
        System.out.println(kad.run(n));
    }
}
