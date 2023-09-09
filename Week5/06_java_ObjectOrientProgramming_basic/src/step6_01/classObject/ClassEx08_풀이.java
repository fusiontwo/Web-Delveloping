package step6_01.classObject;

//2023-09-04 17:30 ~ 17:58, 19:00 ~ 19:06

import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

class Ex08_연습{
	int[] game = {1, 0, 1, 0, 0, 0, 0, 1, 0};
}


public class ClassEx08_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex08_연습 e = new Ex08_연습();
		int direction = 0;
		
		int player = 1;
		e.game[player] = 2;
		
		for(int i = 0; i < e.game.length; i++) {
			System.out.print(e.game[i] + " ");
		}
		System.out.println();
		
		while (true) {
			System.out.print("왼쪽(1) 오른쪽(2) : ");
			direction = scan.nextInt();
			if (direction == 1) {
				if (player > 0 && e.game[player-1] != 1) {
					e.game[player] = 0;
					player--;
					e.game[player] = 2;
				}
				else if (player > 0 && e.game[player-1] == 1) {
					System.out.print("벽을 격파하려면 3을 누르시오 : ");
					direction = scan.nextInt();
					if (direction == 3) e.game[player-1] = 0;
				}
				else if (player<= 0) System.out.println("더 이상 왼쪽으로 갈 수 없습니다.");
			}
			else if (direction == 2) {
				if (player < 8 && e.game[player+1] != 1) {
					e.game[player] = 0;
					player++;
					e.game[player] = 2;
				}
				else if (player < 8 && e.game[player+1] == 1) {
					System.out.print("벽을 격파하려면 3을 누르시오 : ");
					direction = scan.nextInt();
					if (direction == 3) e.game[player+1] = 0;
				}
				else if (player >= 8) System.out.println("더 이상 오른쪽으로 갈 수 없습니다.");
			}
			
			
			for(int i = 0; i < e.game.length; i++) {
				System.out.print(e.game[i] + " ");
			}
			System.out.println();
		}

	}

}
