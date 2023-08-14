package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		System.out.print("동전의 앞면 또는 뒷면을 입력하시오(앞:0, 뒤:1): ");
		int face = scan.nextInt();
		System.out.println("컴퓨터: " + coin + ", 사용자: " + face);
		if (coin == face) System.out.println("정답입니다.");
		else System.out.println("오답입니다.");
		
		scan.close();

	}

}
