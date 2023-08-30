package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		int i = 0;
		int randomNum = 0;
//		while (i < 1000) {
//			randomNum = ran.nextInt(4);
//			String temp = words[0];
//			words[0] = words[randomNum];
//			words[randomNum] = temp;
//			i++;
//		}
		int randomNum2 = 0;
		while (i < 1000) {
			randomNum = ran.nextInt(4);
			randomNum2 = ran.nextInt(4);
			String temp = words[randomNum2];
			words[randomNum2] = words[randomNum];
			words[randomNum] = temp;
			i++;
		}
		
		int idx = 0;
		String str = "";
		while (idx < 4) {
			System.out.println("문제 : " + words[idx]);
			System.out.print("입력 : ");
			str = scan.next();
			if (str.equals(words[idx])) idx++;
		}
		System.out.println("게임이 종료되었습니다.");

	}

}
