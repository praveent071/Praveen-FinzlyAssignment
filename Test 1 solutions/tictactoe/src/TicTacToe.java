
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        char [][] board = new char[3][3];
        for (int row=0;row< 3;row++){
            for(int col=0;col<3;col++){
                board[row][col]=' ';
            }
        }
       char player ='X';
        boolean check = true;
      while(check){
          printTheBoard(board);
          Scanner sc = new Scanner(System.in);
          System.out.println("Player " + player + " enter :");
          int row = sc.nextInt();
          int col = sc.nextInt();
          if(board[row][col]==' '){
              board[row][col]= player;
              check=haveWon(board,player);
               if(check){
            	   System.out.println("Player " + player + " won :");
               }

              player = (player == 'X') ? 'O' : 'X';
          }else {
              System.out.println("Invalid move");
          }
          if(!haveWon(board,player) && isBoardfull(board)){
              System.out.println("Game is Draw");
              break;
          }
      }
      

      printTheBoard(board);
    }

    private static boolean isBoardfull(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == ' ') return false;

            }

        }
        return true;
    }

    private static boolean haveWon(char[][] board, char player) {
        for (int row=0;row< board.length;row++){
           if(board[row][0]==player &&board[row][1]==player&&board[row][2]==player){
               return true;
           }
        }

        for (int col=0;col< board[0].length;col++){
            if(board[0][col]==player &&board[1][col]==player&&board[2][col]==player){
                return true;
            }
        }
        if(board[0][0]==player && board[1][1]==player &&board[2][2]==player) return true;

        if(board[0][2]==player && board[1][1]==player &&board[2][0]==player) return true;

        return false;


    }

    private static void printTheBoard(char[][] board) {
        for (int row=0;row< board.length;row++){
            for(int col=0;col<board[row].length;col++){
                System.out.print(board[row][col] + " |");
            }
            System.out.println();
        }

    }



}
