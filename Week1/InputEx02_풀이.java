package step1_04.input;

import java.util.Scanner;

// 2023-08-08 20:36 ~ 20:40
// 평소에 if-else문을 주로 쓰는데 삼항 연산자를 연습할 수 있어서 좋았다.
public class InputEx02_풀이 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		// 문제1) 숫자 2개를 입력받아서 합 출력
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println("두 수의 합 : " + (num1 + num2));
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.print("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		System.out.println(number % 2 == 1 ? "true" : "false");
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();
		System.out.println(score >= 60 && score <= 100 ? "true" : "false");
	}
	
}
