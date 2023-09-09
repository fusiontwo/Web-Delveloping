package step6_02.method;


class Ex11{
	
	int test1(int[] arr) { 
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total; 
	}
	
	int test2(int[] arr) { 
		int multiply4Sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				multiply4Sum += arr[i];
			}
		}
		return multiply4Sum; 
	}
	
	int test3(int[] arr) { 
		int multiply4Cnt = 0; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) multiply4Cnt++;
		}
		return multiply4Cnt; }
	
	int test4(int[] arr) {
		int evenNumCnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) evenNumCnt++;
		}
		return evenNumCnt; }

}


public class MethodEx11_풀이 {

	public static void main(String[] args) {

		Ex11 e = new Ex11();
		
		int[] arr = {87, 100, 11, 72, 92};

		// 문제 1) arr의 요소들의 전체 합 리턴
		// 정답 1) 362
		int tot = e.test1(arr);
		System.out.println("tot = " + tot);
		
		
		
		// 문제 2) arr의 요소들의 4의 배수의 합 리턴
		// 정답 2) 264
		tot = e.test2(arr);
		System.out.println("tot = " + tot);
		
		
		
		// 문제 3) arr의 요소들의 4의 배수의 개수 리턴
		// 정답 3) 3
		int cnt = e.test3(arr);
		System.out.println("cnt = " + cnt);
		
		
		
		// 문제 4) arr의 요소들의 짝수의 개수 리턴
		// 정답 4) 3
		cnt = e.test4(arr);
		System.out.println("cnt = " + cnt);

	}

}
