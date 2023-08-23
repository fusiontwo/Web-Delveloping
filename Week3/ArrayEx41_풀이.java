package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 * # 사다리 게임
 * 
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */


public class ArrayEx41_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] ladder = {{0, 0, 0, 0, 0},
						  {0, 1, 1, 0, 0},
						  {1, 1, 0, 1, 1},
						  {0, 0, 0, 1, 1},
						  {1, 1, 0, 1, 1},
						  {0, 0, 1, 1, 0},
						  {0, 1, 1, 0, 0}};
		
		// 사다리 출력
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				if (ladder[i][j] == 0) System.out.print(" │ ");
				else if (ladder[i][j] == 1) {
					if (j != 0 && ladder[i][j-1] == 1) System.out.print("─┤ ");  // 왼쪽 가장자리 인덱스 에러 방지
					else if (j != ladder[i].length - 1 && ladder[i][j+1]  == 1) System.out.print(" ├─");  // 오른쪽 가장자리 인덱스 에러 방지				 	
				}
				
			}
			System.out.println();
		}
		
		// x 입력 받아서 도착점 출력
		int x = 0;  // 열 번호
		int y = 0;  // 행 번호
		System.out.print("x를 입력하시오 (0~4) : ");
		x = scan.nextInt();

		for (int i = 0; i < ladder.length; i++) {
			if (ladder[y][x] == 0) y++;
			else if (ladder[y][x] == 1) {
				if (x != 0 && ladder[y][x-1] == 1) {
					x--;
					y++;
				}
				else if (x != ladder[y].length-1 && ladder[y][x+1] == 1) {
					x++;
					y++;			
		}

			}
		}
		System.out.println("x: " + x + ", y: " + y);

	}

}
