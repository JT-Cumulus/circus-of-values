package dp;

public class RodCutting {
    
    private int rodLength;
    private int[][] dptable;
    private int[] prices;

    public RodCutting(int rodLength, int[] prices){
        this.rodLength = rodLength;
        this.dptable = new int[prices.length + 1][rodLength + 1];
        this.prices = prices;
    }

    public void solve(){
        for(int i = 1; i < prices.length; i++){
            for(int j = 1; j < rodLength + 1;j++){
                if(i <= j) {
                    dptable[i][j] = Math.max(dptable[i-1][j], prices[i] + dptable[i][j-i]);
                } else {
                    dptable[i][j] = dptable[i-1][j];
                }
            }
        }
    }

    public void show(){
        System.out.println("Optimal profit: $" + dptable[prices.length-1][rodLength]);
        
        for(int rowIndex = prices.length-1, colIndex=rodLength; rowIndex>0;){
            if(dptable[rowIndex][colIndex] != 0 && dptable[rowIndex][colIndex] != dptable[rowIndex-1][colIndex]){
                System.out.println("We use piece: "+ rowIndex + "M");
                colIndex = colIndex - rowIndex;
            } else {
                rowIndex--;
            }
        }
    }
}
