package step2_01.array;

// 2023-08-28 16:36 ~ 16:50
import java.util.Scanner;

public class ArrayEx24_테스트문제1_1_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = { 10 , 4 , 5 , 3 , 1 };
		
		// 문제 1) 전체 요소의 합출력
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		
		// 문제 2) 데이터를 입력하면 배열의 인덱스 출력
		// 예) 5 => 2  ,  1 => 4
		int num = 0;
		System.out.print("데이터를 입력하시오 : ");
		num = scan.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) System.out.println("인덱스 : " + i);
		}
		
		// 문제 3) 배열의 인덱스를 입력하면 데이터 출력
		// 예) 2 => 5  , 4 => 1
		int index = 0;
		System.out.print("배열의 인덱스를 입력하시오 : ");
		index = scan.nextInt();
		System.out.println("데이터 : " + a[index]);
		
		// 문제 4) 배열중 가장 큰 데이터 출력 
		// 예) 10
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) max = a[i];
		}
		System.out.println(max);
		
		// 문제 5) 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) cnt += 1;
		}
		System.out.print("홀수의 개수 : ");
		System.out.println(cnt);
		
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0 , 0 , 5 , 3 , 1}
		int[] b = {0 , 0 , 0 , 0 , 0};
		for(int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) b[i] = a[i];
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		// 문제 7)  a의 값중 홀수만 c에 저장(저장위치는 앞에서부터 저장)
		// 예) c => {5, 3, 1, 0, 0}
		int[] c = { 0 , 0 , 0 , 0 , 0 };
		int idx = 0;
		for(int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				c[idx] = a[i];
				idx++;
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();

	}

}
