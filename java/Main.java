import java.util.HashMap;
import java.util.Map;

import dp.Fibonacci;

public class Main {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        Map<Integer, Integer> table = new HashMap<>();
        table.put(0, 1);
        table.put(1, 1);

        System.out.println(fib.fibonacciTabulation(12, table));
    }
}
