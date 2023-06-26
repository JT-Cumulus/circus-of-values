package recursion;
public class Recursion {

    public int sum(int n){
        if (n == 0) return 0;
        return n + sum(n-1);
    }

    public void head(int n){
        System.out.println("Calling the function with n=" + n);
        if (n==0) return;

        head(n-1);

        System.out.println("the value n=" + n);
    }

    public void tail(int n){
        System.out.println("Calling the function with n=" + n);
        if (n==0) return;

        System.out.println("The value is n=" + n);

        tail(n-1);
    }

    public int factTail(int n, int acc){
        if (n==0) {
            System.out.println("Base case = " + acc);
            return acc;
        }

        System.out.println("before recursion n=" + n);
        int res = factTail(n-1, n*acc);
        System.out.println("after recursion res=" + res);

        return res;
    }

    public int factorialHead(int n){

        if (n==1) return 1;

        int res1 = factorialHead(n-1);
        int result = n*res1;

        return result;
    }

    public int factorialTail(int n, int acc){

        if (n==1) return acc;

        int res = factorialTail(n-1, n * acc);

        return res;
    }
}
