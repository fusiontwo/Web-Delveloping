package step2_01.array;

import java.util.Scanner;

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ArrayEx17_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = new int[9];
		int idx = 0;
		int win = 0;
		int turn = 1;
		
		while (true) {
			System.out.println("=== 틱택토 ===");
			for(int i = 0; i < game.length; i++) {
				if (game[i] == 0) System.out.print("[ ] ");
				else if (game[i] == 1) System.out.print("[O] ");
				else System.out.print("[X] ");  // game[i] == 2인 경우를 포함
				
				if (i % 3 == 2) System.out.println();
			}
			
			if (win == 1) {
				System.out.println("[p1]승리");
				break;
			}
			else if (win == 2) {
				System.out.println("[p2]승리");
				break;
			}

			if (turn == 1) {
				System.out.print("[p1]인덱스 입력 : ");
				idx = scan.nextInt();
				if (game[idx] == 0) game[idx] = 1;
				turn = 2;
			}
			else {
				System.out.print("[p2]인덱스 입력 : ");
				idx = scan.nextInt();
				if (game[idx] == 0) game[idx] = 2;
				turn = 1;
			}			
			// 0 1 2
			// 3 4 5 
			// 6 7 8
			
			// 가로 빙고
			for(int i = 0; i <= 6; i += 3) {
				if (game[i] == 1 && game[i+1] == 1 && game[i+2] == 1) win = 1;
				else if (game[i] == 2 && game[i+1] == 2 && game[i+2] == 2) win = 2;
			}
			
			// 세로 빙고
			for(int i = 0; i <= 2; i++) {
				if (game[i] == 1 && game[i+3] == 1 && game[i+6] == 1) win = 1;
				else if (game[i] == 2 && game[i+3] == 2 && game[i+6] == 2) win = 2;
			}
			
			// 대각선 빙고
			if (game[0] == 1 && game[4] == 1 && game[8] == 1) win = 1;
			else if (game[2] == 1 && game[4] == 1 && game[6] == 1) win = 1;
			else if (game[0] == 2 && game[4] == 2 && game[8] == 2) win = 2;
			else if (game[2] == 2 && game[4] == 2 && game[6] == 2) win = 2;
			
		}
		scan.close();
		
	}
		
}
