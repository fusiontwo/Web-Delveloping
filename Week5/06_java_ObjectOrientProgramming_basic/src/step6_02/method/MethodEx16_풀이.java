package step6_02.method;

// 2023-09-06 18:00 ~ 18:19
// 느낀 점 : 게임 종료 조건을 설정할 때 배열에 0이 있는지 반복문으로 검사하는 방법을 주로 사용했었는데, 
// correctCnt를 사용해보는 것도 좋을 것 같다.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class MemoryGame_연습{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	// 배열 back에 0이 존재하는지 검사하는 방법 대신 correctCnt를 사용하는 방법도 있다.
//	int correctCnt = 0;  
	
	void shuffle() {
		int i = 0;
		int temp = 0;
		int randomNum = 0;
		while (i < 1000) {
			temp = front[0];
			randomNum = ran.nextInt(front.length);
			front[0] = front[randomNum];
			front[randomNum] = temp;
			i++;
		}
		
	}
	
	
	
	void printCard() {
		System.out.println(Arrays.toString(front));
		System.out.println(Arrays.toString(back));
	}
	
	
	
	void choiceCard() {
		int num1 = 0;
		int num2 = 0;
		System.out.print("카드 입력[1~10] : ");
		num1 = scan.nextInt();		
		System.out.print("카드 입력[1~10] : ");
		num2 = scan.nextInt();
		if (front[num1-1] == front[num2-1]) {
			back[num1-1] = front[num1-1];
			back[num2-1] = front[num2-1];
		}
	}
	
	
	
	void run() {
		
		shuffle();
		
		while(true) {
			int zeroExists = 0;
			
			printCard();
			choiceCard();
			
			for (int i = 0; i < back.length; i++) {
				if (back[i] == 0) zeroExists = 1;
			}
			
			if (zeroExists == 0) {
				System.out.println("게임 종료");
				break;
			}
		}
	}
}

public class MethodEx16_풀이 {

	public static void main(String[] args) {

		MemoryGame_연습 mg = new MemoryGame_연습();
		mg.run();

	}

}
