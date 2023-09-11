package step3_01.arrayAdvanced;

// 2023-09-11 17:30 ~ 18:11
import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자 야구 게임
 * 
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		    strike += 1
 *    숫자만 같고 자리가 틀리면 	ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 7 5 1        : 2b
 * 1 5 6		: 1s
 * 1 3 7        : 1s 2b
 * 2 4 9        : 없음
 * 1 7 3        : 3s  > 게임종료
 * 
 */

public class ArrayEx29_풀이 {
	
	static int strike = 0;
	static int ball = 0;
	
	public static int[] getThreeNums(int[] arr) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("중복되는 숫자는 저장 불가합니다.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자" + (i+1) + " : ");
			arr[i] = scan.nextInt();
		}
		
		return arr;
	}
	
	
	public static void compareComMe(int[] com, int[]me) {
		strike = 0;
		ball = 0;
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < me.length; j++) {
				if(com[i] == me[j]) {
					if (i == j) strike++;
					else if (i != j) ball++;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] com = {1,7,3};
		int[] me  = new int[3];
		
		System.out.println("com : " + Arrays.toString(com));
		while (true) {
			getThreeNums(me);
			System.out.println(Arrays.toString(me));
			compareComMe(com, me);
			System.out.println(strike + "스트라이크");
			System.out.println(ball + "볼");
			if (strike == 3) {
				System.out.println("게임 종료");
				break;
			}
		}
		
	}

}
