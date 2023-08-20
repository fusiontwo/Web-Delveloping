package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */

public class ArrayEx15_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] frontArr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] backArr = new int[10];
		int cnt = 0;
		int num1 = 0;
		int num2 = 0;
		boolean isRunning = true;
		int num;
		
		while (cnt < 1000) {
			int tempRan = ran.nextInt(9) + 1;
			int temp = frontArr[0]; 
			frontArr[0] = frontArr[tempRan];
			frontArr[tempRan] = temp;
			cnt++;
		}
		
		while (isRunning) {
			int flag = 0;
			
			System.out.print("입력1 : ");
			num1 = scan.nextInt();
			System.out.print("입력 2 : ");
			num2 = scan.nextInt();
			
			if (num1 == num2) {
				System.out.println("서로 다른 숫자를 입력하시오.\n");
				continue;
			}
			
			if (frontArr[num1] == frontArr[num2]) {
				backArr[num1] = frontArr[num2];
				backArr[num2] = frontArr[num2]; 
			}
			
			for (int i = 0; i < frontArr.length; i++) {
				System.out.print(frontArr[i] + " ");
			}
			System.out.println();
			
			for (int i = 0; i < backArr.length; i++) {
				System.out.print(backArr[i] + " ");
			}
			System.out.println("\n");
			
			
			for (int j = 0; j < backArr.length; j++) {
				if (backArr[j] == 0) flag = 1;
			}
			
			if (flag != 1) {
				isRunning = false;
				System.out.println("종료되었습니다.");
			}
			
		}

	}
	
}
