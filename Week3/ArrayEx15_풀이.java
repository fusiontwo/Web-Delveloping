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
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		int temp = 0;
		int randomNum = 0;
		int num1 = 0;
		int num2 = 0;
		boolean isRunning = true;
		int flag = 0;
		
		// 인덱스 0에 있는 값을 다른 랜덤한 인덱스에 있는 값과 바꿈으로서 순서를 섞는다.
		for(int i = 0; i < 1000; i++) {
			temp = front[0];
			randomNum = ran.nextInt(9)+1;
			front[0] = front[randomNum];
			front[randomNum] = temp;
		}
		
		while (isRunning) {
			flag = 0;  // flag를 반드시 한 루프가 돌 때마다 초기화해줘야 함.
			
			System.out.print("front : ");
			for (int i = 0; i < front.length; i++) {
				System.out.print(front[i] + " ");
			}
			System.out.println();
			
			System.out.print("back  : ");
			for (int i = 0; i < back.length; i++) {
				System.out.print(back[i] + " ");
			}
			System.out.println();
			
			System.out.print("입력1 : ");
			num1 = scan.nextInt();
			System.out.print("입력2 : ");
			num2 = scan.nextInt();
			
			if (front[num1] == front[num2]) {
				back[num1] = front[num1];
				back[num2] = front[num2];
			}
			
			for(int i = 0; i < back.length; i++) {
				if (back[i] == 0) flag = 1;
			}
			
			if (flag != 1) {  // flag가 1이 아닌 경우 (back 배열에 0이 전혀 없는 경우)
				System.out.print("front : ");
				for (int i = 0; i < front.length; i++) {
					System.out.print(front[i] + " ");
				}
				System.out.println();
				
				System.out.print("back  : ");
				for (int i = 0; i < back.length; i++) {
					System.out.print(back[i] + " ");
				}
				System.out.println();
				System.out.println("게임이 종료되었습니다.");
				isRunning = false;
			}
			
		}
	
	}
	
}
