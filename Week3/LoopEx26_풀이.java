package step1_06.loop;


/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx26_풀이 {

	public static void main(String[] args) {
		
		int onePlace = 0;
		int decimalPlace = 0;
		
		for (int i = 1; i <= 50; i++) {
			onePlace = i % 10;
			decimalPlace = i / 10;
			if (onePlace == 3 || decimalPlace == 3) System.out.print("짝 ");
			else System.out.print(i + " ");
		}

	}

}
