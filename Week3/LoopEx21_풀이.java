package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

public class LoopEx21_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int answer = 0;  // user input
		int score = 0;
		
		for (int i = 0; i <= 4; i++) {
			num1 = ran.nextInt(9) + 1;
			num2 = ran.nextInt(9) + 1;
			System.out.print(num1 + " * " + num2 + " = ");
			answer = scan.nextInt();
			if (num1 * num2 == answer) {
				score += 20;
			}
		}
		System.out.println("총점은 " + score + "점 입니다.");
	}

}
