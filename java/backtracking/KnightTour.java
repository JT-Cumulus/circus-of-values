package backtracking;
public class KnightTour {
    
    private int[][] chessTable;
    private int boardSize;
    private int[] xMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] yMoves = {1, 2, 2, 1, -1, -2, -2, -1};

    public KnightTour(int boardSize) {
        this.boardSize = boardSize;
        this.chessTable = new int[boardSize][boardSize];
        initializeChessTable();
    }

    private void initializeChessTable() {
        for(int i = 0; i<boardSize; i++){
            for(int j = 0; j<boardSize; j++){
                chessTable[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void solve() {

    }

    private boolean solveProblem(int stepCount, int x, int y) {
        return true;
    }

    private boolean isValid(int x, int y) {
        return true;
    }

    private void showSolution() {
        for (int i = 0; i < boardSize; ++i) {
            
        }
    }
}
