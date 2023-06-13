public class App {
    public static void main(String[] args) {
        Hanoi han = new Hanoi();

        han.solve(64, 'a', 'b', 'c');
    }
}
