package dp;
public class Knapsack {
    
    private int n;

    private int capacity;

    private int[][] S;
    private int[] weights;
    private int[] values;

    public Knapsack(int n, int capacity, int[] weights, int[] values){
        this.n = n;
        this.capacity = capacity;
        this.weights = weights;
        this.values = values;
        this.S = new int[n+1][capacity+1];
    }

    public Knapsack(){};

    public int solveRecursion(int m, int[] w, int [] v, int n){
        if (n==0 || m == 0) return 0;

        if(w[n-1] > m){
            return solveRecursion(m, w, v, n-1);
        } else {
            int n_include = v[n-1] + solveRecursion(m - w[n-1], w, v, n-1);
            int n_exclude = solveRecursion(m, w, v, n-1);
            return Math.max(n_include, n_exclude);
        }
    }

    public void solve() {
        for(int i = 1; i<n+1; i++){
            for(int w=1;w<capacity+1;w++){
                int notTakingItem = S[i-1][w];
                int takingItem = 0;

                if(weights[i] <= w ){
                    takingItem = values[i] + S[i-1][w-weights[i]];
                }

                S[i][w] = Math.max(takingItem, notTakingItem);
            }
        }
    }
    /*
    public void showResult() {
        System.out.println("Total benefit: " + S[n][capacity]);

        for(int i = n, w=capacity; i>0;i--) {
            if(S[i][w] != 0 && S[i][w] != S[i-1][w]){
                
            }
        }
    } */
}
