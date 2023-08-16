package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

// 2023-08-14 20:20 ~
/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx22_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int randomNum = ran.nextInt(100);
		int answer = 0;
		int score = 100;

		while (true) {
			System.out.print("수를 입력하시오 : ");
			answer = scan.nextInt();
			if (randomNum != answer) {
				if (randomNum > answer) System.out.println("Up!");
				else System.out.println("Down!");
				score -= 5;
			}
			else break;
		}
		System.out.println("점수는 " + score + "점 입니다.");
	}

}
