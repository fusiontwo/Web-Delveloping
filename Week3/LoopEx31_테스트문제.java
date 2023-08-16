package step1_06.loop;

public class LoopEx31_테스트문제 {

	public static void main(String[] args) {
		
//		# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
//		# 답 : 63
		int decimalNum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 9 == 0) decimalNum = i / 10;
			if (decimalNum == 6) {
				System.out.println(i);
				break;
			}
		}
//		
//		# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
//		# 답 149
		for (int i = 150; i > 0; i--) {
			if (i % 8 == 5) {
				System.out.println(i);
				break;
			}
		}
//		
//		# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
//		# 답 6 (54,63,72,81,90,99)
		int cnt = 0;
		for (int i = 50; i <= 100; i++) {
			if (i % 9 == 0) cnt++;
		}
		System.out.println(cnt);
		
//		
//		# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
//		# 답 980
		for (int i = 1000; i > 28; i--) {
			if (i % 28 == 0) {
				System.out.println(i);
				break;
			}
		}
		
//		
//		# 문제5) 8의 배수를 작은수부터 5개 출력
//		# 답 : 0,8,16,24,32
		cnt = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 8 == 0) {
				System.out.print(i + ",");
				cnt++;
			}
			if (cnt == 5) break;
		}

	}

}
