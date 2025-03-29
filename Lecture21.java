//Sudoku Solver - Backtracking 

// import static java.io.IO.print;

public class Lecture21{
    //solveSudoku
    // static void print(int[][] grid)
    // {
    //     for (int i = 0; i <= 9; i++) {
    //         for (int j = 0; j <= 9; j++)
    //             System.out.print(board[i][j] + " ");
    //         System.out.println();
    //     }
    // }
    //isSafe function
    public boolean isSafe(char[][] board,int row,int col,int number){
        //for column
        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char)(number+'0')){
                return false;
            }
        }
        //for row
        for(int j=0; j<board.length; j++){
            if(board[row][j] == (char)(number+'0')){
                return false;
            }
        }
        //For grid -> 3 by 3 matrix 
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=0; i<sr+3; i++){
            for(int j=0; j<sc+3; j++){
                if(board[i][j] == (char)(number+'0')){
                    return false;
                } 
            }
        }
        return true;
    }
    public boolean helper(char[][] board,int row,int col){
        if(row == board.length){
            return false;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = 0;
            ncol = col+1;
        }else{
            ncol = 0;
            nrow = row+1;
        }
        if(board[row][col] != '.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
            else{
                //Fill the place
                for(int i = 1; i <= 9; i++){
                    if(isSafe(board,row,col,i)){
                        board[row][col] = (char)(i+'0'); //TyapeCast
                        if(helper(board, nrow, ncol))
                            return true;
                        else
                            board[row][col] = '.';
                    }
                }
            }
            return false;
        }
    }
        public void solveSodoku(char[][] board, int row , int col){
            helper(board, 0, 0);
        }
    }
    // Driver Code
    public static void main(String args[]){
        char board[][] =  {{ '3', '.', '6', '5', '0', '8', '4', '.', '.' },
        { '5', '2', '.', '.', '.', '.', '.', '.', '.' },
        { '.', '8', '7', '.', '.', '.', '.', '3', '1' },
        { '.', '.', '3', '.', '1', '.', '.', '8', '.' },
        { '9', '.', '.', '8', '6', '3', '.', '.', '5' },
        { '.', '5', '.', '.', '9', '.', '6', '.', '.' },
        { '1', '3', '.', '.', '.', '.', '2', '5', '.' },
        { '.', '.', '.', '.', '.', '.', '.', '7', '4' }};

        // { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        // { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        // { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        // { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        // { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        // { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
        // { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
        // { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
       
    }
