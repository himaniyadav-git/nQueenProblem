package Problems;

public class NQueen
{
    static int count =0;
    public static void main(String[] args) 
    { 
        int n = 4; 
        char[][] board = new char[n][n]; 
        //initialize 
        for(int i =0; i< board.length;i++){ 
            for(int j =0; j<board.length; j++){ 
                board[i][j] = 'X';
            }
        } 
        printBoard(board); 

        nQueen(board, 0); 

        System.out.println("total ways = " + count); 
    } 
    
    public static boolean nQueen(char[][] board, int row){
         //base case 
         if(row == board.length){ 
            count++; 
            printBoard(board); 
            return true; 
        } //for columns 
        
        for(int i = 0; i< board.length; i++){
             if(isSafe(i,row,board)){
                board[row][i] = 'Q'; 
                nQueen(board, row+1); 
                //for printing all solutions 
                if(nQueen(board, row+1))//for printing only one solution 
                {
                     return true; 

                } 
                board[row][i] = 'X'; 
           } 
        }
        return false; 
    } 
    
    public static boolean isSafe(int col , int row, char[][] board){
         //vertically up 
        for(int i = row -1; i >=0; i-- ){ 
            if(board[i][col] == 'Q'){
                 return false; 
            } 
        } 
        
        //right diagonal 
        for(int j = col+1, i = row-1; j<board.length && i >=0; j++,i--){ 
            if(board[i][j] == 'Q'){ 
                return false; 
            } 
        } 
        
        //left diagonal 
        for(int i = row -1, j = col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                 return false; 
            } 
        } 
        
        return true;

    } 


    public static void printBoard(char[][] board){
         for(int i = 0; i< board.length; i++){
            for(int j =0; j< board.length; j++){
                System.out.print( " " + board[i][j] + " "); 
            } 
                System.out.println(); } System.out.println(); 
        } 
    }

