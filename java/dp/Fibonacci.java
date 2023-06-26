package dp;
import java.util.Map;

public class Fibonacci {
    public int head(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        int fib1 = head(n-1);
        int fib2 = head(n-2);
        int result = fib1 + fib2;
        return result;
    }

    public int tail(int n, int a, int b){

        if (n==0) return 0;
        if (n==1) return 1;

        return tail(n-1, b, a+b);
    }

    public int fibonacciMemoization(int n, Map<Integer, Integer> table) {
        if(!table.containsKey(n)) {
            table.put(n, fibonacciMemoization(n - 1, table) + fibonacciMemoization(n - 2, table));
        }

        return table.get(n);
    }

    public int fibonacciTabulation(int n, Map<Integer, Integer> table){

        for(int i = 2; i <= n; i++){
            table.put(i, table.get(i-1) + table.get(i-2));
        }

        return table.get(n);
    }
}
