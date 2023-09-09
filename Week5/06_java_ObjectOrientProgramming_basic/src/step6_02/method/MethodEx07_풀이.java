package step6_02.method;

class Ex07 {
	
	void printEvenOrOdd(int x) {
		if (x % 2 == 1) System.out.println("홀수입니다.");
		else if (x % 2 == 0) System.out.println("짝수입니다.");
	}
	
	void getAvgBetweenValues(int x, int y) {
		int total = 0;
		int cnt = 0;
		for (int i = x; i < y + 1; i++) {
			total += i;
			cnt++;
		}
		double average = (double)total / cnt;
		System.out.println(average);
	}

	void printPrimeNums(int primeNumber) {
		int divideCnt = 0;
		for(int i = 2; i <= primeNumber; i++) {
			divideCnt = 0;
			for(int j = 1; j <= i; j++) {  // 소수 판별을 위해 시작값을 1로 해야 함.
				if (i % j == 0) {
					divideCnt++;
				}
			}
			if (divideCnt == 2) System.out.print(i + " ");	
		}
	}
}

public class MethodEx07_풀이 {

	public static void main(String[] args) {
		

		Ex07 e = new Ex07();
		
		// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
		int num = 19;
		e.printEvenOrOdd(num);

		// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
		int x = 1;
		int y = 10;
		e.getAvgBetweenValues(x, y);

		// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
		int primeNumber = 20;
		e.printPrimeNums(primeNumber);




	}

}
