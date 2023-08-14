package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		
		com = ran.nextInt(3);
		System.out.print("원하는 숫자를 입력하세요(0 : 가위 , 1 : 바위 , 2 : 보): ");
		me = scan.nextInt();
		
		System.out.println("computer : " + com + ", user : " + me);
		
		if (com == me) 
			System.out.println("무승부입니다.");
		// (2,0), (0,1), (1,2)
		else if (com == 2 && me == 0 || com == 0 && me == 1 || com == 1 && me == 2)
			System.out.println("이겼습니다.");
		// (0,2), (1,0), (2,1)
		else
			System.out.println("졌습니다.");
	}

}
