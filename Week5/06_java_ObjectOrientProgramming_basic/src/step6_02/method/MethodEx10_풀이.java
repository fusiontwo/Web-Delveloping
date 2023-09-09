package step6_02.method;

import java.util.Arrays;

class Ex10 {
	
	int test1(int[] arr) { 
		int multiply4Cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) multiply4Cnt++;
		}
		return multiply4Cnt; 
	}
	int[] test2(int[] arr) {
		int multiply4Cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) multiply4Cnt++;
		}
		int[] saveArr = new int[multiply4Cnt];
		
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				saveArr[idx] = arr[i];
				idx++;
			}
		}
		return saveArr;
	}	
}


public class MethodEx10_풀이 {

	public static void main(String[] args) {
		

		Ex10 e = new Ex10();
		
		int[] arr = {87, 12, 21, 56, 100};
		
		// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
		int cnt = e.test1(arr);
		System.out.println("cnt = " + cnt);
		
		// 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
		int[] temp = e.test2(arr);
		System.out.println(Arrays.toString(temp));



	}

}
