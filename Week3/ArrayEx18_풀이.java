package step2_01.array;

// 2023-08-28 11:30 ~ 11:50, 15:30 ~ 4:30
/* 느낀 점 : 1바퀴 돌 때마다 인덱스 값을 0부터 시작하게 하는 아이디어를 얻기가 어려웠다.
 * idx = idx % 8; 아이디어를 통해 해결할 수 있었다. 
 * 또한, turn을 증가시키는 코드의 위치가 중요함을 알게 되었다.
 * turn이 포함된 조건문이 모두 실행되기 전에 turn 값을 증가시키지 않도록 주의해야 한다.
*/
import java.util.Random;
import java.util.Scanner;

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

public class ArrayEx18_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;  // p1은 turn 값이 짝수, p2는 turn 값이 홀수 
		
		int idx1 = 0;  // p1의 인덱스
		int idx2 = 0;  // p2의 인덱스
		
		p1[idx1] = 1;  // p1[0]에 1 넣기 (player 위치 표시용)
		p2[idx2] = 2;  // p2[0]에 2 넣기 (player 위치 표시용)
		
		int win1 = 0;  // p1이 돌은 바퀴 수
		int win2 = 0;  // p2가 돌은 바퀴 수
		
		int userInput = 0;
		int randomNum = 0;
		
		while (true) {
			for(int i = 0; i < game.length; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			
			for(int i = 0; i < p1.length; i++) {
				System.out.print(p1[i] + " ");
			}
			System.out.println("[" + win1 + "바퀴]");
			
			for(int i = 0; i < p2.length; i++) {
				System.out.print(p2[i] + " ");
			}
			System.out.println("[" + win2 + "바퀴]\n");
			
			if (turn % 2 == 0) {  // 아이디어 중요
				System.out.print("[p1사용자]1~3 입력 : ");
				userInput = scan.nextInt();
				if (userInput >= 1 && userInput <= 3) {
					p1[idx1] = 0;
					idx1 += userInput;
					if (idx1 >= 8) win1++;
					idx1 = idx1 % 8;  // 아이디어 중요
					p1[idx1] = 1;				
				}
				else System.out.println("1~3 사이의 값을 입력하세요.");
			}
			else {
				randomNum = ran.nextInt(3) + 1;
				System.out.println("[p2컴퓨터] : " + randomNum);
				p2[idx2] = 0;
				idx2 += randomNum;
				if (idx2 >= 8) win2++;
				idx2 = idx2 % 8;
				p2[idx2] = 2;
			}
			
			if (turn % 2 == 0 && idx1 != 0 && idx1 == idx2) {
				System.out.println("[p1사용자]가 [p2컴퓨터]를 잡았다!");
				p2[idx2] = 0;
				idx2 = 0;
				p2[idx2] = 2;
			}
			else if (turn % 2 == 1 && idx2 != 0 && idx1 == idx2) {
				System.out.println("[p2컴퓨터]가 [p1사용자]를 잡았다!");
				p1[idx1] = 0;
				idx1 = 0;
				p1[idx1] = 1;
			}
			turn++;  // turn을 증가시키는 코드의 위치가 중요함. 
			
			if (win1 == 3) {
				System.out.println("[p1사용자]승리!");
				break;
			}
			else if (win2 == 3) {
				System.out.println("[p2사용자]승리!");
				break;
			}
			
		}
		
	}
}
