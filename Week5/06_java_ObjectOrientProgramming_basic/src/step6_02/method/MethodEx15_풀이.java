package step6_02.method;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NumberGame_연습{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int playerLocation = 4;  // 인덱스로 입력
	
	void printPlay() {
		for (int i = 0; i < move.length; i++) {
			if (move[i] == 0) System.out.print("[ ]");
			else if (move[i] == 8) System.out.print("옷");
		}
		System.out.println();
	}
	
	
	
	void showMenu() {
		System.out.println("1.좌로 이동");
		System.out.println("2.우로 이동");
		System.out.println("3.종료하기");
	}
	
	
	
	void moveLeft() {
		if (playerLocation == 0) System.out.println("더 이상 왼쪽으로 움직일 수 없습니다.");
		else {
			move[playerLocation] = 0;
			playerLocation--;
			move[playerLocation] = 8;
		}
	}
	
	
	
	void moveRight() {
		if (playerLocation == 9) System.out.println("더 이상 오른쪽으로 움직일 수 없습니다.");
		else {
			move[playerLocation] = 0;
			playerLocation++;
			move[playerLocation] = 8;
		}
	}
	
	
	
	void run() {
		
		while (true) {
			
			// 게임화면 출력
			printPlay();

			// 메뉴 출력
			showMenu();
			
			// 메뉴 선택
			int menu = 0;
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			// 좌우로 이동, 종료
			if (menu == 1) moveLeft();
			else if (menu == 2) moveRight();
			else {
				System.out.println("게임 종료");
				break;
			}

		}
		
	}
	
}

public class MethodEx15_풀이 {

	public static void main(String[] args) {
		
		NumberGame_연습 g = new NumberGame_연습();
		g.run();

	}

}
