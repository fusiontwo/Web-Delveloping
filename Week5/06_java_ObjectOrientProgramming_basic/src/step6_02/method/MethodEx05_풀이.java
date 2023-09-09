package step6_02.method;

import java.util.Scanner;

class Ex05{

	void test1() {
		int total = 0;
		int i = 1;
		while (i < 6) {
			total += i;
			i++;
		}
		System.out.println(total);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int maxNum = 0;
		int userNum = 0;
		
		for (int i = 1; i < 4; i++) {
			System.out.print(i + "번째 정수를 입력하시오 : ");
			userNum = scan.nextInt();
			if (userNum > maxNum) maxNum = userNum;
		}
		System.out.println("최대값 : " + maxNum);
	}
	
}

public class MethodEx05_풀이 {

	public static void main(String[] args) {

		Ex05 e = new Ex05();
					
		// 문제 1) 1부터 5까지의 합을 출력하는 메서드
		e.test1();
		
		// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
		e.test2();

	}

}
