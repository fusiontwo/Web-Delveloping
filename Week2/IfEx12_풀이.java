package step1_05.condition;

// 2023-08-09 20:10 ~ 20:13
import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.print("세 번째 숫자를 입력하세요 : ");
		int num3 = scan.nextInt();
		
		int maxNum = num1;
		if (maxNum < num2) maxNum = num2;
		if (maxNum < num3) maxNum = num3;
		
		System.out.println("3개의 숫자 중 가장 큰 값 : " + maxNum);
		
		scan.close();
	}

}
