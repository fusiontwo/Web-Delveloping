package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

// 에러 주의 : The type Ex03 is already defined 
// 같은 패키지 내의 동일한 이름의 클래스가 있으면 에러가 남.
class Ex03_연습{
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_풀이 {

	public static void main(String[] args) {
		
		Ex03_연습 e = new Ex03_연습();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int total = 0;
		for(int i =0; i < e.arr.length; i++) {
			total += e.arr[i];
		}
		System.out.println(total);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int sum4Multiply = 0;
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) sum4Multiply += e.arr[i];
		}
		System.out.println(sum4Multiply);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int multiply4Cnt = 0;
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) multiply4Cnt++;
		}
		System.out.println(multiply4Cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int evenCnt = 0;
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 2 == 0) evenCnt++;
		}
		System.out.println(evenCnt);
	}

}
