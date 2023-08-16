package step1_06.loop;

import java.util.Scanner;

/*
 * # 베스킨라빈스31
 * 
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */


public class LoopEx11_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;  // turn이 1이면 player1 차례, turn이 2이면 player2 차례
		
		boolean isRunning = true;
		String winner = "";
		
		turn = 1;
		
		while (isRunning) {
			if (br <= 31) {
				if (turn == 1) {
					System.out.print("Player1님, 1~3 사이의 숫자를 입력하세요 : ");
					p1 = scan.nextInt();
					br += p1;
					System.out.println("br : " + br);
					turn = 2;
				}
				else if (turn == 2) {
					System.out.print("Player2님, 1~3 사이의 숫자를 입력하세요 : ");
					p2 = scan.nextInt();
					br += p2;
					System.out.println("br : " + br);
					turn = 1;
				}
			}
			else {
				isRunning = false;
				if (turn == 1) winner = "Player1";
				else if (turn == 2) winner = "Player2";
				System.out.println("게임이 종료되었습니다.");
				System.out.println("승리자는 " + winner + "입니다.");
			}
		}		

	}

}
