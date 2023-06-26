import dp.RodCutting;

public class Main {
    public static void main(String[] args) {
        int[] prices = {0, 2, 5, 7, 3, 9};

        RodCutting rod = new RodCutting(5, prices);

        rod.solve();
        rod.show();
    }
}
