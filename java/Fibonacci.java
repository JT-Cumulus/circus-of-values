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
}
