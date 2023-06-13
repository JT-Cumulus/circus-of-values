public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }

    public static int sum(int n){
        if (n == 0) return 0;
        return n + sum(n-1);
    }


}
