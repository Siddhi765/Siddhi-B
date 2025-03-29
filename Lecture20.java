//Backtracking 
import java.util.*;
public class Lecture20 {
    //____________________________________Seeting arrangement____________________________________//
    // public static void printPermu(String str,String permu,int pos)//pos means index
    // {   
    //     //base case
    //     if(str.length() == 0){
    //         System.out.println(permu);
    //         return;
    //     }
    //     //Traverse
    //     for(int i = 0; i < str.length(); i++){
    //         //To check the position of current character
    //         char current_char = str.charAt(i);
    //         //charAt(i) usko hatana -> newStr banayenge -> next charc betheya or usko add karenge
    //         String newStr = str.substring(0,i) + str.substring(i+1);
    //         printPermu(newStr, permu+current_char, pos+1);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "ABC";
    //     printPermu(str, "", 0);
    // }
    //_____________________________________N QUEENS PROBLEMS_________________________________//
    //isSafe -> check safe hain or nahi hain
    public boolean isSafe(int row,int col,char[][] board){
        //horizontal -> colm -> ek ek karake jana padega
        //left and right for both
        for(int j = 0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //vetical -> rows -> ek ek karake jana padega
        //up and down for both
        for(int i=0; i<board[0].length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //upper left
        //row dec and col dec
        int r = row;//r -> iterator
        for(int c=col; c>=0 && r>=0; c--,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
        r = row;//r -> iterator
        //row dec but col inc
        for(int c=col; c < board.length && r>=0; c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower left
        //row inc and col inc
        r = row;
        for(int c=col; c>=0 && r<board.length; r++,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower right
        //row inc and col inc
        r = row;
        for(int c=col; c>=0 && r<board.length; r++,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    //saveBoard function 
    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i = 0; i<board.length; i++){
            //ek ek karake row nikali
            row = "";
            //row ko badhaya
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'Q')
                     row += 'Q';
                else
                    row += '.';
            }
            //row ko add kiya newBoard ke andar
            newBoard.add(row);
        }
        //Total board ko add kiya allBoards ke andar
        allBoards.add(newBoard);
    }
    //Helper funct -> recursive function -> backtracking
    public void helper(char[][] board,List<List<String>> allBoards,int col){
        //base condition
        if(row == board.length){
            saveBoard(board,allBoards);
            return;
        }
        for(int row = 0; row < board.length; row++){
            //isSafe -> pos is safe for queens or not 
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,allBoards,col+1);
                //if solutions are not true then waps ana padega or queen ko hatana padega
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        //2D char array board -> chess board hain of size n by n
        char[][] board = new char[n][n];
        //Initialize voard with '.'
        for(char[] row : board){
            Arrays.fill(row,'.');
        }
        helper(board, allBoards,0);
        return allBoards;
    }
    public static void main(String[] args) {
        Lecture20 obj = new Lecture20();
        int n = 4; // Change this to any size of the chessboard
        List<List<String>> solutions = obj.solveNQueens(n);
 
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
