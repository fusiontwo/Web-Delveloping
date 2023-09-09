package step6_02.method;

// 2023-09-06 18:21 ~ 18:40, 23:10 ~ 23:34
// 느낀 점 : run에서 다른 메서드를 호출할 때 출력하려는 방식에 따라 순서 설정에 주의해야겠다.
import java.util.Scanner;

//# 틱택토

class TicTacToe_연습{
   
   Scanner scan = new Scanner(System.in);
   
   String[][] game = new String[3][3];
   
   int turn = 0;
   int win = 0;      // 1[turn1승리] 2[turn2승리]
   
   void setGame() {
      for (int i = 0; i < game.length; i++) {
         for (int j = 0; j < game[i].length; j++) {
            game[i][j] = " ";
         }
      }
   }
   
   
   // 게임 화면 출력
   void showGame() {
      System.out.println("== 틱택톡 ==");
      for (int i = 0; i < game.length; i++) {
         for (int j = 0; j < game[i].length; j++) {
            System.out.printf("[%s]", game[i][j]);
         }
         System.out.println();
      }
      System.out.println("==========");
   }
   
   
   // 인덱스 선택
   void choiceIdx() {
      int yidx = 0;
      int xidx = 0;
      
      if (turn % 2 == 0) {
         System.out.print("[1턴]y인덱스 입력 : ");
         yidx = scan.nextInt();
         System.out.print("[1턴]x인덱스 입력 : ");
         xidx = scan.nextInt();
         
         if (game[yidx][xidx] == " ") {
              game[yidx][xidx] = "O";
              turn++;
         }
         else System.out.println("잘못 입력하셨습니다.");
      }

      else if (turn % 2 == 1) {
         System.out.print("[2턴]y인덱스 입력 : ");
         yidx = scan.nextInt();
         System.out.print("[2턴]x인덱스 입력 : ");
         xidx = scan.nextInt();
         
	     if (game[yidx][xidx] == " ") {
	         game[yidx][xidx] = "X";
	         turn++;
	     }  
	     else System.out.println("잘못 입력하셨습니다.");

      }

   }
   
   
   void exitWidth() {
      for (int i = 0; i < game.length; i++) {
         if (game[i][0].equals("O") && game[i][1].equals("O") && game[i][2].equals("O")) win = 1;
         else if (game[i][0].equals("O") && game[i][1].equals("O") && game[i][2].equals("O")) win = 2;
      }
   }
   
   
   void exitHeight() {
      for (int i = 0; i < game.length; i++) {
         if (game[0][i].equals("O") && game[1][i].equals("O") && game[2][i].equals("O")) win = 1;         
         else if (game[0][i].equals("X") && game[1][i].equals("X") && game[2][i].equals("X")) win = 2;
      }
   }
   

   void exitCross() {
      if (game[0][0].equals("O") && game[1][1].equals("O") && game[2][2].equals("O")) win = 1;      
      else if (game[0][0].equals("X") && game[1][1].equals("X") && game[2][2].equals("X")) win = 2;
   }
   
   
   void run() {
      
      setGame();
      while (true) {
         showGame();

         if (win == 1) {
        	 System.out.println("turn1이 승리했습니다.");
        	 break;
         }
         else if (win == 2) {
        	 System.out.println("turn2가 승리했습니다.");
        	 break;
         }
         
         choiceIdx();
         exitWidth();
         exitHeight();
         exitCross();
         
      }

   }
   
}


public class MethodEx17_풀이 {

   public static void main(String[] args) {
      
      TicTacToe_연습 tic = new TicTacToe_연습();
      tic.run();

   }

}