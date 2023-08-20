package step2_01.array;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int player = 0;
		int menuNum = 0;
		
		for (int i=0; i < game.length; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		
		while (true) {
			// 배열 출력
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 2) System.out.print("옷");
				else System.out.print("_");
			}
			System.out.println();
			
			// 메뉴 출력과 player 위치 변경
			System.out.print("왼쪽[1] 오른쪽[2]  종료[3]입력: ");
			menuNum = scan.nextInt();
			if (menuNum == 1) {
				if (player > 0) {
					game[player] = 0;
					player--;
					game[player] = 2;
				}
			}
			else if (menuNum == 2) {
				if (player < 14) {
					game[player] = 0;
					player++;
					game[player] = 2;
				}
			}
			else if (menuNum == 3) {
				scan.close();
				System.out.println("종료되었습니다.");
				break;
			}
			else System.out.println("1 ~ 3 범위의 값을 입력하시오.");
		}
		
	}
	
}
