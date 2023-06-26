package backtracking;

public class Sudoku {
    
    private int[][] sudokuTable;

    public Sudoku(int[][] sudokuTable) {
        this.sudokuTable = sudokuTable;
    }

    public void solveProblem() {
        if(solve(0,0)) {
            showSolution();
        } else {
            System.out.println("No Solution");
        }
    }

    public boolean solve(int rowIndex, int colIndex) {
        if(rowIndex == Constants.BOARD_SIZE) {
            colIndex++;

            if(colIndex == Constants.BOARD_SIZE)
                return true;
            else
                rowIndex++;
        }
        return true;
    }

    public boolean isValid(int rowIndex, int colIndex) {
        return true;
    }

    public void showSolution() {
        for(int i = 0; i < Constants.BOARD_SIZE;++i){
            
        }
    }
}
