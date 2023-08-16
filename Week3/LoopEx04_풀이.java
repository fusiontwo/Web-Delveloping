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


public class LoopEx04_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int cnt = 0;
		int userInput = 0;
		int num1 = 0;
		int num2 = 0;
		int score = 0;
		
		while(cnt <= 4) {
			num1 = ran.nextInt(9) + 1;
			num2 = ran.nextInt(9) + 1;
			System.out.print(num1 + " * " + num2 + " = " );
			userInput = scan.nextInt();
			if (userInput == num1 * num2) score += 20;
			cnt++;
		}
		
		System.out.println("총점 : " + score);
	}

}
